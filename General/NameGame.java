package General;
// Vihan Dalvi

// 10.17.2021
// Period 1
// The Name Game, HW 3.7

import java.util.Scanner;

public class NameGame {

   public static void main(String[] args) {

      Scanner kbReader = new Scanner(System.in);

      String Name1 = getName("what is your first name?", kbReader);
      String Name2 = getName("what is your last name?", kbReader);
      System.out.println();
      printName(Name1);
      System.out.println();
      printName(Name2);

   }

   public static String getName(String prompt, Scanner kbReader) {
      System.out.print(prompt + " ");
      return kbReader.next();

   }

   public static void printName(String Name) {

      System.out.println(Name + ", " + Name + ", " + "bo-B" + Name.substring(1));
      System.out.println("Banana-fana fo-F" + Name.substring(1));
      System.out.println("Fee-fi-mo-M" + Name.substring(1));
      System.out.println(Name.toUpperCase() + "!");
   }

}
