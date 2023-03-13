/*
 * Shape.java - INTERFACE
 * by w p osborne
 * 3/7/2022
 */
package GraphicsInheritance;

import java.awt.*;

public interface Shape {

   public double area();

   public void draw(Graphics g);
   
   public void fill(Graphics g);

   public int getXPos();

   public int getYPos();

   public void move(int xLoc, int yLoc);

   public void stretchBy(int factor);

   public String toString();
}
