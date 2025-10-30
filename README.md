# DSA Practice in Java

Hi

# Sorting

### Selection Sort

1. Find min and push to the start.
2. Time complexity for array size 5 = 5+4+3+2+1 = n(n+1)/2 = O(n²)
3. even on sorted array with optimization, best case array will still have O(n²)

### Bubble Sort

1. Take two element window, run it through; swapping everytime one is first is greater than second.
2. n(n - 1) / 2 => O(n²)
3. can add optimization for a sorted array, to break out if no swaps happened in one full round making bestcase scenario o(n).

### Insertion Sort

1. Start with the first element as a sorted portion and expand the sorted window one element at a time. For each new element, store it in a temporary variable, shift all larger elements in the sorted portion to the right, and insert the temporary element into its correct position. Repeat until the array is fully sorted.
2. Best case: O(n)
3. Worst case: n²/2 - O(n²)
