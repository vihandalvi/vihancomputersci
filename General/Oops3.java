package General;

public class Oops3 {

    public static void main(String[] args) {

        double bubble = 867.5309;
        double x = 10.01;
        double y = 8.0;
        // String v = "Vivek";

        printer(x, y);
        printer(x, bubble);
        System.out.println("The value from main is: " + bubble);

        // printer("barack", "obama");
        int z = 5;

        System.out.print("z= " + z);

    }

    public static void printer(double x, double y) {

        System.out.println("x = " + x + " and y = " + y);

    }

}
