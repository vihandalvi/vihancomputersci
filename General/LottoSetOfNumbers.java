package General;
/*
 * LottoSetOfNumbers.java
 * by Vihan Dalvi
 * 01/18/22
 * Period 1
 */

import java.util.Arrays;
import java.util.Random;

public class LottoSetOfNumbers {
    public static void main(String[] args) {
        Random gen = new Random();

        // we want an array of length 6. Each element is to have
        // a value of 1 through 49 (inclusive). No value is to
        // appear in more than one element in that array.

        int[] myNumbers = fillArrayRandom(gen, 1, 49, 6);
        if (myNumbers != null) {
            Arrays.sort(myNumbers);
        }
        System.out.println("My LOTTO numbers: " + Arrays.toString(myNumbers));
        System.out.println();
    }

    // PRECONDITION: you may assume gen refers to an instantiated Random
    // object.
    // POSTCONDITION: Return null if length is > the range of
    // numbers to be generated. For example, if min is 1 and max is 4
    // but length is 7, null is returned as filling the array without
    // repeating is impossible. min and max will each be greater than
    // or equal to zero, and max is greater than or equal to min.
    // Otherwise, return a reference to an integer array of lenth elements.
    // Each element contains a randomly selected value between min and max.
    // No value is repeated in this array.
    public static int[] fillArrayRandom(Random gen, int min, int max, int length) {

        // Return null if length is < the range of
        // numbers to be generated.
        if ((max - min) + 1 < length) {
            return null;
        }

        // create new array of specified length
        int[] drawing = new int[length];
        // fill array with -1
        for (int i = 0; i < drawing.length; i++) {
            drawing[i] = -1;
        }
        // fill each element in the array using getNextNumber
        for (int counter = 0; counter < length; counter++) {
            drawing[counter] = getNextNumber(gen, min, max, drawing);
        }
        return drawing;
    }

    // PRECONDITION: min and max are positive integers. max is greater
    // than or equal to min. Integer array a is of at least length 1.
    // The parameter gen refers to a Random object.
    // POSTCONDITION: returns an integer between min and max, inclusive, and
    // not already in the integer array a.
    public static int getNextNumber(Random gen, int min, int max, int[] a) {

        // condion to decide if we generated next random number that does not already
        // exist
        boolean isNotNextNumber = true;
        int n = -1;

        // while loop to find number that is not already in the array
        while (isNotNextNumber == true) {
            n = gen.nextInt(max - min) + min;
            isNotNextNumber = checkNumber(n, a);
        }
        return n;
    }

    // PRECONDITION: The integer array parameter a refers to an array of
    // at least length 1.
    // POSTCONDITION: if the value n is in the array a return true. Else,
    // return false.
    public static boolean checkNumber(int n, int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return true;
            }
        }
        return false;
    }
}
