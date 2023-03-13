package General;
// LearnWhileMenu.java

// by w p osborne
// 11/2/2021
// Period 1

import java.util.Scanner;

public class LearnWhileMenu {
   public static void main(String[] args) {
      Scanner kbReader = new Scanner(System.in);

      String response = "";

      while (!response.equals("X")) {
         // menu
         System.out.println("Please make a selection:");
         System.out.println("  A = task 1");
         System.out.println("  B = print list of characters in a String");
         System.out.println("  C = task 3");
         System.out.println("  Q = quit");
         System.out.print("Enter A, B, C, or Q: ");
         response = kbReader.next();
         response = response.toUpperCase();
         System.out.println();

         if (response.equals("B")) {
            printCharacters(kbReader);
         }
      }
      System.out.println("Thanks for playing.");
   }

   // prints characters of a String, separated by commas.
   // "hello" becomes h, e, l, l, o
   public static void printCharacters(Scanner kb) {
      System.out.print("Enter a String to be printed: ");
      kb.nextLine(); // empty buffer
      String str = kb.nextLine();

      // to get commas only where we want them we have to do
      // fence posting.
      if (str.length() > 0) {
         System.out.print(str.charAt(0));
         for (int i = 1; i < str.length(); i++) {
            System.out.print(", " + str.charAt(i));
         }
      } else {
         System.out.println("String has no characters");
      }
      System.out.println();
   }
}