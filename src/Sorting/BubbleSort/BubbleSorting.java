//Note: boolean kam space leta hai integer se. b/q boolean → 1 bit (conceptually) but int → 4 bytes. Isliye isSorted use karna better hai readability + memory dono ke liye.
//Que: Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm.
//Que: Implement Bubble Sort to sort an integer array in ascending order, and optimize it so that if the array is already sorted, the algorithm terminates early.
//Input:  [5, 4, 8, -2, 0, 9, 7, 4, 2]
//Output: [-2, 0, 2, 4, 4, 5, 7, 8, 9]

package Sorting.BubbleSort;
import java.util.Arrays;

public class BubbleSorting {
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 8, -2, 0, 9, 7, 4, 2};
        int n = arr.length;
        print(arr);     //to Print original array

        // 1. Basic Bubble Sort        ==> without optimized way        ==>worst case  =>good, but not recommended
        // Time: O(n²) in all cases, Space: O(1)

//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        print(arr);


        // 2. Optimized Bubble Sort using boolean   =>better
        // Best: O(n)
        // Average: O(n²)
        // Worst: O(n²)
        // Space: O(1)

        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSorted = false;
                }
            }
            // No swap means array is already sorted
            if (isSorted) break;          //or,  if(isSorted==true) break;
        }
        print(arr);


         /* 3. Optimized Bubble Sort using swap count        ==> perfect
               Best: O(n)
               Average: O(n²)
               Worst: O(n²)
               Space: O(1)    */

//        for (int i = 0; i < n - 1; i++) {
//            int swaps = 0;
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swaps++;
//                }
//            }
//            // Agar ek bhi swap nahi hua means array already sorted hai
//            if (swaps == 0) break;
//        }
//        print(arr);     // Print sorted array
    }
}



/*  Bubble Sort — 3 Methods
1st Method: Two pointers — Normal Bubble Sort
            • No optimization
            • Always performs all n-1 passes
            • Best / Average / Worst: O(n²)

2nd Method: Two pointers — Using a Flag (boolean)                   =>Use this method in interview
            • isSorted flag detects whether any swap happened
            • If no swap → array is already sorted → break
            • Best: O(n)
            • Average / Worst: O(n²)

3rd Method: Two pointers — Using Swap Count
            • swaps counts the number of swaps in each pass
            • If swaps == 0 → array is already sorted → break
            • Best: O(n)
            • Average / Worst: O(n²)
 */


/* Tips:
1st = understand Bubble Sort
2nd = understand optimization
3rd = understand another way to track swaps


Ranking for practical use
Method	                    Interview	    Coding Test	    Why
1. Normal Bubble Sort	    ⭐⭐⭐	        ⭐⭐⭐	        Simple, but misses optimization
2. boolean isSorted flag	⭐⭐⭐⭐⭐	    ⭐⭐⭐⭐⭐	    Clean, standard, easy to explain
3. Swap count	            ⭐⭐⭐⭐	    ⭐⭐⭐⭐	    Correct, but counting isn't necessary

 */