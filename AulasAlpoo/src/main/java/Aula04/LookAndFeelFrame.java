package Aula04;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class LookAndFeelFrame extends JFrame {

    private final UIManager.LookAndFeelInfo[] looks;
    private final String[] lookNames; // nomes da aparência e do comportamento
    private final JRadioButton[] radio; // para selecionar a aparência e o comportamento
    private final ButtonGroup group; // grupo para botões de rádio
    private final JButton button; // exibe a aparência do botão
    private final JLabel label; // exibe a aparência do rótulo
    private final JComboBox<String> comboBox; // exibe a aparência da caixa de combinação

    // configura a GUI
    public LookAndFeelFrame() {
        super("Look and Feel Demo");

// obtém as informações sobre a aparência e comportamento instaladasÿ
        looks = UIManager.getInstalledLookAndFeels();
        lookNames = new String[looks.length];

        // obtém os nomes das aparências e comportamentos instalados
        for (int i = 0; i < looks.length; i++) {
            lookNames[i] = looks[i].getName();
        }

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(3, 1, 0, 5));

        label = new JLabel("This is a " + lookNames[0] + " look-and-feel",
                SwingConstants.CENTER);
        northPanel.add(label);

        button = new JButton("JButton");
        northPanel.add(button);

        comboBox = new JComboBox<String>(lookNames);
        northPanel.add(comboBox);

        // cria um array para botões de opção
        radio = new JRadioButton[looks.length];

        JPanel southPanel = new JPanel();

        // usa um GridLayout com três botões em cada linha
        int rows = (int) Math.ceil(radio.length / 3.0);
        southPanel.setLayout(new GridLayout(rows, 3));

        group = new ButtonGroup(); // grupo de botões para aparências e comportamentos
        ItemHandler handler = new ItemHandler(); // rotina de tratamento de aparência e comportamento

        for (int count = 0; count < radio.length; count++) {
            radio[count] = new JRadioButton(lookNames[count]);
            radio[count].addItemListener(handler); // adiciona rotina de tratamento
            group.add(radio[count]); // adiciona botão de opções ao grupo
            southPanel.add(radio[count]); // adiciona botão de opções ao painel
        }
        add(northPanel, BorderLayout.NORTH); // adiciona o painel North
        add(southPanel, BorderLayout.SOUTH); // adiciona o painel South

        radio[0].setSelected(true); // configura a seleção padrão
    } // fim do construtor LookAndFeelFrame

    // utiliza UIManager para alterar a aparência e comportamento da GUI
    private void changeTheLookAndFeel(int value) {
        try // muda a aparência e comportamento
        {
// configura a aparência e comportamento para esse aplicativoÿ
            UIManager.setLookAndFeel(looks[value].getClassName());

// atualiza os componentes nesse aplicativoÿ
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    // classe interna private para tratar eventos de botão de opção
    private class ItemHandler implements ItemListener {
        // processa a seleção de aparência e comportamento feita pelo usuário

        @Override
        public void itemStateChanged(ItemEvent event) {
            for (int count = 0; count < radio.length; count++) {
                if (radio[count].isSelected()) {
                    label.setText(String.format(
                            "This is a %s look-and-feel", lookNames[count]));
                    comboBox.setSelectedIndex(count); // configura o índice da caixa de combinação
                    changeTheLookAndFeel(count); // muda a aparência e comportamento
                }
            }
        }
    } // fim da classe interna privada ItemHandler
    public static void main(String[] args)
{
LookAndFeelFrame lookAndFeelFrame = new LookAndFeelFrame();
 lookAndFeelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 lookAndFeelFrame.setSize(400, 220);
 lookAndFeelFrame.setVisible(true);
 }
} // fim da classe LookAndFeelFrame
