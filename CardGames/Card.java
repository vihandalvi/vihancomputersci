/*
 * Card.java
 * by w p osborne
 * 2/11/2022
 * Period 1
 */
package CardGames;

public class Card implements Comparable<Card> {
    // instance variable
    private int index;

    private static String[] faceValueAsStrings = { "Ace", "2", "3", "4",
            "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    private static String[] suits = { "Clubs", "Diamonds", "Hearts",
            "Spades" };

    // Constructor
    public Card(int cardNumber) {
        index = cardNumber;
    }

    // Accessors
    public int getFaceValueAsInt() {
        return index % 13 + 1;
    }

    public String getFaceValueAsString() {
        return faceValueAsStrings[getFaceValueAsInt() - 1];
    }

    public String getSuit() {
        return suits[index / 13];
    }

    public int getIndex() {
        return index;
    }

    // toString
    public String toString() {
        String str = "Card: ";
        str += " the " + getFaceValueAsString();
        str += " of " + getSuit();
        return str;
    }

    // implementing comparable interface
    public int compareTo(Card other) {
        return this.index - other.getIndex();
    }

}
