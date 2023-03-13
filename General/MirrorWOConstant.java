package General;
// MirrorWOConstant.java

// by w p osborne
// 9/27/2021
// Period 1

public class MirrorWOConstant {

   public static void main(String[] args) {
      // draw top line
      line();
      // draw top half
      top();
      // draw bottom half
      bottom();
      // draw bottom line
      line();
   }

   public static void line() {
      System.out.print("#");
      for (int i = 1; i <= 16; i++) {
         System.out.print("=");
      }
      System.out.println("#");
   }

   public static void top() {
      for (int row = 1; row <= 4; row++) {

         System.out.print("|");

         for (int spaces = 1; spaces <= 8 - 2 * row; spaces++) {
            System.out.print(" ");
         }

         System.out.print("<>");

         for (int dots = 1; dots <= row * 4 - 4; dots++) {
            System.out.print(".");
         }

         System.out.print("<>");

         for (int spaces = 1; spaces <= 8 - 2 * row; spaces++) {
            System.out.print(" ");
         }
         System.out.println("|");
      } // end row
   }

   public static void bottom() {

      for (int row = 1; row <= 4; row++) {

         System.out.print("|");

         for (int spaces = 1; spaces <= row * 2 - 2; spaces++) {
            System.out.print(" ");
         }

         System.out.print("<>");

         for (int dots = 1; dots <= 16 - row * 4; dots++) {
            System.out.print(".");
         }

         System.out.print("<>");

         for (int spaces = 1; spaces <= row * 2 - 2; spaces++) {
            System.out.print(" ");
         }
         System.out.println("|");
      }

   }
} // end class