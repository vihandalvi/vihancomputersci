package General;

import java.util.ArrayList;
import java.util.Arrays;

public class mainstudent {
    public static void main(String[] args) {
        Student s = new GradStudent();
        System.out.println(s.getInfo());

        int[] st = { 3, 4 };
        int b = 4;
        test(st, b);
        System.out.println(Arrays.toString(st) + " " + b);

        String a = new String("this");
        test1(a, 1);
        System.out.println(a);

        ArrayList<Integer> intarray = new ArrayList<Integer>();
        intarray.add(1);

        test3(intarray, b);

    }

    public static void test3(ArrayList<Integer> a, int b) {
        a.add(2);
    }

    public static void test(int[] a, int y) {
        if (a.length > 1) {
            a[1] = a[1] * 2;
        }
        y = y * 2;
    }

    public static void test1(String a, int v) {
        a = "that";
    }
}
