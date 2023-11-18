package MODUL4.MODUL4_LAT1;
import java.util.Scanner;

public class SOURCE1LAT1 {
    public SOURCE2LAT1 KALKULATOR;

    public SOURCE1LAT1() {
        this.KALKULATOR = new SOURCE2LAT1();
    }

    public void RUNKALKULATOR() {
        Scanner InputPil = new Scanner(System.in);
        int PILIH;

        do {
            displayMenu();
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            PILIH = InputPil.nextInt();

            switch (PILIH) {
                case 1:
                    KALKULATOR.AkarKuadrat(InputPil);
                    break;

                case 2:
                    KALKULATOR.Pangkat(InputPil);
                    break;

                case 3:
                    KALKULATOR.Logaritma(InputPil);
                    break;

                case 4:
                    KALKULATOR.Faktorial(InputPil);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }

            System.out.println();
        } while (PILIH != 5);

        InputPil.close();
    }

    private void displayMenu() {
        System.out.println("=== Calculator ===");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma");
        System.out.println("4. Faktorial");
        System.out.println("5. Keluar");
    }
}
