import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
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
                        g.setColor(Color.ORANGE);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                        //Draw a border
//                        g.setColor(Color.CYAN);
//                        g.drawRect(x1, y1, width, height);
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
                        
                        
                        
                        g.setColor(Color.PINK);
                        //g.fillOval(x1, y1, width, height);
                        g.fillOval(x2-(width/2)-40, y2-(height/2)-40, 80, 80);
                        
                        g.setColor(Color.RED);
                        //g.fillOval(x1, y1, width, height);
                        g.fillOval(x2-(width/2)-27, y2-(height/2)-27, 55, 55);
                        
            }
}