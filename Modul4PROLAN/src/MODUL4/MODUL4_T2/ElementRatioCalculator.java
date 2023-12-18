package MODUL4.MODUL4_T2;
import java.util.Arrays;

public class ElementRatioCalculator {
    public void printElementRatios(int[] data, int targetValue) {
        int[] sortedData = Arrays.copyOf(data, data.length);
        Arrays.sort(sortedData);


        System.out.println("Data yang sudah diurutkan:");
        for (int value : sortedData) {
            System.out.print(value + " ");
        }
        System.out.println();


        ArrayManipulator arrayManipulator = new ArrayManipulator();
        int elementIndex = arrayManipulator.findElementIndex(sortedData, targetValue);

        if (elementIndex >= 0) {
            System.out.println("Masukkan nilai yang ingin dicari indexnya: " + targetValue);
            System.out.println("Nilai ditemukan di index: " + elementIndex);
        } else {
            System.out.println("Nilai tidak ditemukan.");
        }


        int positiveCount = countPositiveElements(data);
        int negativeCount = countNegativeElements(data);
        int zeroCount = countZeroElements(data);

        System.out.println("Jumlah elemen dengan nilai positif: " + positiveCount);
        System.out.println("Jumlah elemen dengan nilai negatif: " + negativeCount);
        System.out.println("Jumlah elemen dengan nilai nol: " + zeroCount);
    }

    private int countPositiveElements(int[] data) {
        int count = 0;
        for (int element : data) {
            if (element > 0) {
                count++;
            }
        }
        return count;
    }

    private int countNegativeElements(int[] data) {
        int count = 0;
        for (int element : data) {
            if (element < 0) {
                count++;
            }
        }
        return count;
    }

    private int countZeroElements(int[] data) {
        int count = 0;
        for (int element : data) {
            if (element == 0) {
                count++;
            }
        }
        return count;
    }
}
