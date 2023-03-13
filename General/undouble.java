package General;

import java.util.Random;

public class undouble {

    public static void main(String[] args) {

        printSum(10, -5, 2);

        /*
         * String strundoubled;
         * strundoubled = undouble("odegard");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("baz");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("mississippi");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("carry");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("juggle");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("little");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("oops");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("foobar");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("apple");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("berry");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("theses");
         * System.out.println(strundoubled);
         * 
         * strundoubled = undouble("");
         * System.out.println(strundoubled);
         */
    }

    public static String undouble1(String strdouble) {

        if (strdouble.length() == 0) {
            return strdouble;
        }
        strdouble = strdouble.toLowerCase();
        String strundouble = "";

        for (int i = 0; i < strdouble.length(); i++) {
            if (i + 1 < strdouble.length()) {
                if (strdouble.charAt(i) == strdouble.charAt(i + 1)) {
                    i++;
                }
            }
            strundouble = strundouble + strdouble.charAt(i);
        }
        return strundouble;
    }

    public static void printSum(int n, int low, int high) {

        System.out.println("sum " + n + " numbers " + low + " to " + high);
        Random Randy = new Random();
        int sum = 0;
        for (int i = 1; i <= n - 1; i++) {
            // fix it
            int a = Randy.nextInt(high - low + 1) + low;
            sum = sum + a;
            System.out.print(a + " + ");

        }
        // fix it
        int a = Randy.nextInt(high - low + 1) + low;
        sum = sum + a;
        System.out.print(a + " = " + sum);
        System.out.println();
        System.out.println("max = " + sum);
    }
}
