package General;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // System.out.println(mystery(976, 9235));
        // System.out.println(mystery(348, 34298));
        // System.out.println(mystery(2974, 2184));
        // System.out.println(mystery(82, 19));
        // 5System.out.println(mystery(2348, 239));
        // Scanner console = new Scanner(System.in);
        // int ret = tester(25);

        // test(console);
        Employee e = new Employee();
        // System.out.println(e);
        // Employee[] e = { new Secretary(), new Employee() };

        Secretary s = new Secretary();

        ArrayList<Employee> listofemploye = new ArrayList<Employee>();
        ArrayList<String> listofnames = new ArrayList<String>();
        // ArrayList<Integer> listofage = new ArrayList<Integer>();
        listofnames.add("Vivek");
        listofnames.add(0, "Vihan");

        listofnames.get(0).startsWith("V");

        listofemploye.add(s);
        listofemploye.add(0, e);

        // Employee e = s;
        System.out.println(e.getSalary());
        System.out.println(s.getSalary());

        testconstructor ts1 = new testconstructor(15, true);
        System.out.println(ts1.getInitial());

        System.out.println(ts1.getIsItTrue());
        System.out.println(ts1.getObjectCount());
        testconstructor ts2 = new testconstructor(20, false);
        System.out.println(ts2.getInitial());
        System.out.println(ts2.getIsItTrue());
        System.out.println(ts2.getObjectCount());
        testconstructor.teststatic();

        Person vihan = new Person();
        vihan.SetName("Vihan");
        vihan.SetAge(0);
        printPerson(vihan);

        Person tanvi = new Person("Tanvi", 18);
        printPerson(tanvi);

    }

    public static void printPerson(Person p) {
        System.out.println(p.GetName());
        System.out.println(p.GetAge());
    }

    public static int tester(int x) {
        int y = 1;
        int z = 0;
        // point A
        while (x > y) {
            // point B
            z = z + x - y;
            x /= 2;
            // point C
            y *= 2;
            // point D
        }
        // point E
        return z;
    }

    public static int test1(Scanner console) {
        int prev = 0;
        int count = 0;
        int next = console.nextInt();

        while (next != 0) {
            if (next == prev) {
                count++;
            }
            prev = next;
            next = console.nextInt();

        }
        return count;

    }

    public static void ifElseMystery(int a, int b) {
        int c = 2;
        if (a + c < b) {
            c = c + 8;
        } else {
            b = b + 10;
        }
        if (a + c < b) {
            c = c + 8;
        } else {
            b = b + 10;
        }
        System.out.println(b + " " + c);
    }

    public static int mystery(int x, int y) {
        while (x != y) {
            if (x < y) {
                y /= 10;
            } else {
                x /= 10;
            }
        }
        return x;
    }

    public static boolean hasOddEven(int a, int b, int c) {

        if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {

            if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }
}
