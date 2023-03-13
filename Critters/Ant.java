
/* Vihan Dalvi          
   AP CS P1
   Ant Class
*/
package Critters;

import java.awt.*;

public class Ant extends Critter {

   // instance variables

   private boolean walkSouth;
   private Direction[] forTrueValue = { Direction.SOUTH, Direction.EAST, Direction.SOUTH, Direction.EAST };
   private Direction[] forFalseValue = { Direction.NORTH, Direction.EAST, Direction.NORTH, Direction.EAST };
   private int turnNumber;

   // constructor

   public Ant(boolean walkSouth) {
      this.walkSouth = walkSouth;
      this.turnNumber = -1;
   }

   public Color getColor() {
      return Color.RED;
   }

   public boolean eat() {
      return true;
   }

   public Attack fight(String opponent) {
      return Attack.SCRATCH;
   }

   public Direction getMove() {

      if (walkSouth == true) {
         turnNumber++;
         if (turnNumber > 3) {
            turnNumber = 0;
         }
         return forTrueValue[turnNumber];
      } else { // walkSouth == false
         turnNumber++;
         if (turnNumber > 3) {
            turnNumber = 0;
         }
         return forFalseValue[turnNumber];
      }
   }

   public String toString() {
      return "%";
   }

}
