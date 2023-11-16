package MODUL4.MODUL4_T2;
import java.util.Arrays;

public class ArrayManipulator {
    public int[] sortArray(int[] data) {
        int[] sortedData = Arrays.copyOf(data, data.length);
        Arrays.sort(sortedData);
        return sortedData;
    }

    public int findElementIndex(int[] sortedData, int target) {
        return Arrays.binarySearch(sortedData, target);
    }
}
