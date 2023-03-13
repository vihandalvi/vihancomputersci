package General;
// ScannerMethods.java

// by w p osborne
// 11/12/2021
// Period 1

import java.util.Scanner;

public class ScannerMethods {
   public static void main(String[] args) {
      // Scanner object have methods
      // So far we've used:
      // nextInt(); // got an integer - token
      // nextDouble(); // gets a double - token
      // next(); // gets a String - token
      // nextLine(); // get a String to the end of the line
      // New are:
      // hasNextInt(); // returns true if next token is an int
      // hasNextDouble(); // returns true if next token is a double
      // hasNext(); // returns true if next token is a String
      // hasNextLine(); // returns true if a line is ready to be read

      Scanner kbReader = new Scanner(System.in);

      System.out.print("enter an integer: ");
      // int myInteger = kbReader.nextInt(); // not robust
      int myInteger = getAnInteger(kbReader);

      System.out.println("You entered " + myInteger);
   }

   public static int getAnInteger(Scanner kb) {
      while (!kb.hasNextInt()) {
         System.out.print("Please enter an int: ");
         kb.next();
      }
      return kb.nextInt();
   }
}