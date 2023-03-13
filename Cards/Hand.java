/*
 * Hand.java
 * Vihan Dalvi
 * 02/27/2022
 * Period 1
 */

// delete next line if using jGrasp. Else, modify to reflect the correct package.
package Cards;

import java.util.ArrayList;

public class Hand {
   // instance variables
   private ArrayList<Card> hand;

   // Constructor
   public Hand() {
      hand = new ArrayList<Card>();
   }

   // Mutators
   // mutator - add a car
   public void addCard(Card c) {
      hand.add(c);
   }

   // mutator - remove a card. Return true if
   // successful, else false. Make certain the card is
   // in the hand before attempting to remove it.
   public boolean removeCard(Card c) {
      if (hand.contains(c)) {
         hand.remove(c);
         return true;
      }
      return false;
   }

   // Accessors
   // int get number of cards.
   public int getNumberOfCards() {
      return hand.size();
   }

   // calculate and return the value of the hand in scoring for
   // game of 21. Face cards have a value of 10. An ace is 1 or 11,
   // depending on which brings the total closer to or equal to 21
   // without going over. Examples:
   // an Ace with a Queen totals 21.
   // an Ace with a Jack and a 7 totals 18.
   //
   // NOTE: This method will be longer than the others in this class.

   public int getTotalForGameOf21() {
      // PART A: Your code goes here
      int sum = 0;
      int tester = 0;
      int card_value = 0;

      for (Card c : hand) {
         tester = c.getFaceValueAsInt();
         if (tester > 10) {
            card_value = 10;
         }
         if (tester < 10 && tester > 1) {
            card_value = tester;
         }
         if (tester == 1) {
            if (sum <= 10) {
               card_value = 11;
            } else {
               card_value = 1;
            }
         }

         sum = sum + card_value;
      }

      return sum;

   }

   // return the hand of cards as an ArrayList. Do not provide a
   // reference to the original. Make a copy.
   public ArrayList<Card> getList() {
      ArrayList<Card> tempHand = new ArrayList<Card>();
      for (Card c : hand) {
         tempHand.add(c);
      }
      return tempHand;
   }

   // return true of the card is in the hand. Else, return false.
   public boolean peekCard(Card c) {
      // PART B: Your code goes here
      int tester = 0;
      int constant1 = c.getCardNumber();

      for (Card d : hand) {
         tester = d.getCardNumber();
         if (tester == constant1) {
            return true;
         }
      }
      return false;
   }

   // return number of cards with this face value as a String
   public int numberOfCardsOfFaceValue(String face) {
      // PART C: Your code goes here. Suggestion:
      // Use a for-each loop to test each card in the hand
      // ArrayList to see if the face value as a String is
      // the same as the formal parameter face.
      // Count the number of cards for which this is true.
      // Return that count.

      String z = "";
      int counter = 0;

      for (Card c : hand) {
         z = c.getFaceValueAsString();
         if (z == face) {
            counter++;
         }
      }

      return counter;

   }

   // return number of cards with this face value as an int
   public int numberOfCardsOfFaceValue(int face) {
      // PART D: Your code goes here. Suggestion:
      // Use the same approach as for PART C but testing
      // the face value as an int
      int number = 0;
      int counter = 0;

      for (Card c : hand) {
         number = c.getFaceValueAsInt();
         if (number == face) {
            counter++;
         }
      }

      return counter;

   }

   // return number of cards with this suit
   public int numberOfCardsOfSuit(String suit) {
      // PART E: Similar to PARTS C and D but for
      // the suit.
      String suit_converter = "";
      int counter = 0;

      for (Card c : hand) {
         suit_converter = c.getSuit();
         if (suit_converter == suit) {
            counter++;
         }
      }

      return counter;

   }

   // return an ArrayList of cards with this face value
   public ArrayList<Card> getCardsOfFaceValue(String face) {
      ArrayList<Card> tempHand = new ArrayList<Card>();
      for (Card c : hand) {
         if (c.getFaceValueAsString().equals(face)) {
            tempHand.add(c);
         }
      }
      return tempHand;
   }

   // return an ArrayList of cards with this face value
   public ArrayList<Card> getCardsOfFaceValue(int face) {
      // PART F: Your code goes here. Create a new
      // ArrayList but put in it only Card objects with
      // the face value the same as the formal parameter.
      // Return that list.

      ArrayList<Card> same_face = new ArrayList<Card>();
      int tester = 0;

      for (Card c : hand) {
         tester = c.getFaceValueAsInt();
         if (tester == face) {
            same_face.add(c);
         }
      }

      return same_face;

   }

   // return an ArrayList of cards with this suit
   public ArrayList<Card> getCardsOfSuit(String suit) {
      // PART G: Your code goes here. Approach is
      // similar to that taken for PART F.
      ArrayList<Card> same_suit = new ArrayList<Card>();
      String tester = "";

      for (Card c : hand) {
         tester = c.getSuit();
         if (tester == suit) {
            same_suit.add(c);
         }
      }

      return same_suit;

   }

   public String toString() {
      String str = "";
      for (Card c : hand) {
         str += c + "\n";
      }
      return str;
   }

}
