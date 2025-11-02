package Arrays.Medium;

import java.util.Arrays;

/*
1. Variation of Dutch Flag algorithm
2. three pointers, low,mid at start and high at last , While(mid <= high): <= because even though mid, high are same, it has not been processed yet, it can be anything 0,1,2
    if mid==0, swap(low, mid), mid++, low++ // why increase both = mid is main processor, so since 0 came to low its in correct position we are good, and num at mid(came from low) has already been processed by mid before.
    if mid==1, no swap, mid++
    if mid==2, swap(high, mid), mid++, high--
*/
public class SortArrayWith3Elements {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 2, 1, 1, 1, 2, 2, 2 };
        sortArrayWith3Elements(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArrayWith3Elements(int[] arr) {
        int mid = 0;
        int low = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
