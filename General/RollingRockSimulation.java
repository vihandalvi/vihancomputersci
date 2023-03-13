package General;
// Vihan Dlvi

// 11.21.2021
// Period 1
// Sisyphus Quarry

import java.util.Random;

public class RollingRockSimulation {

    public static final int NUMBEROFSUCCESS = 10000;
    public static final int HILLHEIGHT = 100;

    public static void main(String[] args) {
        int totalattempts = 0;
        // count attempts required to have two consecute successful launches 10000 times
        for (int i = 0; i < NUMBEROFSUCCESS; i++) {
            int attempt = AttemptForTwoSuccessinRow();
            totalattempts += attempt;
            // System.out.println("Attempt #" + (i+1) + " TwoinRow:" + attempt);
        }
        // System.out.println("FINAL: " + totalattempts);
        System.out.println("AVG ATTEMPTS FOR " + NUMBEROFSUCCESS + " 'TWO IN A ROW' SUCCESSES: "
                + totalattempts / NUMBEROFSUCCESS);
    }

    // total number of attempts to get two successful launches in a row
    public static int AttemptForTwoSuccessinRow() {
        int totalattempts = 0;
        int attempts = 0;

        // totalattempt condition is there to if rock goes to the top in the first
        // attempt itself
        while (attempts != 1 || totalattempts == 1) {
            attempts = AttemptsToReachTop();
            totalattempts += attempts;
        }
        return totalattempts;
    }

    // Number of attempts for rock to reach at the top
    public static int AttemptsToReachTop() {
        int distance = 0;
        int attempts = 1;
        Random bigButton = new Random();

        while (distance <= HILLHEIGHT) {
            distance = distance + bigButton.nextInt(10);
            if (bigButton.nextInt(10) == 0) {
                distance = 0;
                attempts++;
            }
        }
        // System.out.println(attempts);
        return attempts;
    }
}
