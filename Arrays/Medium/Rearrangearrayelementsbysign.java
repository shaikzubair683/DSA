package Arrays.Medium;

import java.util.Arrays;

public class Rearrangearrayelementsbysign {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 5, -1, -3, -4 };
        int[] result = rearrangearrayelementsbysign(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] rearrangearrayelementsbysign(int[] nums) {
        int length = nums.length;
        int[] nums1 = new int[length];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < length; i++) {
            if (nums[i] >= 0) {
                nums1[posIndex] = nums[i];
                posIndex += 2;
            } else {
                nums1[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return nums1;
    }

}
