//Ques: Rotate Array (Left Rotation)
// gfg: https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/0

package Array;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;      //d is the number of rotation
        rotateArr(arr, d);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArr(int arr[], int d) {
        int n= arr.length;
        d = d%n;    // Agar d>n ho jaaye to error ya wrong output nahi aayega.  //Ex: n=5, d=7 then 7%5 = 2  ==> Matlab actually 2 hi rotate karna hai.

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

//So, Time complexity = O(n), Space Complexity = O(1) (No extra array)
