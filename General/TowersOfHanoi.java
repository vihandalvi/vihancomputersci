package General;

import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        // get number of rings from the user.
        // call the recursive move method to move the
        // rings from peg 1 to peg 3
        // with peg 2 available for intermediate usage
        // Precondition: number of rings != 64
        // Postconditions: the moves are printed in the terminal window

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number of rings: ");
        // int numberOfRings = scan.nextInt();
        // move(numberOfRings, 1, 3, 2);

        // reverseString("Hello");
        // System.out.println("done");
        // createMultiplicationTable(2, 9);
        // createMultiplicationTable(1, 2);
        // createMultiplicationTable(-3, 2);

        createStepTable(3, 7);
        System.out.println();
        createStepTable(1, 9);
        System.out.println();
        createStepTable(1, 2);
    }

    public static int[][] createStepTable(int a, int b) {
        if (b <= a || b < 1 || a < 1) {
            return null; // wont work
        }
        int row = 0;
        int dimension = b - a + 1;
        int[][] stair = new int[dimension][];

        for (int i = a; i <= b; i++) {
            stair[row] = new int[i];
            for (int v = 0; v < stair[row].length; v++) {
                stair[row][v] = i;
            }
            row++;
        }

        row = 0;
        for (int i = 0; i < dimension; i++) {
            for (int v = 0; v < stair[i].length; v++) {
                System.out.print(stair[i][v]);
            }
            System.out.println();
        }
        return stair;
    }

    public static int[][] createMultiplicationTable(int a, int b) {
        if (b < a) {
            return null; /// wont work
        }
        // your code goes here

        int dimension = b - a + 1;
        int[][] table = new int[dimension][dimension];
        int h_outliers = a;
        int v_outliers = a;

        for (int i = 0; i < table.length; i++) {
            table[0][i] = h_outliers;
            h_outliers++;
        }

        for (int i = 0; i < table.length; i++) {
            table[i][0] = v_outliers;
            v_outliers++;
        }

        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table.length; j++) {
                table[i][j] = table[0][j] * table[i][0];
            }
        }

        // debugging only
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        return table;
    }

    static int counter = 0;

    public static void reverseString(String given) {

        int i = 0;
        if (counter == 0) {
            counter = given.length();
        }

        if (i == given.length() - 1) {
            System.out.print(given.charAt(given.length() - 1));
            counter--;
        } else {
            reverseString(given.substring(1, given.length()));
            System.out.print(given.charAt(i));
            counter--;
        }
        if (counter == 0) {
            System.out.println(given);
        }

    }

    private static void move(int n, int i, int j, int k) {
        // print the moves for n rings going frm peg i to peg j3
        // preconditions: none
        // postconditions: the moves have been printed
        if (n > 0) {
            // move the n-1 smaller rings from peg i to peg k
            move(n - 1, i, k, j);

            // move the largest ring from peg i to peg j
            System.out.println("Move ring " + n + " from peg " +
                    i + " to " + j);

            // move the n-1 smaller rings from peg k to peg j
            move(n - 1, k, j, i);

            // n rings have now been moved from peg i to peg j
        }
    }
}
