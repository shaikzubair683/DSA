package Arrays.Medium;

/*
 * Boyer–Moore Majority Vote Algorithm:
 * Count++ if(count>0 && arr[i]== element);
 * otherwise count--;
 * set count, element if count==0;
 */

public class FindElementRepeatedMoreThanHalf {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 2, 1, 1, 1, 1, 2 };
        int element = findElementRepeatedMoreThanHalf(arr);
        System.out.println(element);
    }

    public static int findElementRepeatedMoreThanHalf(int[] arr) {
        int count = 0;
        int element = 0;// edge case might happen
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
                count++;
            } else if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count2++;
            }
        }
        if (count2 > (arr.length / 2)) {
            return element;
        }
        return -1;
    }
}
