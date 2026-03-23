//Que: Find smallest first.
//or, Given an integer array, sort the array in ascending order using the Selection Sort algorithm.
//Or, Given an array of integers, sort the array in ascending order by repeatedly selecting the minimum element from the unsorted part and placing it at the beginning.

package Sorting.SelectionSort;
import java.util.Arrays;

public class SortInAscendingOrder {
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;

        print(arr);

        for (int i = 0; i < n - 1; i++) { // n-1 passes
            int min = Integer.MAX_VALUE;
            int mindx = i;      //int mindx = -1;       // -1 ya aur kux v le skte hai

            for (int j = i; j < n; j++) {  // start from i
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        print(arr);
    }

    public static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}