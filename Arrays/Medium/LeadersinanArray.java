package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LeadersinanArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 5, 3, 1, 2 };
        List<Integer> list = leadersinanArray(arr);
        System.out.println(list.toString());
    }

    private static List<Integer> leadersinanArray(int[] nums) {
        int l = nums.length;
        if (l == 0) {
            return new ArrayList<>();
        }

        int largest = nums[l - 1];

        Stack<Integer> stack = new Stack<>();
        stack.push(nums[l - 1]);

        for (int i = l - 2; i >= 0; i--) {
            if (nums[i] > largest) {
                stack.push(nums[i]);
                largest = nums[i];
            }
        }

        List<Integer> leadersList = new ArrayList<>();
        while (!stack.isEmpty()) {
            leadersList.add(stack.pop());
        }

        return leadersList;
    }
}
