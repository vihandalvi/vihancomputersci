/*
 * Point.java
 * by w p osborne
 * 2/3/2022
 * Period 1
 */
package FirstObjects;

public class Point {
    // Store our data. We store data in instance variables.
    // Your textbook calls these fields. The oollection of
    // values is called state
    private int x;
    private int y;

    // constructor

    // methods - how we get at the data and how we update it.
    // The collection of methods is called behavior.

    // Accessor methods - for retrieving value or operations on
    // those values from the instance variables.
    public int getX() {
        return x; // this is the x of the instance variables
    }

    public int getY() {
        return y;
    }

    public double getDistance(Point other) {
        int deltaX = x - other.getX();
        int deltaY = y - other.getY();

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Mutator methods - for modifying the values in the
    // instance variables.
    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public void translate(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    // toString - returns a String with the data we are
    // willing to share about the object.
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }
}
