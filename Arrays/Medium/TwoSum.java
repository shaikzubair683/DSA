package Arrays.Medium;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 5, 6, 7, 9 };

        System.out.println(doesTwoSumExist(arr, 7));
    }

    public static boolean doesTwoSumExist(int[] arr, int target) {
        HashSet set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(target - arr[i]);
            }
        }
        return false;
    }
}
