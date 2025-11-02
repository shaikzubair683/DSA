package Arrays.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 3, 3, 3, 3, 4 };
        int num = removeDuplicatesFromSortedArray(arr);
        System.out.println(num + "  " + Arrays.toString(arr));
    }

    public static int removeDuplicatesFromSortedArray(int[] arr) {
        HashSet set = new HashSet<Integer>();
        for (int i = arr.length - 1; i >= 0; i--) {
            set.add(arr[i]);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                arr[count++] = arr[i];
                set.remove(arr[i]);
            }
        }
        return count;
    }
}
