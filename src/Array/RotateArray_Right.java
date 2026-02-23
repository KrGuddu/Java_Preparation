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
*/