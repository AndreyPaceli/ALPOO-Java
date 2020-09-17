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
import javax.swing.JFrame;

public class MouseTracker 
{
   public static void main( String args[] )
   { 
      MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame(); 
      mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      mouseTrackerFrame.setSize( 300, 100 ); // configura o tamanho do frame
      mouseTrackerFrame.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe MouseTracker
