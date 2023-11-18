package MODUL4.MODUL4_T1;

import java.util.Random;

public class Random_Character {
    /**
     * @author BayuArdiyansyah
     */
    private static final int LOWER_BOUND_UPPERCASE = 65;
    private static final int UPPER_BOUND_UPPERCASE = 90;
    private static final int LOWER_BOUND_LOWERCASE = 97;
    private static final int UPPER_BOUND_LOWERCASE = 122;
    private static final int LOWER_BOUND_DIGIT = 48;
    private static final int UPPER_BOUND_DIGIT = 57;

    private Random random;

    public Random_Character() {
        this.random = new Random();
    }

    public char generateRandomCharacter() {
        int category = random.nextInt(3);

        switch (category) {
            case 0:
                return (char) (random.nextInt(UPPER_BOUND_UPPERCASE - LOWER_BOUND_UPPERCASE + 1) + LOWER_BOUND_UPPERCASE);

            case 1:
                return (char) (random.nextInt(UPPER_BOUND_LOWERCASE - LOWER_BOUND_LOWERCASE + 1) + LOWER_BOUND_LOWERCASE);

            case 2:
                return (char) (random.nextInt(UPPER_BOUND_DIGIT - LOWER_BOUND_DIGIT + 1) + LOWER_BOUND_DIGIT);

            default:
                return ' ';
        }
    }
}

