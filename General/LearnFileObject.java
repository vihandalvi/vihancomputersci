package General;
// LearnFileObject.java

// by w p osborne
// 12/3/2021
// Period 1

import java.io.*; // needed to work with files
import java.util.Scanner;

public class LearnFileObject {

   public static void main(String[] args)
         throws FileNotFoundException {

      File f = new File("myData.txt");

      System.out.println("File exists is: " + f.exists());
      if (f.exists()) {
         System.out.println("file has " + f.length() + " bytes");

         Scanner fileReader = new Scanner(f);

         // reading lines
         // while(fileReader.hasNextLine()){
         // System.out.println(fileReader.nextLine());
         // }
         //
         // read integers only
         while (fileReader.hasNext()) {
            if (fileReader.hasNextDouble() && !fileReader.hasNextInt()) {
               System.out.println(fileReader.nextDouble());
            } else {
               fileReader.next();
            }
         }
         fileReader.close();
      }
   }

}