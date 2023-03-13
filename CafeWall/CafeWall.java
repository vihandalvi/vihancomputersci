
package CafeWall;
import java.awt.*;

public class CafeWall {
    //mortar width
    public static final int MORTAR = 2;

    public static void main(String[] args) {

        System.out.println("Hello");
        DrawingPanel panel  = new DrawingPanel(650, 400);
        panel.setBackground(Color.gray);
        Graphics g = panel.getGraphics();
       
        //Test
       // DrawPair(g, 20, 0, 0);
       // DrawRowRectangles(g, 5, 20, 0, 50);
  
        /*
        //upper left row
        DrawRowRectangles(g, 4, 20, 0, 0);
        //mid left row
        DrawRowRectangles(g, 5, 30, 50, 70);
        //lower left grid
        DrawGrid(g, 8, 4, 25, 10, 150, 0);
        //lower middle grid
        DrawGrid(g, 6, 3, 25, 250, 200, 10);
        //lower right grid
        DrawGrid(g, 10, 5, 20, 425, 180, 10);
        //upper right grid
        DrawGrid(g, 4, 2, 35, 400, 20, 35);
        

        */

        DrawGrid(g, 4, 2, 35, 400, 20, 35);
    }

    //Draws grid
    public static void DrawGrid(Graphics g, int rows, int pairs, int size, int TopX, int TopY, int offset){

        //draw rows without offset
        int X = TopX;
        int Y = TopY;
        for (int i = 0; i < rows; i= i+2)
        {
            DrawRowRectangles(g, pairs, size, X, Y);
            Y = Y + 2*size + 2*MORTAR;
        }
        
        //draw rows with offset
        X = TopX + offset;
        Y = TopY + size + MORTAR;
        for (int i = 1; i < rows; i= i+2)
        {
            DrawRowRectangles(g, pairs, size, X, Y);
            Y = Y + 2*size + 2*MORTAR;
        }
    }


    //draws singlerow
    public static void DrawRowRectangles(Graphics g, int pairs, int size, int TopX, int TopY ){
        for (int i = 0; i < pairs; i++)
        {
            DrawPair(g, size, TopX, TopY);
            TopX = TopX + 2*size;
        }
    }

    //draws one pair of squares
    public static void DrawPair(Graphics g, int size, int topX, int topY) {

        g.setColor(Color.black);
        g.drawRect(topX, topY, size, size);
        g.fillRect(topX, topY, size, size);
        g.setColor(Color.blue);
        g.drawLine(topX,topY, topX + size, topY + size);
        g.drawLine(topX, topY + size, topX+size, topY);
        g.setColor(Color.black);
        g.drawRect(topX +size, topY, size, size);
        g.setColor(Color.white);
        g.fillRect(topX+size, topY, size, size);
        
    }

    public static double compoundInterest(double p, double r, int y)
    {
        double interest = 0;
        for(int years = 1; years<=y; years++)
        {
            interest = interest + (r/100)*p;
            p = p + interest;
        }
        return interest;
    }
        
}
