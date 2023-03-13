package General;

import java.util.Scanner;

public class FRQ_7 {
    public static void main(String[] args) {

        Scanner kbReader = new Scanner(System.in);

        tallyVotes(kbReader);

    }

    public static double tallyVotes(Scanner kbReader) {
        int counter = 0;
        int counter1 = 0;
        String answer = "";
        while (!answer.equals("q")) {
            System.out.print("vote?");
            answer = kbReader.nextLine();
            if (answer.equals("y")) {
                counter++;
            }
            counter1++;
        }
        counter1 = counter1 - 1;
        System.out.println("total votes = " + counter1);
        // fix it
        double percentage = ((double) counter / counter1) * 100;
        System.out.println("result = " + percentage + "%");
        return percentage;

    }

}
