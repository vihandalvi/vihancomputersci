/*
 * Circle.java
 * by w p osborne
 * 3/7/2022
 */
package GraphicsInheritance;

import java.awt.*;

public class Circle implements Shape {

   // instance variables
   protected int xPos, yPos;
   protected int radius;

   // Constructors
   public Circle() {
      xPos = 10;
      yPos = 10;
      radius = 100;
   }

   public Circle(int xLoc, int yLoc, int r) {
      xPos = xLoc;
      yPos = yLoc;
      radius = r;
   }

   // Public methods
   public void setXPos(int xLoc) {
      xPos = xLoc;
   }

   public void setYPos(int yLoc) {
      xPos = yLoc;
   }

   public int getRadius() {
      return radius;
   }

   public void setRadius(int r) {
      radius = r;
   }

   // methods inherited from Shape interface
   public double area() {
      return Math.PI * radius * radius;
   }

   public void draw(Graphics g) {
      // double side = 2.0 * Math.PI * radius / 120.0;
      g.drawOval(xPos, yPos, radius * 2, radius * 2);
   }

   public void fill(Graphics g) {
      // double side = 2.0 * Math.PI * radius / 120.0;
      g.fillOval(xPos, yPos, radius * 2, radius * 2);
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
      radius *= factor;
   }

   public String toString() {
      String str = "CIRCLE at (" + xPos + "," + yPos + ") radius " + radius;
      return str;
   }
}
