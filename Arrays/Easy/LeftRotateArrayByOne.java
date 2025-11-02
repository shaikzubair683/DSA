package Arrays.Easy;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        leftRotateArrayByOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotateArrayByOne(int[] arr) {
        int length = arr.length;
        int[] arr1 = new int[length];
        for (int i = 0; i < length; i++) {
            arr1[(i + length + 1) % length] = arr[i];
        }
        for (int i = 0; i < length; i++) {
            arr[i] = arr1[i];
        }

    }
}
