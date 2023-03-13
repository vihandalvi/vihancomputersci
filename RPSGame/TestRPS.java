/* 
Vihan Dalvi
Rock Paper Scissors Assignment
Test PART
Period 1
*/

package RPSGame;

public class TestRPS {

   public static void main(String[] args) {

      // assigning

      RPSPlayer Contestant1 = new RPSPlayer("Vihan");
      RPSPlayer Contestant2 = new RPSPlayer("Vivek");

      int response1 = -1;
      int response2 = -1;
      int checkForTie = -1;

      while (checkForTie != 0) {

         response1 = Contestant1.getChoice();
         response2 = Contestant2.getChoice();

         // shows what the contestants chose
         System.out.println(Contestant1.getName() + " - chooses " + GetContestantChoice(response1));
         System.out.println(Contestant2.getName() + " - chooses " + GetContestantChoice(response2));

         // game ending scenarios
         if (response1 == response2) {
            Contestant2.incrementTies();
            Contestant1.incrementTies();
            System.out.println("Tie, so play again");
            System.out.println();
         }

         if ((response1 == 0 && response2 == 2) || (response1 == 1 && response2 == 0)
               || (response1 == 2 && response2 == 1)) {
            checkForTie = 0;
            Contestant1.incrementWins();
            Contestant2.incrementLosses();
            System.out.println(Contestant1.getName() + " wins!");
            System.out.println();
            System.out.println(Contestant1.toString());
            System.out.println(Contestant2.toString());
         }

         if ((response1 == 0 && response2 == 1) || (response1 == 1 && response2 == 2)
               || (response1 == 2 && response2 == 0)) {
            checkForTie = 0;
            Contestant2.incrementWins();
            Contestant1.incrementLosses();
            System.out.println(Contestant2.getName() + " wins!");
            System.out.println();
            System.out.println(Contestant1.toString());
            System.out.println(Contestant2.toString());
         }
      }
   }

   public static String GetContestantChoice(int choice) {
      if (choice == 0) {
         return "ROCK";
      } else if (choice == 1) {
         return "PAPER";
      } else if (choice == 2) {
         return "SCISSORS";
      }
      return "";
   }

}