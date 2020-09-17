package Aula03;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author Andrey
 */

public class Exercicio01 extends JFrame {
    
        private JLabel lblcod, lblnome, lblprecos, lbllucro, lblprev, lblicms, lbltrib, lblcst,
                lblncm, lbluni, lblmarca , lblcat, lblorigem, lblbarcode, lblcampos;
        private JComboBox cbxmarca, cbxcat, cbxori, cbxuni;
        private JToolBar tbar;
        private JButton btnnovo, btngravar, btndesfaz, btnexcluir, btnpesq, btnsup;
        private JTextField tfnome, tfcod, tfprecos, tflucro, tfprev, tficms, tftrib, tfcst, tfncm, tfbarcode;
        private String[] cbitemmarca = {"Lenovo", "Motorola"};
        private String[] cbitemcat = {"Eletronicos", "Celulares"};
        private String[] cbitemorigem = {"Nacional", "Internacional"};
        private String[] cbitemuni = {"UN", "BR"};
    
    public Exercicio01() {

        setTitle("Cadastramento Rápido de Produtos");
        setPreferredSize(new Dimension(800, 520));
        this.getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        componentes();
        adicionar();
        posicoes();
        
        pack();

    }

    public void componentes() {
        lblcod = new JLabel("Codigo");
        lblnome = new JLabel("Nome");
        lblprecos = new JLabel("Preço Custo");
        lbllucro = new JLabel("Lucro %");
        lblprev = new JLabel("Preço de Venda");
        lblicms = new JLabel("ICMS %");
        lbltrib = new JLabel("Subst. Tributaria");
        lblcst = new JLabel("CST - NFE");
        lblncm = new JLabel("NCM - NFE");
        lbluni = new JLabel("Unidade Medida");
        lblmarca = new JLabel("Marca");
        lblcat = new JLabel("Categoria");
        lblorigem = new JLabel("Origem");
        lblbarcode = new JLabel("Codigo de barras (Passe o produto no leitor) ");
        lblcampos = new JLabel("Campos em vermelho são obrigatórios para emissão NF-e");
        
        cbxmarca = new JComboBox(cbitemmarca);
        cbxcat = new JComboBox(cbitemcat);
        cbxuni = new JComboBox(cbitemuni);
        cbxori = new JComboBox(cbitemorigem);
        
        btnnovo = new JButton("Novo");
        btngravar = new JButton("Gravar");
        btndesfaz = new JButton("Desfazer");
        btnexcluir = new JButton("Exluir");
        btnpesq = new JButton("Pesquisar");
        btnsup = new JButton("Suporte");
        
        tbar = new JToolBar();
        
        tfnome = new JTextField();
        tfcod = new JTextField();
        tfprecos = new JTextField();
        tflucro = new JTextField();
        tfprev = new JTextField();
        tficms = new JTextField();
        tftrib = new JTextField();
        tfcst = new JTextField();
        tfncm = new JTextField();
        tfbarcode = new JTextField();


    }

    public void adicionar() {

        add(lblcod);
        add(lblnome);
        add(lblprecos);
        add(lbllucro);
        add(lblprev);
        add(lblicms);
        add(lblncm);
        add(lbltrib);
        add(lblcst);
        add(lblnome);
        add(lbluni);
        add(lblmarca);
        add(lblcat);
        add(lblorigem);
        add(lblbarcode);
        add(lblcampos);
        
        add(cbxmarca);
        add(cbxcat);
        add(cbxori);
        add(cbxuni);
        
        add(tfnome);
        add(tfcod);
        add(tfprecos);
        add(tflucro);
        add(tfprev);
        add(tficms);
        add(tfncm);
        add(tftrib);
        add(tfcst);
        add(tfnome);
        add(tfbarcode);
        
        add(tbar);
        tbar.add(btnnovo);
        tbar.add(btngravar);
        tbar.add(btndesfaz);
        tbar.add(btnexcluir);
        tbar.add(btnpesq);
        tbar.add(btnsup);

    }

