package General;
// Vihan Dalvi

// 9.30.2021
// Period 1
// Rocket Project

public class Rocket {

   // Class Constant
   public static final int SIZE = 6;

   public static void main(String[] args) {
      cone();
      line();
      boxUp();
      boxDown();
      line();
      boxDown();
      boxUp();
      line();
      cone();

   }

   public static void cone() {
      for (int a = 1; a <= SIZE * 2 - 1; a++) {
         for (int spaces = 1; spaces <= (SIZE * 2) - a; spaces++)
            System.out.print(" ");
         for (int slash = 1; slash <= a; slash++)
            System.out.print("/");
         System.out.print("**");
         for (int backslash = 1; backslash <= a; backslash++)
            System.out.print("\\");
         System.out.println();
      }
   }

   public static void line() {
      System.out.print("+");
      for (int b = 1; b <= (SIZE * 2); b++)
         System.out.print("=*");
      System.out.println("+");
   }

   public static void boxUp() {
      for (int c = 1; c <= SIZE; c++) {
         System.out.print("|");
         for (int startdots1 = 1; startdots1 <= SIZE - c; startdots1++)
            System.out.print(".");
         for (int slash1 = 1; slash1 <= c; slash1++)
            System.out.print("/\\");
         for (int middledots1 = 1; middledots1 <= SIZE - c; middledots1++)
            System.out.print("..");
         for (int slash1 = 1; slash1 <= c; slash1++)
            System.out.print("/\\");
         for (int startdots1 = 1; startdots1 <= SIZE - c; startdots1++)
            System.out.print(".");
         System.out.println("|");

      }
   }

   public static void boxDown() {
      for (int d = 1; d <= SIZE; d++) {
         System.out.print("|");
         for (int startdots1 = 1; startdots1 <= d - 1; startdots1++)
            System.out.print(".");
         for (int slash1 = 1; slash1 <= (SIZE + 1) - d; slash1++)
            System.out.print("\\/");
         for (int middledots1 = 1; middledots1 <= d - 1; middledots1++)
            System.out.print("..");
         for (int slash1 = 1; slash1 <= (SIZE + 1) - d; slash1++)
            System.out.print("\\/");
         for (int startdots1 = 1; startdots1 <= d - 1; startdots1++)
            System.out.print(".");
         System.out.println("|");

      }
   }

}
