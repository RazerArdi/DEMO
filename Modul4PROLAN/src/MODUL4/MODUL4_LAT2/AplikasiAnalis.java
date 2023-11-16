package MODUL4.MODUL4_LAT2;

public class AplikasiAnalis {
    private ANALISTEKS textAnalyzer;

    public AplikasiAnalis(ANALISTEKS textAnalyzer) {
        this.textAnalyzer = textAnalyzer;
    }

    public void displayMenu() {
        System.out.println("=== MENU TEKS ANALYZER ===");
        System.out.println("1. Masukkan Teks");
        System.out.println("2. Hitung Jumlah Karakter");
        System.out.println("3. Hitung Jumlah Kata");
        System.out.println("4. Cari Kata dalam Teks");
        System.out.println("5. Keluar");
    }

    public void processChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Masukkan teks: ");
                String inputText = Main.scanner.nextLine();
                textAnalyzer.SetInput(inputText);
                System.out.println("Teks telah dimasukkan!");
                break;

            case 2:
                textAnalyzer.ANALISTEKS();
                System.out.println("Jumlah karakter dalam teks: " + textAnalyzer.getHITUNGKARAKTER());
                break;

            case 3:
                textAnalyzer.ANALISTEKS();
                System.out.println("Jumlah kata dalam teks: " + textAnalyzer.getHITUNGKATA());
                break;

            case 4:
                textAnalyzer.ANALISTEKS();
                System.out.print("Masukkan kata yang ingin dicari: ");
                String searchWord = Main.scanner.nextLine().toLowerCase();
                int occurrences = textAnalyzer.getWordOccurrences().getOrDefault(searchWord, 0);
                System.out.println("Kata '" + searchWord + "' ditemukan sebanyak " + occurrences + " kali dalam teks.");
                break;

            case 5:
                System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
        }
    }
}
