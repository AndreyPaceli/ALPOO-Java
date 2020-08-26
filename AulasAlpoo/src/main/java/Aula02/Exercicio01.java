package Aula02;

import java.awt.*;
import javax.swing.*;

public class Exercicio01 extends JFrame {

    private JLabel lblTitulo, lblRA, lblSenha, lblNome, lblMateria;
    private JTextField edtRA, edtNome, edtSenha;
    private JComboBox boxMateria;
    private JButton btnGravar, btnSair;
    private String[] boxMateriaItens = {"Java","Matemarica", "Banco", "C"};

    public Exercicio01() {

        //ajuste do tamanho e layout
        setTitle("Exercicio da Aula de 25/08/2020");

        setPreferredSize(new Dimension(500, 300));
        
        setLayout(null); 
        
        CriarComponentes(); 

        AdicionarComponentes(); 

        ConfigurarPosicoes(); 

        pack(); 

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void CriarComponentes() {

        lblTitulo = new JLabel("Exercicio da Aula de 25/08/2020");
        edtRA = new JTextField(5);
        edtNome = new JTextField(5);
        edtSenha = new JTextField(5);
        lblRA = new JLabel("R.A.");
        lblSenha = new JLabel("Senha");
        lblNome = new JLabel("Nome");
        lblMateria = new JLabel("Materia");
        boxMateria = new JComboBox(boxMateriaItens);
        btnGravar = new JButton("Gravar");
        btnSair = new JButton("Sair");

    }

    public void AdicionarComponentes() {

        add(lblTitulo);
        add(edtRA);
        add(edtNome);
        add(edtSenha);
        
        add(lblRA);
        add(lblSenha);
        add(lblNome);
        
        add(lblMateria);
        add(boxMateria);
        
        add(btnGravar);
        add(btnSair);
    }

    private void ConfigurarPosicoes() {

        lblTitulo.setBounds(115, 15, 225, 20);
        
        lblRA.setBounds(20, 55, 100, 25);
        lblNome.setBounds(10, 90, 100, 25);
        lblSenha.setBounds(10, 125, 100, 25);
        lblMateria.setBounds(5, 165, 65, 25);
        
        edtRA.setBounds(55, 55, 375, 25);
        edtNome.setBounds(55, 90, 375, 25);
        edtSenha.setBounds(55, 125, 375, 25);
        
        boxMateria.setBounds(55, 165, 150, 25);
        
        btnGravar.setBounds(100, 210, 100, 25);
        btnSair.setBounds(260, 210, 100, 25);
    }

    public static void main(String[] args) {

        Exercicio01 objeto = new Exercicio01();
    }
}
