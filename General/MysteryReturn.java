package General;

public class MysteryReturn {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        z = mystery(x, z, y);
        System.out.println(x + " " + y + " " + z);

        x = mystery(z, z, x);
        System.out.println(x + " " + y + " " + z);

        y = mystery(y, y, z);
        System.out.println(x + " " + y + " " + z);

        quadratic(4, 10, 5);

    }

    public static int mystery(int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 1;
        System.out.println(y + " " + z);
        return x;
    }

    public static void quadratic(double a, double b, double c) {
        double temp = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double firstroot = (-b + temp) / (2 * a);
        double secondroot = (-b - temp) / (2 * a);
        System.out.println("First root = " + firstroot);
        System.out.println("Second root = " + secondroot);

    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return d;
    }

}
