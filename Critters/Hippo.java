/* Vihan Dalvi
   AP CS P1
   Hippo Class
*/

package Critters;

import java.awt.*;
import java.util.Random; // for movement

public class Hippo extends Critter {

   // instance variables

   private int hungerPieces;
   private Random gen;
   private int turnNumber;
   private int directionMaker;

   // constructor

   public Hippo(int hunger) {
      this.hungerPieces = hunger;
      gen = new Random();
      turnNumber = 0;
   }

   public Color getColor() {
      if (hungerPieces > 0) { // the hippo is no longer hungry when hungerTimes is lowered to zero
         return Color.gray;
      } else {
         return Color.white;
      }
   }

   public boolean eat() {
      if (hungerPieces > 0) {
         hungerPieces--; // 1 less hunger desire
         return true;
      } else {
         return false;
      }
   }

   public Attack fight(String opponent) {
      if (hungerPieces > 0) {
         return Attack.SCRATCH;
      } else {
         return Attack.POUNCE;
      }
   }

   public Direction getMove() {
      if (turnNumber == 0) {
         directionMaker = gen.nextInt(4);
      }
      turnNumber++;
      if (turnNumber == 5) {
         turnNumber = 0;
      }
      if (directionMaker == 0) {
         return Direction.NORTH;
      } else if (directionMaker == 1) {
         return Direction.EAST;
      } else if (directionMaker == 2) {
         return Direction.SOUTH;
      } else {
         return Direction.WEST;
      }
   }

   public String toString() {
      return "" + hungerPieces;
   }

}
