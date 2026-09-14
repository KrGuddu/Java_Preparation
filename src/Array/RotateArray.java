//Ques: Rotate Array (Left Rotation)
// gfg: https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/0

package Array;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;      // d = number of positions to rotate
        rotateArr(arr, d);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArr(int arr[], int d) {
        int n= arr.length;
        d = d%n;    // Agar d>n ho jaaye to error ya wrong output nahi aayega.  //Ex: n=5, d=7 then 7%5 = 2  ==> Matlab actually 2 hi rotate karna hai.     //19 % 5 = 4 means 4 rotation hogi => agar n=5, d=19 hai to har 5 rotation par original array ayega and baki 4 actual rotation hoge jisse 19 bar rotate karna nhi parta hai.

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
/* Ek simple rule yaad rakho
Question	                Meaning
Left rotate by d	        Left se d elements shift
Right rotate by d	        Right se d elements shift
d	                        Kitni positions rotate karna hai
n	                        Array ki length
d % n	                    d ko valid range me lana
Left rotation               split	0...d-1 and d...n-1


Que. arr = [1, 2, 3, 4, 5]
     d = 2

1. Left rotate by 2 ka matlab:
1 2 | 3 4 5
↑ ↑

Pehle 2 elements left side se bahar jayenge:
3 4 5 | 1 2

Final: [3, 4, 5, 1, 2]


2. Right rotate by 2:
Original:
1 2 3 | 4 5
        ↑ ↑
        last 2 elements

Last 2 elements ko beginning me le aao:
4 5 | 1 2 3

Final: [4, 5, 1, 2, 3]
*/