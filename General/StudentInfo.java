package General;
// Vihan Dlvi

// 12.08.2021
// Period 1
// Students File Reading

import java.io.*;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) throws FileNotFoundException {
        int totalscores = 0;
        File file = new File("Students.txt");
        if (file.exists()) {
            Scanner fr = new Scanner(file);

            int linenumber = 1;
            while (fr.hasNextLine()) {
                String nextRecord = fr.nextLine();
                totalscores += recordProcessing(nextRecord, linenumber++);
            }
            System.out.println();

            // printing total number of test scores
            System.out.println("Total number of scores in file: " + totalscores);
            fr.close();
        } else {
            System.out.println("File not found");
        }

    }

    public static int recordProcessing(String record, int linenumber) {

        Scanner line = new Scanner(record);

        // print name
        String Name = linenumber + ": " + "Name - ";
        while (line.hasNextInt() != true) {
            Name += line.next() + " ";
        }
        System.out.print(Name + ", ID Number - ");

        // print ID number
        if (line.hasNextInt() == true) {
            System.out.println(line.nextInt());
        }

        System.out.print("Test Scores: ");

        int highscore = 0;
        int totalscore = 0;
        int numberofscores = 0;

        // print scores
        while (line.hasNextInt() == true) {
            int score = line.nextInt();
            totalscore += score;
            if (score > highscore) {
                highscore = score;
            }
            numberofscores++;
            if (line.hasNextInt() == true) {
                System.out.print(score + ", ");
            } else {
                System.out.println(score);
            }
        }

        // print high score and average score
        System.out.println("High Score: " + highscore);
        if (numberofscores > 0) {
            System.out.printf("Average Score: %.2f", (double) totalscore / numberofscores);
            System.out.println();
        } else {
            System.out.println("Average Score: No Scores");
        }
        System.out.println();
        line.close();
        return numberofscores;
    }

}
