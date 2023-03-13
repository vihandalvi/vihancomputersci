/*
 * TestShape.java
 * by w p osborne
 * 3/7/2022
 */
package GraphicsInheritance;

import java.awt.*;

public class TestShape {

   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(640, 480);
      Graphics g = panel.getGraphics();

      Circle c1 = new Circle(10, 10, 200);
      g.setColor(Color.red);
      c1.fill(g);

      System.out.println("Circle c1: " + c1);

      Shape s1 = new Circle(20, 20, 190);
      g.setColor(Color.white);
      s1.fill(g);
      System.out.println("Shape s1: " + s1);

      g.setColor(Color.black);
      Waffle wf1 = new Waffle(320, 240, 200, 100, 6, 6);
      wf1.draw(g);
      System.out.println(wf1);

      Wheel w1 = new Wheel(30, 30, 180, 7);
      g.setColor(Color.black);
      w1.draw(g);
      System.out.println("Shape w1: " + w1);

      Rect r1 = new Rect(100, 150, 175, 90);
      g.setColor(Color.blue);
      r1.fill(g);
      System.out.println(r1);
   }
}
