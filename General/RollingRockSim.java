package General;

import java.util.Random;

public class RollingRockSim {

    public static final int NUMBER_OF_SUCCESSES = 10000;
    public static final int HILLHEIGHT = 100;
    public static final int SEQUENTIAL_SUCCESSES = 2;
    public static final boolean SUCCESS = true;
    public static final boolean FAILURE = false;

    public static void main(String[] args) {

        int countofsuccesses = 0;
        int countofattempts = 0;
        int countofsuccessfulrocksinorder = 0;
        Random bigButton = new Random();

        while (countofsuccesses < NUMBER_OF_SUCCESSES) {
            countofattempts++;
            if (startRock(bigButton) == SUCCESS) {
                countofsuccessfulrocksinorder++;
            } else {
                countofsuccessfulrocksinorder = 0;
            }
            if (countofsuccessfulrocksinorder == SEQUENTIAL_SUCCESSES) {
                countofsuccesses++;
            }
        }
        System.out.println(countofattempts / countofsuccesses);
    }

    public static boolean startRock(Random bigButton) {
        int distance = 0;
        while (distance <= HILLHEIGHT) {
            distance = distance + bigButton.nextInt(10);
            if (bigButton.nextInt(10) == 0) {
                return FAILURE;
            }
        }
        return SUCCESS;
    }

}
