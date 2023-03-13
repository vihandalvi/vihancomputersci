package General;
/*
* NameGenerator.java
* Vihan Dalvi
* 1/9/2022
* period 1
*/

import java.util.Scanner;

public class NameGenerator {
    // class constants - from https://www.pinterest.com/pin/382031980863824502/

    /* PART A - replace these names with silly names of your own choice */
    public static final String[] NAME_FIRST = {
            "Apple", "Toilet", "Giggle", "Burger",
            "Girdle", "Barf", "Lizard", "Waffle",
            "Cooty", "Monkey", "Potty", "Liver",
            "Banana", "Rhino", "Bubble", "Hamster",
            "Toad", "Gizzard", "Pizza", "Gerbil",
            "Chicken", "Pickle", "Chuckle", "Tofu",
            "Gorilla", "Stinker" };

    public static final String[] NAME_MIDDLE = {
            "Head", "Mouth", "Face", "Nose",
            "Tush", "Breath", "Pants", "Shorts",
            "lips", "Honker", "Butt", "Brain",
            "Tushie", "Buffer", "Hikey", "Chunks",
            "Toes", "Buns", "Fanny", "Sniffer",
            "Sprinkles", "Kisser", "Squint", "Humperdink",
            "Brains", "Juice" };

    public static final String[] NAME_LAST = {
            "Poopsie", "Lumpy", "Buttercup", "Gadget",
            "Crusty", "Greasy", "Fluffy", "Cheeseball",
            "Chim-Chim", "Stinky", "Flunky", "Bootie",
            "Pinky", "Zippy", "Goober", "Doofus",
            "Slimy", "Loopy", "Snotty", "Tootsie",
            "Dorkey", "Squeezit", "Opra", "Skipper",
            "Dinky", "Zsa-Zsa" };

    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        String initials;
        do {
            initials = getInitials(kbReader);
            if (initials.length() == 3) {
                printNewName(initials);
            }
        } while (initials.length() != 0);

        System.out.println("\nThanks for playing.");
    }

    public static void printNewName(String initials) {
        /*
         * PART C - write code that takes each initial and prints out the corresponding
         * new full name, with a space between each name. Example here - if initials are
         * MST the name Banana Fanny Tootsie would be printed. NOTE: a loop won't work
         * here because each name is pulled from a different array.
         */

        System.out.print("Your new name is: ");

        initials = initials.toUpperCase();
        char f_l = initials.charAt(0);
        char s_l = initials.charAt(1);
        char t_l = initials.charAt(2);

        String FN = "";
        String MN = "";
        String LN = "";

        for (int i = 0; i < 26; i++) {
            if (f_l == ALPHABET.charAt(i)) {
                FN = NAME_FIRST[i];
            }
            if (s_l == ALPHABET.charAt(i)) {
                MN = NAME_MIDDLE[i];
            }
            if (t_l == ALPHABET.charAt(i)) {
                LN = NAME_LAST[i];
            }
        }
        System.out.println(FN + " " + MN + " " + LN);

    }

    public static String getInitials(Scanner kb) {
        // String initials;

        /*
         * PART B - write code that returns a String of precisely three letters or no
         * letters.
         * Repeat prompt each time an invalid entry is made.
         */
        System.out.print("Enter three initials or 'enter' to quit: ");
        String response = kb.nextLine();

        while (response.length() != 3) {
            if (response.equals("")) {
                return "";
            }
            System.out.print("Enter three initials or 'enter' to quit: ");
            response = kb.nextLine();
        }

        return response;

    }
}
