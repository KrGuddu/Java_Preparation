//Ques: Rotate Array (Right Rotation)

package Array;
import java.util.Arrays;

public class RotateArray_Right {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;
        rightRotate(arr, d);
        System.out.println(Arrays.toString(arr));
    }
    static void rightRotate(int arr[], int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, n - 1);     // Step 1
        reverse(arr, 0, d - 1);     // Step 2
        reverse(arr, d, n - 1);     // Step 3
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

//So, Time complexity = O(n), Space Complexity = O(1).
/* Shortcut Trick:-
    Rotation	    First Reverse
    1. Left	        First part
    2. Right	    Whole array


In Details:-
    Rotation	        1st Reverse	            2nd Reverse	            3rd Reverse
    1. Left by k	    First part [0, k-1]	    Second part [k, n-1]	Whole array
    2. Right by k	    Whole array	            First part [0, n-k-1]	Second part [n-k, n-1]


Note:
- Left rotation = Counter-clockwise direction (anticlockwise) ↺
- Right rotation = Clockwise ↻

Example: [1, 2, 3, 4, 5], rotate by 1.
- Left (↺): [2, 3, 4, 5, 1]
- Right (↻): [5, 1, 2, 3, 4]

Revision trick: Left → elements move towards the left; Right → elements move towards the right.
*/