package Arrays.Easy;

public class LargestElementInArray {

    public static void main(String[] args) {
        int[] arr = null;
        int largest = findLargest(arr);
        System.out.println(largest);
    }

    public static int findLargest(int[] arr) {
        if (arr != null) {
            int largest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            return largest;
        } else {
            return 0;
        }

    }

}
