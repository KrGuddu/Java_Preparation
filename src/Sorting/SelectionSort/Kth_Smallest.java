// This selection sort method give TLE(here T.C. is O(n²)) so to avoid TLE use Quick select sort(here, T.C. is O(n) avg)
package Sorting.SelectionSort;

public class Kth_Smallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        int n = arr.length;
        // TC = O(n*k)
        for(int i=0;i<k;i++) { // n-1 passes
            int min = Integer.MAX_VALUE, mindx = -1;
            for(int j=i;j<n;j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
//        return arr[k-1];
        System.out.println(arr[k-1]);       //k-1 means 3 and it is the index of arr elements which is 5.
    }
}
