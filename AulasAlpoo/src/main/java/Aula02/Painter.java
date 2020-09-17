/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

/**
 *
 * @author Andrey Paceli
 */
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter
{
   public static void main( String args[] )
   { 
      // cria o JFrame
      JFrame application = new JFrame( "A simple paint program" );

      PaintPanel paintPanel = new PaintPanel(); // cria o painel de pintura
      application.add( paintPanel, BorderLayout.CENTER ); // no centro

      // cria um rótulo e o coloca em SOUTH do BorderLayout
      application.add( new JLabel( "Drag the mouse to draw" ), 
         BorderLayout.SOUTH );

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.setSize( 400, 200 ); // configura o tamanho do frame
      application.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe Painter
