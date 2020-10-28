package Aula05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author prof. Célio R. Castelano
 */
public class ConsultaJDBC {

    private static String DRIVER;
    private static String BANCO;
    private static String USUARIO;
    private static String SENHA;
    private static String SQL = "SELECT * FROM products";  

    public ConsultaJDBC() {
        final String SGBD = "MySQL"; 

        switch (SGBD) {
            
            case "MySQL":
                DRIVER = "com.mysql.jdbc.Driver";
                BANCO = "jdbc:mysql://localhost:3306/aula04"; 
                USUARIO = "root"; 
                SENHA = "password"; 
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Banco de dados não possui driver JDBC instalado\n"
                        + "Confira no arquivo pom.xml");
        }
    }

    public static void main(String[] args) {
        ConsultaJDBC consulta = new ConsultaJDBC();
        try {
            // 1) Definir o driver JDBC do banco de dados
            Class.forName(DRIVER);

            // 2) Criar o objeto da classe Connection
            Connection conexao = DriverManager.getConnection(BANCO, USUARIO, SENHA);

            // 3) Criar o objeto da classe Statement (executar comando SQL)
            Statement stm = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            // 4) Criar o objeto da classe ResultSet (armazena o resultado da consulta)
            ResultSet rs = stm.executeQuery(SQL);

            // 5) Exibir todos os registros da consulta (objeto rs = ResultSet)
            System.out.println("ID     NOME             DESCRIÇÃO   PREÇO");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("prod_name");
                String descricao = rs.getString("prod_desc");
                double preco = rs.getDouble("prod_price");

                System.out.println(id + "    " + nome + "    " + descricao + "   " + preco);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Classe de Conexao do Banco. \n" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta SQL. \n" + ex.getMessage());
        }
    }
}