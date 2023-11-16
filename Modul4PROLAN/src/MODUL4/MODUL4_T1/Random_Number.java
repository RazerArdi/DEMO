package MODUL4.MODUL4_T1;
import java.util.Random;

public class Random_Number {

    private Random random;

    public Random_Number() {
        this.random = new Random();
    }

    public int generateRandomNumber(int lowerBound, int upperBound) {
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}

