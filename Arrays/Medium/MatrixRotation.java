package Arrays.Medium;

import java.util.Arrays;
import java.util.List;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        matrixRotation(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void matrixRotation(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                swap(i, j, arr);
            }
        }
    }

    public static void swap(int i, int j, int[][] arr) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

}
