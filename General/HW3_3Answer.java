package General;

public class HW3_3Answer {
   public static void main(String[] args) {
      System.out.println("Exercise 1 - numbers in order");
      printNumbers(15);
      printNumbers(5);
      System.out.println();

      System.out.println("Exercise 2 - powers of 2");
      printPowersOf2(3);
      printPowersOf2(10);
      System.out.println();

      System.out.println("Exercise 3 - powers of n");
      printPowersOfN(4, 3);
      printPowersOfN(5, 6);
      printPowersOfN(-2, 8);
      System.out.println();

      System.out.println("Exercise 4 - print square");
      printSquare(3, 7);
      System.out.println();

      System.out.println("Exercise 5 - printGrid");
      printGrid(4, 6);
   }

   // Exercise 1 in 4th Edition text
   public static void printNumbers(int n) {
      for (int i = 1; i <= n; i++) {
         System.out.print("[" + i + "]" + " ");
      }
      System.out.println();
   }

   // Exercise 2 in 4th Edition text
   public static void printPowersOf2(int n) {
      System.out.print("1 ");
      for (int i = 1; i <= n; i++) {
         double answer1 = Math.pow(2, i);
         System.out.print((int) answer1 + " ");
      }
      System.out.println();
   }

   // Exercise 3 in 4th Edition text
   public static void printPowersOfN(int b, int e) {
      System.out.print("1 ");
      for (int i = 1; i <= e; i++) {
         double answer2 = Math.pow(b, i);
         System.out.print((int) answer2 + " ");
      }
      System.out.println();
   }

   // Exercise 4 in 4th Edition text
   public static void printSquare(int min, int max)

   {
      for (int rows = min; rows <= max; rows++) {
         for (int j = rows; j <= max; j++) {
            System.out.print(j + " ");
         }
         for (int i = min; i < rows; i++) {
            System.out.print(i + " ");
         }
         System.out.println();
      }
   }

   public static void printGrid(int rows, int cols) {
      for (int x = 1; x <= rows; x++) {
         System.out.print(x + " ");
         int z = x;
         for (int y = 0; y < cols - 1; y++) {
            z = z + rows;
            System.out.print(z + " ");
         }
         System.out.println();
      }
   }

   // Exercise 5 in 4th Edition text
   // public static void printGrid(int rows, int cols){

}
