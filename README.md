# DSA Practice in Java

Hi

Links
[Guide on How to do Leetcoding](https://www.reddit.com/r/cscareerquestions/comments/sgktuv/the_definitive_way_on_how_to_leetcode_properly/)
[IT Books PDF](https://github.com/joshuagato/IT-Books/tree/main)

# Sorting

### Selection Sort

1. Find min and push to the start.
2. Time complexity for array size 5 = 5+4+3+2+1 = n(n+1)/2 = O(n²)
3. even on sorted array with optimization, best case array will still have O(n²)
4. Animation: [Watch here](https://www.youtube.com/shorts/tZ-HrEDgTQk)

### Bubble Sort

1. Take two element window, run it through; swapping everytime one is first is greater than second.
2. n(n - 1) / 2 => O(n²)
3. can add optimization for a sorted array, to break out if no swaps happened in one full round making bestcase scenario o(n).
4. Animation: [Watch here](https://www.youtube.com/shorts/3K0ExN6pQLM)

### Insertion Sort

1. Start with the first element as a sorted portion and expand the sorted window one element at a time. For each new element, store it in a temporary variable, shift all larger elements in the sorted portion to the right, and insert the temporary element into its correct position. Repeat until the array is fully sorted.
2. Best case: O(n)
3. Worst case: n²/2 - O(n²)
4. Animation: [Watch here](https://www.youtube.com/shorts/cXmY0-nLGig)

### Merge Sort

1. Stands on the concept that merging two sorted arrays is O(n²) but O(n) because you only need to compare the first elements of two arrays.
2. Argorithms = write recursion algorithm with base case, write the merge algorithm.
3. Best, worstcase, efficent improved case = O(n log n). Requires extra O(n) memory; Can be parallelized with different threads.

### Arrays

### Kadane's algorithm

We only have two choices to make

1. Do we extend the array to the right.(if current + nums[i] >= nums[i])
2. Do we end the old array, create new subarray at i.
   current + nums[i] >= nums[i]

### Rotate Matrix

Rotating a matric 90 degreees is simple.

1. create transpose of the matrix, upper half of the diagonal will be replaced with lower half.
2. Now horizontally flip the matrix in the middle, create two pointers L and R which will merge in middle.

### Boundary-Shrinking Algorithm

To print the matrix in spiral, we can create four boundaries,

1. rowStart, rowEnd, colStart, colEnd.
2. inside one while statement, we implement four steps with checkers
   Go right + colStart+1
   go down + rowEnd-1
   go left + colEnd-1
   go up + rowStart+1

### Arrays Named algorithms

| #   | Algorithm Name                 | Key Idea                           |
| --- | ------------------------------ | ---------------------------------- |
| 1   | **Boyer–Moore Majority Vote**  | Majority element (> n/2).          |
| 2   | **Dutch National Flag**        | Sort 0,1,2 (3-way partition).      |
| 3   | **Kadane’s Algorithm**         | Maximum subarray sum.              |
| 4   | **QuickSelect**                | kth smallest/largest.              |
| 5   | **Merge Sort**                 | Divide and conquer sort.           |
| 6   | **Quick Sort**                 | Partition-based sorting.           |
| 7   | **Mo’s Algorithm**             | Offline range queries.             |
| 8   | **Cycle Sort**                 | Minimal swap sorting.              |
| 9   | **Two-Pointer Pattern**        | Pair sum, move zeros, etc.         |
| 10  | **Sliding Window**             | Optimize subarray window problems. |
| 11  | **Trapping Rainwater**         | Precompute left/right max.         |
| 12  | **Prefix Sum Technique**       | Range sums efficiently.            |
| 13  | **Binary Search on Answer**    | Minimize/maximize value problems.  |
| 14  | **Next Permutation Algorithm** | Lexicographic ordering.            |
| 15  | **Fisher–Yates Shuffle**       | Random shuffle uniformly.          |
| 16  | **Difference Array Technique** | Range updates efficiently.         |
