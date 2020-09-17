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
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PaintPanel extends JPanel 
{
   private int pointCount = 0; // número de contagem de pontos

   // array de 10000 referências java.awt.Point
   private Point points[] = new Point[ 10000 ];

   // configura a GUI e registra handler de evento de mouse
   public PaintPanel()
   {
      // trata evento de movimento de mouse do frame
      addMouseMotionListener(

         new MouseMotionAdapter()// classe interna an�nima
         {  
            // armazena coordenadas de arrastar e repinta
            public void mouseDragged( MouseEvent event )                
            {                                                           
               if ( pointCount < points.length )                        
               {                                                        
                  points[ pointCount ] = event.getPoint(); // localiza o ponto
                  pointCount++; // incrementa número de pontos em array
                  repaint(); // repinta JFrame
               } // fim do if
            } // fim do método mouseDragged
         } // fim da classe interna an�nima
      ); // fim da chamada para addMouseMotionListener
   } // fim do construtor PaintPanel

   // desenha oval em um quadro delimitador de 4x4 no local especificada na janela
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // limpa a área de desenho

      // desenha todos os pontos no array
      for ( int i = 0; i < pointCount; i++ ) {
         g.fillOval( points[ i ].x, points[ i ].y, 10, 10 );
         g.fill3DRect(points[ i ].x, points[ i ].y, 100, 100, true);
         g.setColor(Color.yellow);
      }
   } // fim do método paintComponent
} // fim da classe PaintPanel
