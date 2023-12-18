public class AlgoritmaPencarian {
    public static int pencarianSequential(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int pencarianBiner(int[] array, int target) {
        int kiri = 0;
        int kanan = array.length - 1;

        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;

            if (array[tengah] == target) {
                return tengah;
            } else if (array[tengah] < target) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }
        return -1;
    }

    public static int pencarianInterpolasi(int[] array, int target) {
        int kiri = 0;
        int kanan = array.length - 1;

        while (kiri <= kanan && target >= array[kiri] && target <= array[kanan]) {
            int posisi = kiri + ((target - array[kiri]) * (kanan - kiri) / (array[kanan] - array[kiri]));

            if (array[posisi] == target) {
                return posisi;
            }

            if (array[posisi] < target) {
                kiri = posisi + 1;
            } else {
                kanan = posisi - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 20;

        long waktuMulai = System.nanoTime();
        int hasilSequential = pencarianSequential(array, target);
        long waktuSelesai = System.nanoTime();
        System.out.println("\n===Sequential===");
        System.out.println("Hasil Pencarian Sequential: " + hasilSequential);
        System.out.println("Waktu Pencarian Sequential: " + (waktuSelesai - waktuMulai) + " nanodetik");

        System.out.println("\n===Biner===");
        waktuMulai = System.nanoTime();
        int hasilBiner = pencarianBiner(array, target);
        waktuSelesai = System.nanoTime();
        System.out.println("Hasil Pencarian Biner: " + hasilBiner);
        System.out.println("Waktu Pencarian Biner: " + (waktuSelesai - waktuMulai) + " nanodetik");

        System.out.println("\n===Interpolasi===");
        waktuMulai = System.nanoTime();
        int hasilInterpolasi = pencarianInterpolasi(array, target);
        waktuSelesai = System.nanoTime();
        System.out.println("Hasil Pencarian Interpolasi: " + hasilInterpolasi);
        System.out.println("Waktu Pencarian Interpolasi: " + (waktuSelesai - waktuMulai) + " nanodetik");
    }
}
