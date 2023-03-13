package General;

public class Count {
    public static void main(String[] args) {
        int coefficient = -10;
        int constant = 30;

        for (int count = 1; count <= 6; count = count + 1) {

            System.out.println(count + " = " + ((count - 1) * coefficient + constant));
        }
    }

}
