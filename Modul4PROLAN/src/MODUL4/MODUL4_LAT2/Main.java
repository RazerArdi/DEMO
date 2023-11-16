package MODUL4.MODUL4_LAT2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ANALISTEKS textAnalyzer = new ANALISTEKS();
        AplikasiAnalis textAnalyzerApp = new AplikasiAnalis(textAnalyzer);

        int MILIH;

        do {
            textAnalyzerApp.displayMenu();
            System.out.print("Pilihan Anda: ");
            MILIH = scanner.nextInt();
            scanner.nextLine();

            textAnalyzerApp.processChoice(MILIH);

            System.out.println(); // Output baru setelah setiap operasi
        } while (MILIH != 5);

        scanner.close();
    }
}


