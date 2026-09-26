// Check is array is sort or not if sort then return true otherwise return false.
//gfg: https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

package Sorting;

public class Basics {
    public static void main(String[] args) {
        int[] arr = {90, 80, 100, 70, 40, 30};
//        System.out.println(isSorted(arr));    //we can also called directly.
        boolean result = isSorted(arr);
        System.out.println(result);

    }
    public static boolean isSorted(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]) return true;        //for ascending order
        }
        return false;
    }
}


/* Simple logic to remember
Sorted check = find a violation, not a confirmation.

If arr[i] > arr[i+1] → order is broken → false
If loop completes without finding a violation → array is sorted → true

Examples:
[1, 2, 3, 4]  → true
[1, 2, 2, 4]  → true
[1, 3, 2, 4]  → false
[5, 4, 3, 2]  → false
[5]           → true
[]            → true


T.C. = O(n)
A.S. = O(1)
 */