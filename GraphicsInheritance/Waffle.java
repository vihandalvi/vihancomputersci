/*
 * Waffle.java
 * by w p osborne
 * 3/7/2022
 */
package GraphicsInheritance;

import java.awt.*;

public class Waffle extends Rect {

   // instance variables
   // MISSING INSTANCE VARIABLES. DO NOT DUPLICATE THOSE FOUND IN Rect
   protected int rows = 0;
   protected int cols = 0;

   // constructors
   public Waffle(int xLoc, int yLoc, int width, int height, int rows, int cols) {
      // MISSING CODE. BE SURE TO USE Super AS THE FIRST LINE
      super(xLoc, yLoc, width, height);
      this.rows = rows;
      this.cols = cols;
   }

   public Waffle() {
      super();
      rows = 2;
      cols = 2;
   }

   // Methods
   public int getRows() {
      return rows;
   }

   public void setRows(int rows) {
      this.rows = rows;
   }

   public int getCols() {
      return cols;
   }

   public void setCols(int cols) {
      this.cols = cols;
   }

   public void draw(Graphics g) {
      super.draw(g);
      // MISSING CODE - PROVIDE THE CODE TO DRAW THE HORIZONTAL AND VERTICAL LINES.
      // draw horizontal lines
      for (int i = 1; i < rows; i++) {
         int x = xPos;
         int y = yPos + i * (height / rows);
         g.drawLine(x, y, x + width, y);
      }

      // draw vertical lines
      for (int i = 1; i < cols; i++) {
         int y = yPos;
         int x = xPos + i * (width / cols);
         g.drawLine(x, y, x, y + height);
      }

   }

   public String toString() {
      String str = "WAFFLE at (" + xPos + "," + yPos + "), width ";
      str += width + ", height " + height + ", rows " + rows;
      str += ", cols " + cols;
      return str;
   }
}
