/*
 * GameOf21.java
 * by w p osborne
 * 2/13/2022
 */

/*
The goal of the game is to for the player and computer to see who can come 
closest to a value of 21 without going over. Exceeding a total of 21 is an
instant loss.

Ties are awarded as a win to the computer.

The play process is:
   1. The computer draws two cards for itself, calculates the total of their
      face values, and displays the cards and total. 
      IMPORTANT: if these two cards total 21 the computer automatically wins.
   2. The player is given two cards and their total. The player can then ask 
      for additional cards, one at a time, in an effort to exceed the total
      of the computer's first two cards without going over. 
      IMPORTANT: If the player goes over 21 the player loses instantly.
   3. After the player stops drawing cards and if the player hasn't gone
      over a total of 21 the computer draws cards in an effort to equal or
      exceeed the player's total. If the computer is successful, it wins. If
      it goes over 21 in the effort, it loses.

Calculating totals:
   Each card has the face value returned by the card objects getFaceValueAsInt()
   method with the following exceptions:
   1. An Ace is either a 1 or 11, depending on which gives the higher total
      without that total exceeding 21.
   2. Face cards (Jack, Queen, and King) have a value of 10, regardless of
      what the getFaceValueAsInt() method returns.

Finishing the session:
After the player chooses to stop playing the program prints the number of 
wins and the number of games played. It then thanks the user.
*/

///// PACKAGE STATEMENT - Be sure to comment out if using jGrasp or change
// to correct package if using NetBeans.
package Cards;

import java.util.Scanner;

public class GameOf21 {
   // class constants
   private static final boolean WIN = true;
   private static final boolean LOSE = false;

   public static void main(String[] args) {
      // create a card deck
      CardDeck deck = new CardDeck();
      // Scanner for keyboard
      Scanner kb = new Scanner(System.in);
      // counters
      int gamesTotal = 0;
      int gamesWon = 0;

      char mainMenuSelection;

      do {
         System.out.println();
         System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
         System.out.println("Would you like to play a game?");
         mainMenuSelection = getMenuSelection("Enter Y for yes, N for no:",
               "YN", kb);
         if (mainMenuSelection == 'Y') {
            gamesTotal++;
            if (playGame(kb, deck)) {
               System.out.println("CONGRATULATIONS! You won that game.");
               gamesWon++;
            } else {
               System.out.println("SORRY but you lost that game.");
            }
         }
      } while (mainMenuSelection != 'N');
      System.out.println("\nYou won " + gamesWon + " games out of " + gamesTotal);
      System.out.println("Thanks for playing.");
   }

   public static boolean playGame(Scanner kb, CardDeck deck) {
      Hand computerHand = new Hand();

      computerHand.addCard(getACard(deck));
      computerHand.addCard(getACard(deck));
      int computerTotal = computerHand.getTotalForGameOf21();

      System.out.println();
      printHand("Computer's first two cards:", computerHand);

      // If computer's first two cards total 21 computer automatically
      // wins, since the best the player can do is tie.
      if (computerTotal == 21) {
         return LOSE;
      }

      int playerTotal = playerDraws(kb, deck);
      if (playerTotal <= 21) {
         computerTotal = computerDraws(playerTotal, computerTotal,
               computerHand, deck);
         if (computerTotal <= 21 && computerTotal >= playerTotal) {
            return LOSE;
         }
      } else {
         return LOSE;
      }
      return WIN;
   }

   public static int playerDraws(Scanner kb, CardDeck deck) {
      // ArrayList<Card> hand = new ArrayList<Card>();
      Hand hand = new Hand();

      // draw first two cards
      hand.addCard(getACard(deck));
      hand.addCard(getACard(deck));

      // evaluate hand
      int handTotal = hand.getTotalForGameOf21();

      // print hand
      printHand("Player's Hand:", hand);

      char selection;
      do {
         System.out.println("Another card? ");
         selection = getMenuSelection("Enter Y or N: ", "YN", kb);
         if (selection == 'Y') {
            hand.addCard(getACard(deck));
            handTotal = hand.getTotalForGameOf21();
            printHand("Player's Hand:", hand);
         }
      } while (selection != 'N' && handTotal < 21);

      return handTotal;
   }

   public static int computerDraws(int playerTotal, int computerTotal,
         Hand hand, CardDeck deck) {

      int handTotal = computerTotal;
      while (handTotal < playerTotal) {
         hand.addCard(getACard(deck));
         handTotal = hand.getTotalForGameOf21();
      }
      printHand("Computer hand:", hand);
      return handTotal;
   }

   public static void printHand(String title, Hand hand) {
      int total = hand.getTotalForGameOf21();
      System.out.println();
      System.out.println(title);
      for (Card c : hand.getList()) {
         System.out.println(c);
      }
      System.out.println("Hand total: " + total);
      System.out.println();
   }

   public static char getMenuSelection(String message, String choices,
         Scanner kb) {
      String entry;
      char returnChar;

      do {
         System.out.print(message + " ");
         entry = kb.next();
         entry = entry.toUpperCase();
         returnChar = entry.charAt(0);
      } while (!checkSelection(choices, returnChar));

      return returnChar;
   }

   public static boolean checkSelection(String choices, char targetChar) {
      return choices.indexOf(targetChar) != -1;
   }

   public static Card getACard(CardDeck deck) {
      if (deck.getNumberOfCardsDrawn() >= 52) {
         System.out.println("Now drawing from a new deck.");
         deck.resetDeck();
      }
      return deck.drawACard();
   }
}
