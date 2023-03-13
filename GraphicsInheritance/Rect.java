/*
 * Rect.java
 * by w p osborne
 * 3/7/2022
 */
package GraphicsInheritance;

import java.awt.*;

public class Rect implements Shape {
   // instance variables
   protected int xPos, yPos, width, height;

   // constructors
   public Rect(int xLoc, int yLoc, int w, int h) {
      xPos = xLoc;
      yPos = yLoc;
      width = w;
      height = h;
   }

   public Rect() {
      this(10, 10, 150, 100);
   }

   // methods only for Rect class

   public int getWidth() {
      return width;
   }

   public void setWidth(int w) {
      width = w;
   }

   public int getHeight() {
      return height;
   }

   public void setHeight(int h) {
      height = h;
   }

   // METHODS NEEDED TO SATISFY THE SHAPE INTERFACE GO HERE

   public double area() {
      return (double) width * height;
   }

   public void draw(Graphics g) {
      g.drawRect(xPos, yPos, width, height);
   }

   public void fill(Graphics g) {
      g.fillRect(xPos, yPos, width, height);
   }

   public int getXPos() {
      return xPos;
   }

   public int getYPos() {
      return yPos;
   }

   public void move(int xLoc, int yLoc) {
      xPos = xLoc;
      yPos = yLoc;
   }

   public void stretchBy(int factor) {
      width = width * factor;
      height = height * factor;
   }

   public String toString() {
      String str = "RECTANGLE at (" + xPos + "," + yPos + "), width " +
            width + ", height " + height;
      return str;
   }
}
