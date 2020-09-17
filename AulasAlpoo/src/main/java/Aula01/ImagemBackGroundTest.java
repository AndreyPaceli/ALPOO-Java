package aula01;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author prof. Célio R. Castelano
 */
public class ImagemBackGroundTest extends JFrame {

    public ImagemBackGroundTest() {
        this.setTitle("Exemplo de JFrame com JPanel e imagem de fundo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1280, 1024));
        this.setVisible(true);
        this.pack();
    }

    private void carregarImagem(String imagem) {
        JPanel painel = new JPanel();
        ImageIcon img = new ImageIcon(getClass().getResource( imagem ));
        painel.add(new JLabel(img));
        
        this.add(painel);
    }

    public static void main(String[] args) {
        ImagemBackGroundTest obj = new ImagemBackGroundTest();
        obj.carregarImagem("/imagens/timao1.jpg");
        obj.pack();
    }
}