    private void posicoes() {
        // (para os lados, movimenta cimabaixo, tamanho, 
        
        tbar.setBounds(0, 0, 800, 80);
        
        btnnovo.setBounds(15, 25, 100, 25);
        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mais.png")));
        /**btnnovo.setMargin(new Insets(0, 0, 0, 0));
        btnnovo.setBorder(null);
        btnnovo.setOpaque(false);
        btnnovo.setContentAreaFilled(false);
        btnnovo.setBorderPainted(false);*/
        
                
        btngravar.setBounds(125, 25, 100, 25);
        btngravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cd.png")));
        /**btngravar.setMargin(new Insets(0, 0, 0, 0));
        btngravar.setBorder(null);
        btngravar.setOpaque(false);
        btngravar.setContentAreaFilled(false);
        btngravar.setBorderPainted(false);*/
        
        btndesfaz.setBounds(235, 25, 100, 25);
        btndesfaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desfazer.png")));
        /**btndesfaz.setMargin(new Insets(0, 0, 0, 0));
        btndesfaz.setBorder(null);
        btndesfaz.setOpaque(false);
        btndesfaz.setContentAreaFilled(false);
        btndesfaz.setBorderPainted(false);*/
        
        btnexcluir.setBounds(345, 25, 100, 25);
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excluir.png")));
       /** btnexcluir.setMargin(new Insets(0, 0, 0, 0));
        btnexcluir.setBorder(null);
        btnexcluir.setOpaque(false);
        btnexcluir.setContentAreaFilled(false);
        btnexcluir.setBorderPainted(false);*/
        
        btnpesq.setBounds(455, 25, 100, 25);
        btnpesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurar.png")));
        /**btnpesq.setMargin(new Insets(0, 0, 0, 0));
        btnpesq.setBorder(null);
        btnpesq.setOpaque(false);
        btnpesq.setContentAreaFilled(false);
        btnpesq.setBorderPainted(false);*/
        
        btnsup.setBounds(565, 25, 100, 25);
        btnsup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pergunta.png")));
        /**btnsup.setMargin(new Insets(0, 0, 0, 0));
        btnsup.setBorder(null);
        btnsup.setOpaque(false);
        btnsup.setContentAreaFilled(false);
        btnsup.setBorderPainted(false);*/
        
        lblcod.setBounds(15, 100, 100, 25);
        tfcod.setBounds(15, 120, 180, 25);
        tfcod.setBackground(new java.awt.Color(255, 255, 0));
        lblcod.setForeground(new java.awt.Color(0, 0, 139));
        
        lblnome.setBounds(15, 160, 100, 25);
        tfnome.setBounds(15, 180, 490, 25);
        lblnome.setForeground(new java.awt.Color(139, 0,0));
        
        lblprecos.setBounds(15, 220, 100, 25);
        tfprecos.setBounds(15, 240, 150, 25);
        lblprecos.setForeground(new java.awt.Color(0, 0, 139));
        tfprecos.setBackground(new java.awt.Color(180, 238, 180));
        
        lbllucro.setBounds(185, 220, 100, 25);
        tflucro.setBounds(185, 240, 150, 25);
        lbllucro.setForeground(new java.awt.Color(0, 0, 139));
        
        lblprev.setBounds(355, 220, 100, 25);
        tfprev.setBounds(355, 240, 150, 25);
        tfprev.setBackground(new java.awt.Color(180, 238, 180));
        
        lblicms.setBounds(15, 280, 100, 25);
        tficms.setBounds(15, 300, 100, 25);
        lblicms.setForeground(new java.awt.Color(0, 0, 139));
        
        lbltrib.setBounds(135, 280, 100, 25);
        tftrib.setBounds(135, 300, 100, 25);
        lbltrib.setForeground(new java.awt.Color(0, 0, 139));
        
        lblcst.setBounds(255, 280, 100, 25);
        tfcst.setBounds(255, 300, 100, 25);
        lblcst.setForeground(new java.awt.Color(0, 0, 139));
        
        lblncm.setBounds(375, 280, 100, 25);
        tfncm.setBounds(375, 300, 130, 25);
        lblncm.setForeground(new java.awt.Color(139, 0,0));
        
        lbluni.setBounds(515, 280, 100, 25);
        cbxuni.setBounds(515, 299, 100, 25);
        lbluni.setForeground(new java.awt.Color(139, 0,0));
        
        lblmarca.setBounds(15, 340, 100, 25);
        cbxmarca.setBounds(15, 360, 280, 25);
        lblmarca.setForeground(new java.awt.Color(0, 0, 139));
        
        lblcat.setBounds(335, 340, 100, 25);
        cbxcat.setBounds(335, 360, 250, 25);
        lblcat.setForeground(new java.awt.Color(0, 0, 139));
        
        lblorigem.setBounds(15, 400, 100, 25);
        cbxori.setBounds(15, 420, 300, 25);
        lblorigem.setForeground(new java.awt.Color(139, 0,0));
        
        lblbarcode.setBounds(335, 400, 300, 25);
        tfbarcode.setBounds(335, 420, 280, 25);
        
        lblcampos.setBounds(300, 460, 400, 25);
        lblcampos.setForeground(Color.RED);
        

    }

    public static void main(String[] args) {
        Exercicio01 obj = new Exercicio01();
    }

}
