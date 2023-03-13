// Vihan Dalvi
// 2.15.2022
// Period 1
// HW 8.4

package CardGames;

import java.util.*;

public class HoldCards {

    public static void main(String[] args) {

        Card[] stack = new Card[10];
        CardDeck Alpha = new CardDeck();

        // obtain values for the array
        for (int i = 0; i < stack.length; i++) {
            stack[i] = Alpha.drawACard();
        }

        // Prints orignal Array
        System.out.println("PRINTING ORIGINAL ARRAY");
        for (Card Beta : stack) {
            System.out.println(Beta.toString());
        }

        // sorts array using Arrays.sort
        Arrays.sort(stack);

        // prints sorted array
        System.out.println("PRINTING SORTED ARRAY");
        for (Card Beta : stack) {
            System.out.println(Beta.toString());
        }

        // prints all indexes used for calculating the longest run
        System.out.println("PRINTING INDEXES TO CALCULATE RUN");
        for (Card Beta : stack) {
            System.out.println(Beta.getIndex());
        }

        // Caculates the longest run
        int count = 0;
        int run = 0;
        for (int i = 0; i < stack.length - 1; i++) {
            if (stack[i].compareTo(stack[i + 1]) == -1) {
                count++;
                if (count > run) {
                    run = count;
                }
            } else {
                count = 0;
            }
        }

        // Prints Run
        System.out.println("LONGEST RUN: " + (run + 1));

        // Creates a new array storing facevalues , sorts it to decide count of cards
        // with same facevalue
        int count1 = 0;
        int facevaluecount = 0;
        int[] facevalues = new int[stack.length];

        // creates array with facevalue
        for (int i = 0; i < stack.length; i++) {
            facevalues[i] = stack[i].getFaceValueAsInt();
        }

        Arrays.sort(facevalues);

        // prints facevalue
        System.out.println("PRINTING FACEVALUES");
        for (int i : facevalues) {
            System.out.println(i);
        }

        // counts number of cards with same facevalue
        for (int i = 0; i < stack.length - 1; i++) {
            if (facevalues[i] == facevalues[i + 1]) {
                count1++;
                if (count1 > facevaluecount) {
                    facevaluecount = count1;
                }
            } else {
                count1 = 0;
            }
        }

        // prints numbers of cards with same facevalue
        System.out.println("NUMBER OF CARDS WITH SAME FACEVALUE:" + (facevaluecount + 1));

    }

}