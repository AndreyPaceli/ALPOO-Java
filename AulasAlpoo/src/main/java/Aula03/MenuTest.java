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
import javax.swing.JFrame;

public class MenuTest
{
   public static void main(String[] args)
   { 
      MenuFrame menuFrame = new MenuFrame(); 
      menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      menuFrame.setSize(500, 200); 
      menuFrame.setVisible(true);
   } 
} // end class MenuTest
