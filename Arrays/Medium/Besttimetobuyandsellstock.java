package Arrays.Medium;

public class Besttimetobuyandsellstock {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, -6, 5, 7, -4, 6 };
        int largest = Besttimetobuyandsellstock(arr);
        System.out.println(largest);

    }

    public static int Besttimetobuyandsellstock(int[] arr) {
        int current = 0;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                current = current + arr[i] - arr[i - 1];
            } else {
                current = 0;
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

}
