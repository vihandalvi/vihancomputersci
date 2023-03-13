package General;

import java.util.Scanner;
//test

public class CheckPassword {
    public static void main(String[] args) {

        Scanner kbReader = new Scanner(System.in);
        String realpassword = "Vihan123";
        String pwd = "Vihan123";
        int count = 0;

        while (pwd.equals(realpassword) && count != 3) {
            System.out.print("Please enter your pwd: ");
            pwd = kbReader.nextLine();
            count++;
        }
        kbReader.close();
    }
}
