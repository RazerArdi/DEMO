package MODUL4.MODUL4_T2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = {38, -15, 72, 0, -42, 19, -63, 50, 27, -84, 61, 5};

        ElementRatioCalculator ratioCalculator = new ElementRatioCalculator();

        System.out.print("Masukkan nilai yang ingin dicari indexnya: ");
        int targetValue = scanner.nextInt();

        ratioCalculator.printElementRatios(data, targetValue);

        scanner.close();
    }
}
