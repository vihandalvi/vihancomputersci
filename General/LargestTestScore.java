package General;
// LargestTestScore.java

// by w p osborne
// 12/6/2021
// Period 1

import java.io.*;
import java.util.Scanner;

public class LargestTestScore {

   public static void main(String[] args) throws FileNotFoundException {
      File file = new File("testScores.txt");
      if (file.exists()) {
         System.out.println("File found.");
         Scanner fr = new Scanner(file);

         int recordNumber = 0;

         while (fr.hasNextLine()) {
            recordNumber++;
            String nextRecord = fr.nextLine();
            int highScore = processRecord(recordNumber, nextRecord);
            System.out.println(" - high score is: " + highScore);
         }
         fr.close();
      } else {
         System.out.println("File not found");
      }
   }

   // line processing
   public static int processRecord(int number, String record) {
      Scanner line = new Scanner(record); // Scanner object of a String
      int highScore = 0;
      // extract and print name
      while (line.hasNext() && !line.hasNextInt()) {
         System.out.print(line.next() + " ");
      }
      while (line.hasNextInt()) {
         int n = line.nextInt();
         if (n > highScore) {
            highScore = n;
         }
      }
      line.close();
      return highScore;
   }

}