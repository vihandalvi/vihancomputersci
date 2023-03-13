/*
 * TestHand.java
 * by w p osborne
 * 2/22/2022
 */
package Cards;

public class TestHand {

   public static void main(String[] args) {
      CardDeck deck = new CardDeck();

      Hand hand = new Hand();

      for (int i = 0; i < 20; i++) {
         hand.addCard(deck.drawACard());
      }

      System.out.println(hand);

      System.out.println(hand.numberOfCardsOfFaceValue(12));
      System.out.println(hand.numberOfCardsOfFaceValue("Queen"));
      System.out.println(hand.getCardsOfFaceValue("Queen"));
      System.out.println(hand.getCardsOfSuit("Spades"));
   }
}
