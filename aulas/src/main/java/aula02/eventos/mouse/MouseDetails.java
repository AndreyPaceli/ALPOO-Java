package aula02.eventos.mouse;

// Fig. 11.32: MouseDetails.java
// Testando MouseDetailsFrame.
import javax.swing.JFrame;

public class MouseDetails
{
   public static void main( String args[] )
   { 
      MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame(); 
      mouseDetailsFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      mouseDetailsFrame.setSize( 400, 150 ); // configura o tamanho do frame
      mouseDetailsFrame.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe MouseDetails


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/