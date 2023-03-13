/* 
Vihan Dalvi
Rock Paper Scissors Assignment
Class PART
Period 1
*/

package RPSGame;

import java.util.Random;

public class RPSPlayer {

   // instance variables
   private Random gen;
   private String name;
   private int wins;
   private int losses;
   private int ties;

   // constructor

   public RPSPlayer(String name) {
      gen = new Random();
      this.name = name;
      wins = 0;
      losses = 0;
      ties = 0;
   }

   // methods

   public String getName() {
      return name;
   }

   public int getWins() {
      return wins;
   }

   public int getLosses() {
      return losses;
   }

   public int getTies() {
      return ties;
   }

   public void incrementWins() {
      wins++;
   }

   public void incrementLosses() {
      losses++;
   }

   public void incrementTies() {
      ties++;
   }

   public void reset() {
      wins = 0;
      losses = 0;
      ties = 0;
   }

   public int getChoice() {
      return gen.nextInt(3);
   }

   public String toString() {
      return (name + ": wins = " + wins + ", losses = " + losses + ", ties = " + ties);
   }

}