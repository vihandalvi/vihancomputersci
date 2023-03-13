/*
 * TestPoint.java - runner program for testing the Point class
 * by w p osborne
 * 2/3/2022
 * Period 1
 */
package FirstObjects;

public class TestPoint {
    
    public static void main(String[] args){
        
        // make a Point object and name it p1
        Point p1 = new Point();
        Point p2 = new Point();
        p1.setX(3);
        p1.setY(5);
        
        p2.setX(23);
        p2.setY(-5);
        
        System.out.println(p1.toString());
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println("Value of x is: " + p1.getX());
        
        System.out.println("Distance between p1 and p2 is: " +
                p1.getDistance(p2));
    }
    
}
