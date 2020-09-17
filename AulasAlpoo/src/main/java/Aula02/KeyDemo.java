package Aula02;

// Fig. 11.37: KeyDemo.java
// Testando KeyDemoFrame.
import javax.swing.JFrame;

public class KeyDemo 
{
   public static void main( String args[] )
   { 
      KeyDemoFrame keyDemoFrame = new KeyDemoFrame(); 
      keyDemoFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      keyDemoFrame.setSize( 350, 100 ); // configura o tamanho do frame
      keyDemoFrame.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe KeyDemo