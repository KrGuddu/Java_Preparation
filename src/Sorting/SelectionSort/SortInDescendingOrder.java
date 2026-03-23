//Que: find largest first

package Sorting.SelectionSort;
import java.util.Arrays;

public class SortInDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;

        print(arr);

        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            int maxdx = i;

            for (int j = i; j < n; j++) {
                if (arr[j] > max) {   //change here
                    max = arr[j];
                    maxdx = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = temp;
        }

        print(arr);
    }

    public static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}