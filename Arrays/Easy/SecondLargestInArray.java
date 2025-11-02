package Arrays.Easy;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 9, 1, 6, 3, 6 };
        int second = findSecondLargest(arr);

        System.out.println(second);
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
