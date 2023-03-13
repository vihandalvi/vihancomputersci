/* Vihan Dalvi          
   AP CS P1
   Ant Class
*/

package Critters;

import java.util.Random;
import java.awt.*;
import java.time.*;

public class Husky extends Critter {

    private Direction[][] movement = {
            { Direction.NORTH, Direction.NORTH, Direction.NORTH, Direction.SOUTH, Direction.SOUTH, Direction.SOUTH },
            { Direction.EAST, Direction.EAST, Direction.EAST, Direction.WEST, Direction.WEST, Direction.WEST } };

    private Random gen;
    private int randomnum;
    private Breed breed;
    private int hungerPieces;
    private int dirrow;
    private int turnNumber;

    public Husky() {
        gen = new Random();
        randomnum = gen.nextInt(3);
        turnNumber = -1;
        dirrow = gen.nextInt(2);
        if (randomnum == 0) {
            breed = Breed.ALASKAN;
            hungerPieces = 3;
        }
        if (randomnum == 1) {
            breed = Breed.SIBERIAN;
            hungerPieces = 5;
        }
        if (randomnum == 2) {
            breed = Breed.SAMOYED;
            hungerPieces = 7;
        }
    }

    public Color getColor() {
        if (breed == Breed.ALASKAN) {
            return Color.GRAY;

        } else if (breed == Breed.SAMOYED) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    // different breeds get hungry at different times
    public boolean eat() {
        LocalTime time = LocalTime.now();
        if (breed == Breed.ALASKAN) {
            // hungry between noon-12:59PM and 7-7:59 PM
            if ((time.getHour() == 12 || time.getHour() == 19) && (hungerPieces > 0)) {
                hungerPieces--;
                return true;
            }
        } else if (breed == Breed.SAMOYED) {
            if ((time.getHour() == 11 || time.getHour() == 20) && (hungerPieces > 0)) {
                hungerPieces--;
                return true;
            }
        } else {
            if ((time.getHour() == 13 || time.getHour() == 21) && (hungerPieces > 0)) {
                hungerPieces--;
                return true;
            }
        }
        return false;
    }

    // they are all figers but they fight different way
    public Attack fight(String opponent) {
        if (breed == Breed.ALASKAN) {
            return Attack.POUNCE;

        } else if (breed == Breed.SAMOYED) {
            return Attack.SCRATCH;
        } else {
            return Attack.ROAR;
        }
    }

    // all huskies walk around the house so i chose behavior that is same as
    public Direction getMove() {

        if (breed == Breed.ALASKAN) {
            turnNumber++;
            if (turnNumber > 5) {
                turnNumber = 0;
            }
            return movement[dirrow][turnNumber];
        } else if (breed == Breed.SAMOYED) {
            turnNumber = turnNumber + 2;
            if (turnNumber > 5) {
                turnNumber = 0;
            }
            return movement[dirrow][turnNumber];
        } else {
            turnNumber = turnNumber + 3;
            if (turnNumber > 5) {
                turnNumber = 0;
            }
            return movement[dirrow][turnNumber];
        }
    }

    public String toString() {
        if (breed == Breed.ALASKAN) {
            return "H";

        } else if (breed == Breed.SAMOYED) {
            return "H";
        } else {
            return "H";
        }
    }

    // constants for fighting
    public static enum Breed {
        ALASKAN, SIBERIAN, SAMOYED
    };

}