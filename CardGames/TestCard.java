/*
 * TestCard.java
 * by Vihan Dalvi
 * 2/13/2022
 * Period 1
 */
package CardGames;

import java.util.Random;

public class TestCard {
    public static void main(String[] args) {
        // creates array of cards to store
        Card[] stack = new Card[20];
        Random gen = new Random();
        int counter = 0;
        // loop creates each of 20 cards
        for (int i = 0; i < stack.length; i++) {
            boolean numberexists = true;
            // loop runs till unique value is generated
            while (numberexists == true) {
                numberexists = false;
                int randomnumber = gen.nextInt(51) + 1;
                counter++;
                // checks if value exists in card already
                // if match is found, then numberexists is set to true
                // so that while loop can generate new value
                for (int j = 0; j < i; j++) {
                    if (stack[j].getIndex() == randomnumber) {
                        numberexists = true;
                    }
                }
                // if number does not exist then add it to stack
                if (numberexists == false) {
                    Card temp = new Card(randomnumber);
                    stack[i] = temp;
                }
            }
        }
        // prints each object using foreach loop
        for (Card print : stack) {
            System.out.println(print.toString());
        }
        System.out.println("Took " + counter + " tries to generate 20 unique cards!");
    }
}
