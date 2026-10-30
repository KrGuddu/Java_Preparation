package Sorting.BubbleSort;

public class SortArray_LC912 {
    //Using bubble sort => Restriction b/q Worst and Average case T.C.: O(n²)   //LeetCode explicitly prohibits quadratic sorting algorithms for this problem.
    public int[] sortArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
        return arr;
    }


    //Using merge sort => Best, Average, Worst case T.C.: O(nlog n)     =>Recommended
//    public int[] sortArray(int[] arr) {
//        mergeSort(arr, 0, arr.length - 1);
//        return arr;
//    }
//
//    public void mergeSort(int[] arr, int low, int high) {
//        if(low >= high) return;
//
//        int mid = low + (high - low) / 2;
//
//        mergeSort(arr, low, mid);
//        mergeSort(arr, mid + 1, high);
//
//        merge(arr, low, mid, high);
//    }
//
//    public void merge(int[] arr, int low, int mid, int high) {
//        int[] temp = new int[high - low + 1];
//
//        int i = low;
//        int j = mid + 1;
//        int k = 0;
//
//        while(i <= mid && j <= high) {
//            if(arr[i] <= arr[j]) {
//                temp[k++] = arr[i++];
//            } else {
//                temp[k++] = arr[j++];
//            }
//        }
//
//        while(i <= mid) {
//            temp[k++] = arr[i++];
//        }
//
//        while(j <= high) {
//            temp[k++] = arr[j++];
//        }
//
//        for(int x = 0; x < temp.length; x++) {
//            arr[low + x] = temp[x];
//        }
//    }
}



/*
1. Meaning of the error
The submission implements bubble sort, which is a prohibited quadratic sorting algorithm.

It means:
- LeetCode has identified that you are using Bubble Sort.
- Bubble Sort has O(n²) average and worst-case time complexity.
- This problem has large input constraints, so Bubble Sort is too slow.
- LeetCode explicitly prohibits quadratic sorting algorithms for this problem.
Important: This is not a Java syntax error or a wrong-answer error. It is an algorithm restriction.

Solution: Use Merge Sort to avoid restriction. It guarantees O(n log n) time complexity.


Complexity comparison:-
   Algorithm	                Best	        Average	        Worst
1. Bubble Sort (Optimised)	    O(n)	        O(n²)	        O(n²)
2. Selection Sort	            O(n²)	        O(n²)	        O(n²)
3. Insertion Sort	            O(n)	        O(n²)	        O(n²)
4. Merge Sort	                O(nlog n)	    O(nlog n)	    O(nlog n)
5. Heap Sort	                O(nlog n)	    O(nlog n)	    O(nlog n)


4. Important DSA learning point
Don't confuse these three things:
- Correctness: Does your code produce the expected output?
- Efficiency: Does your code run within the time limit?
- Restrictions: Does the problem allow your chosen algorithm?

For your DSA preparation, follow this order:
1. Learn Bubble Sort.
2. Learn Selection Sort.
3. Learn Insertion Sort.
4. Learn Merge Sort.
5. Learn Quick Sort.
6. Learn Heap Sort.

My advice: Don't skip Bubble Sort just because LeetCode 912 prohibits it. Learn it to understand sorting fundamentals, but use Merge Sort for this particular problem.
 */