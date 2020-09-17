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
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener
{
   private String line1 = ""; // primeira linha de textarea
   private String line2 = ""; // segunda linha de textarea
   private String line3 = ""; // terceira linha de textarea
   private JTextArea textArea; // textarea a exibir saída

   // construtor KeyDemoFrame
   public KeyDemoFrame()
   {
      super( "Demonstrating Keystroke Events" );

      textArea = new JTextArea( 10, 15 ); // configura JTextArea
      textArea.setText( "Press any key on the keyboard..." );
      textArea.setEnabled( false ); // desativa textarea
      textArea.setDisabledTextColor( Color.BLACK ); // configura cor de texto
      add( textArea ); // adiciona textarea ao JFrame

      addKeyListener( this ); // permite que o frame processe os eventos de teclado
   } // fim do construtor KeyDemoFrame

   // trata pressionamento de qualquer tecla
   public void keyPressed( KeyEvent event )
   {
      line1 = String.format( "Key pressed: %s", 
         event.getKeyText( event.getKeyCode() )); // gera saída de tecla pressionada
      setLines2and3( event ); // configura a saída das linhas dois e três
   } // fim do método keyPressed

   // trata liberação de qualquer tecla
   public void keyReleased( KeyEvent event )
   {
      line1 = String.format( "Key released: %s",
         event.getKeyText( event.getKeyCode() )); // gera saída de tecla liberada
      setLines2and3( event ); // configura a saída das linhas dois e três
   } // fim do método keyReleased

   // trata pressionamento de uma tecla de ação
   public void keyTyped( KeyEvent event )
   {
      line1 = String.format( "Key typed: %s", event.getKeyChar());
      setLines2and3( event ); // configura a saída das linhas dois e três
   } // fim do método keyTyped

   // configura segunda e terceira linhas de saída
   private void setLines2and3( KeyEvent event )
   {
      line2 = String.format( "This key is %san action key", 
         (event.isActionKey() ? "" : "not " ) );

      String temp = event.getKeyModifiersText( event.getModifiers() );

      line3 = String.format( "Modifier keys pressed: %s", 
         ( temp.equals( "" ) ? "none" : temp ) ); // modificadores de saída

      textArea.setText( String.format( "%s\n%s\n%s\n", 
         line1, line2, line3 ) ); // gera saída de três linhas de texto
   } // fim do método setLines2and3
} // fim da classe KeyDemoFrame
