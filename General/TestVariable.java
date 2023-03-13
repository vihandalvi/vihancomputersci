package General;

public class TestVariable {
    public static void main(String[] args) {

        double x = 1;
        System.out.println(x);
        changevar(x);
        System.out.println(x);

        System.out.println(ReverseName("Vivek"));

    }

    public static double changevar(double x) {
        x = x + 1;
        System.out.println(x);
        return x;
    }

    public static String ReverseName(String name) {
        String reverse = "";
        int length = name.length();
        for (int i = length; i > 0; i--) {
            reverse = reverse + name.charAt(i - 1);
        }
        return reverse;
    }
}
