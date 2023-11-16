package MODUL4.MODUL4_T1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random_Character characterGenerator = new Random_Character();
        Random_Number randomNumberGenerator = new Random_Number();
        Random_String randomStringGenerator = new Random_String(characterGenerator);

        int option;

        do {
            displayMenu();
            System.out.print("Pilih opsi (1/2/3): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    try {
                        System.out.print("Masukkan batas bawah angka acak: ");
                        int lowerBound = scanner.nextInt();
                        System.out.print("Masukkan batas atas angka acak: ");
                        int upperBound = scanner.nextInt();
                        int randomNumber = randomNumberGenerator.generateRandomNumber(lowerBound, upperBound);
                        System.out.println("Angka acak: " + randomNumber);
                    } catch (Exception e) {
                        System.out.println("Input tidak valid. Masukkan angka yang benar.");
                        scanner.nextLine(); // membersihkan buffer
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Masukkan panjang string acak: ");
                        int length = scanner.nextInt();
                        String randomString = randomStringGenerator.generateRandomString(length);
                        System.out.println("String acak: " + randomString);
                    } catch (Exception e) {
                        System.out.println("Input tidak valid. Masukkan panjang yang benar.");
                        scanner.nextLine(); // membersihkan buffer
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih, program berakhir.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }

            System.out.println(); // Output baru setelah setiap operasi
        } while (option != 3);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Random Angka");
        System.out.println("2. Random String");
        System.out.println("3. Keluar");
    }
}
