package General;
// LearnRandom.java

// by w p osborne
// 11/12/2021
// Period 1

import java.util.Random;

public class LearnRandom {
   public static void main(String[] args) {

      Random gen = new Random(); // 42 is a seed number

      int d1 = 0;
      int d2 = 0;
      int counter = 0;
      while (d1 != 6 || d2 != 6) {
         d1 = gen.nextInt(6) + 1;
         d2 = gen.nextInt(6) + 1;
         counter++;
      }
      System.out.println("The loop ran " + counter + " times to get a pair of 6's");
   }
}