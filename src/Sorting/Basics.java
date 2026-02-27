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
            if(arr[i]>arr[i+1]) return true;
        }
        return false;
    }

}
