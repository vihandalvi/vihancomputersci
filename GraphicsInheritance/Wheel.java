 /*
  * Wheel.java
  * by W P Osborne
  * 3/7/2022
  */
 package GraphicsInheritance;

 import java.awt.*;
 public class Wheel extends Circle{
   
    // instance variables
    private int spokes;
   
    // constructors
    public Wheel(int xLoc, int yLoc, int r, int spokes){
       super(xLoc, yLoc, r);
       this.spokes = spokes;
    }
   
    public Wheel(){
       super();
       spokes = 5;
    }
   
    // methods
    public int getNumberOfSpokes(){
       return spokes;
    }
    public void setNumberOfSpokes(int spokes){
       this.spokes = spokes;
    }
   
    public void draw(Graphics g){
       super.draw(g);
               int xCenter = xPos + radius;
         int yCenter = yPos + radius;
         double angleBetweenSpokes = 360.0/spokes;
         for(int i = 0; i < spokes; i++){
             double angle = i * angleBetweenSpokes;
             angle = Math.toRadians(angle);
             int deltaX = (int)(radius * Math.cos(angle));
             int deltaY = (int)(radius * Math.sin(angle));
             int xEdge = xCenter + deltaX;
             int yEdge = yCenter + deltaY;
             g.drawLine(xCenter, yCenter, xEdge, yEdge);
         }
    }
   
    public String toString(){
       String str = "WHEEL at (" + xPos + "," + yPos + "), radius " + radius +
                    ", spokes " + spokes;
       return str;
    }
 }
 