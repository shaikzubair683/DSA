package Arrays.Easy;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 5, 6, 7, 1 };

        System.out.println(checkArrayIsSorted(arr));
    }

    public static boolean checkArrayIsSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
