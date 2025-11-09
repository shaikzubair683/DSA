package Arrays.Medium;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, -6, 5, 7, -4, 6 };
        int largest = FindLargestSubArraySum(arr);
        System.out.println(largest);
    }

    private static int FindLargestSubArraySum(int[] nums) {

        int current = nums[0];
        int largest = current;
        for (int i = 1; i < nums.length; i++) {
            if ((current + nums[i]) >= nums[i]) {
                current = current + nums[i];
            } else {
                current = nums[i];
            }
            if (current > largest) {
                largest = current;
            }
        }
        return largest;

    }
}
