package General;
// Vihan Dalvi

// 11.17.2021
// Period 1
// HW 5.2

import java.util.Random;

public class CrazySeven {
   public static void main(String[] args) {

      Random gen = new Random();

      int number7s = 0;
      int numberthrows = 0;

      int six_one = 0; // name for six and one combinations
      int five_two = 0; // name for five and two combinations
      int three_four = 0; // name for three and four combinations

      while (number7s < 100000) {

         int a = gen.nextInt(6) + 1;
         int b = gen.nextInt(6) + 1;

         numberthrows++;

         if (a + b == 7) {

            number7s++;

            if ((a == 6 && b == 1) || (a == 1 && b == 6)) {
               six_one++;
            } else if ((a == 5 && b == 2) || (a == 2 && b == 5)) {
               five_two++;
            } else if ((a == 3 && b == 4) || (a == 4 && b == 3)) {
               three_four++;
            }

         }

      }

      // Probability Calculations

      double probability_seven_decimal = (six_one + five_two + three_four) / (double) numberthrows;
      double probability_seven_percentage = probability_seven_decimal * 100;

      double six_one_decimal = six_one / (double) numberthrows;
      double six_one_percentage = six_one_decimal * 100;

      double five_two_decimal = five_two / (double) numberthrows;
      double five_two_percentage = five_two_decimal * 100;

      double three_four_decimal = three_four / (double) numberthrows;
      double three_four_percentage = three_four_decimal * 100.0;

      // Output

      // Section 1
      System.out.println("Total number of throws to reach 100,000 was: " + numberthrows);
      // Section 2
      System.out.println("Out of 100,000 successful throws of 7 the number of sevens for each");
      System.out.println("combination was:");
      System.out.println(six_one + " for a six and a one.");
      System.out.println(five_two + " for a five and a two.");
      System.out.println(three_four + " for a three and a four.");
      // Section 3
      System.out.printf("The overall probability of a seven in one throw is: %.2f", probability_seven_percentage);
      System.out.println("%");
      System.out.println("The probability by combination is:");
      System.out.print("\t\t");
      System.out.printf("%.2f", six_one_percentage);
      System.out.println("% for a six and a one.");
      System.out.print("\t\t");
      System.out.printf("%.2f", five_two_percentage);
      System.out.println("% for a five and a two.");
      System.out.print("\t\t");
      System.out.printf("%.2f", three_four_percentage);
      System.out.println("% for a four and a three.");

   }

}