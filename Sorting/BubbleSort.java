import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 9, 3, 2, 5, 2, 24, 63, 532, 2, 1, 456, 3 };
        int[] finalArr = bubbleSort(arr);
        System.out.println("Final string: " + Arrays.toString(finalArr));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int j = arr.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

}
