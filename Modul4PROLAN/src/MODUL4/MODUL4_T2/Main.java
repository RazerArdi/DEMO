package MODUL4.MODUL4_T2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = {-84, -63, -42, -15, 0, 5, 19, 27, 38, 50, 61, 72};

        ElementRatioCalculator ratioCalculator = new ElementRatioCalculator();

        System.out.print("Masukkan nilai yang ingin dicari indexnya: ");
        int targetValue = scanner.nextInt();

        ratioCalculator.printElementRatios(data, targetValue);

        scanner.close();
    }
}
