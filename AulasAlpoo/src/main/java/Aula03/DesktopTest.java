/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

/**
 *
 * @author Andrey Paceli
 */
// Fig. 22.12: DesktopTest.java
// Demonstrando JDesktopPane
import java.awt.Dimension;
import javax.swing.JFrame;

public class DesktopTest 
{
   public static void main( String args[] )
   { 
      DesktopFrame desktopFrame = new DesktopFrame();  
      desktopFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      desktopFrame.setPreferredSize(new Dimension( 600, 480 )); // configura o tamanho do frame
      desktopFrame.setVisible( true ); // exibe o frame
      desktopFrame.pack();
   } // fim de main
} // fim da classe DesktopTest
