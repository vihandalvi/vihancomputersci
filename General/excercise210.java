package General;

public class excercise210 {
    public static void main(String[] args) {
        for (int pattern = 1; pattern <= 6; pattern++) {
            System.out.print("         |");
        }
        System.out.println();

        for (int numbers = 1; numbers <= 6; numbers++) {
            for (int count = 1; count <= 10; count++) {
                System.out.print(count % 10);
            }

        }
    }

}
