package MODUL4.MODUL4_T1;

public class Random_String {
    private Random_Character characterGenerator;

    public Random_String(Random_Character characterGenerator) {
        this.characterGenerator = characterGenerator;
    }

    public String generateRandomString(int length) {
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = characterGenerator.generateRandomCharacter();
            randomString.append(randomChar);
        }
        return randomString.toString();
        }
}