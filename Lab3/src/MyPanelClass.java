import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                        //Draw a border
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1, y1, width+1, height+1);
//                        
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1+4, y1+4, width-8, height-8);
//                        
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1+9, y1+9, width-18, height-18);
//                        
//                        g.setColor(Color.GREEN);
//                        g.drawRect(x1+15, y1+15, width-30, height-30);
//                        
//                        g.setColor(Color.MAGENTA);
//                        g.drawRect(x1+20, y1+20, width-40, height-40);
                        
                        //I might have gone overboard my just a bit...
                        
                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.RED);
//                        g.drawLine(x2, y1, x1, y2);
//                        
//                        g.setColor(Color.GREEN);
//                        g.drawLine(x1+5, y1, x2-5, y2);
//                        
//                        g.setColor(Color.PINK);
//                        g.drawLine(x2+5, y1, x1-5, y2);
                        
                        
                        
//                        g.setColor(Color.PINK);
//
//                        g.fillOval(x2-(width/2)-40, y2-(height/2)-40, 80, 80);
//                        
//                        g.setColor(Color.RED);
//
//                        g.fillOval(x2-(width/2)-27, y2-(height/2)-27, 55, 55);
                        
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        

                        

                        
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1, y1);
                        p4.addPoint(width, y1);
                        p4.addPoint(width, y1 +35);
                        p4.addPoint(x1, y1 +35);
                        g.setColor(Color.RED);
                        g.fillPolygon(p4);
                        
                        
                        Polygon p5 = new Polygon();
                        p5.addPoint(x1, width);
                        p5.addPoint(width, height);
                        p5.addPoint(width, height-35);
                        p5.addPoint(x1, height-35);
                        g.setColor(Color.RED);
                        g.fillPolygon(p5);
                        
                        
                        Polygon p6 = new Polygon();
                        p6.addPoint(x1, y1+(height/2)-20);
                        p6.addPoint(width, y1+(height/2)-20);
                        p6.addPoint(width, y1+(height/2)+20);
                        p6.addPoint(x1, y1+(height/2)+20);
                        g.setColor(Color.RED);
                        g.fillPolygon(p6);
                        
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(x1 + 200, y1 + (height/2));
                        p3.addPoint(x1, height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                        
                        
                        

            }
}