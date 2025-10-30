import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 9, 3, 2, 5, 2, 24, 63, 532, 2, 1, 456, 3 };
        int[] finalArr = insertionSort(arr);
        System.out.println("Final string: " + Arrays.toString(finalArr));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i + 1];
            int k = 0;
            while ((i - k) >= 0 && arr[i - k] > temp) {
                arr[i - k + 1] = arr[i - k];
                k++;
            }
            arr[i - k + 1] = temp;
        }
        return arr;
    }

}
