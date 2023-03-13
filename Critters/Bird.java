/* Vihan Dalvi
   AP CS P1
   Bird Class
*/

package Critters;

import java.awt.*;

public class Bird extends Critter {

    // instance variables

    private int turnNumber;
    private Direction[] direction = { Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.EAST, Direction.EAST,
            Direction.EAST, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH, Direction.WEST, Direction.WEST,
            Direction.WEST };

    // constructor

    public Bird() {
        turnNumber = -1;
    }

    public Color getColor() {
        return Color.BLUE;
    }

    public Attack fight(String opponent) {
        if (opponent.equals("%")) {
            return Attack.ROAR;
        }
        return Attack.POUNCE;
    }

    public Direction getMove() {
        turnNumber++;
        if (turnNumber > 11) {
            turnNumber = 0;
        }
        return direction[turnNumber];
    }

    public String toString() {
        if (turnNumber < 3) {
            return ("^");
        } else if (turnNumber < 6) {
            return (">");
        } else if (turnNumber < 9) {
            return ("V");
        }
        return ("<"); // put inside
    }

}
