import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 9, 3, 2, 5 };
        int[] finalArr = selectionSort(arr);
        System.out.println("Final string: " + Arrays.toString(finalArr));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int maxIndex = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
    }
}