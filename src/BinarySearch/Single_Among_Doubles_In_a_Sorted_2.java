/* Que: Given a sorted array arr[]. Find the element that appears only once in the array. All other elements appear exactly twice.
Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65]
Output: 4
Explanation: 4 is the only element that appears exactly once.

Input: arr[] = [5]
Output: 5
 */
package BinarySearch;

public class Single_Among_Doubles_In_a_Sorted_2 {
    // Method 2: even-index binary search     //Time  : O(log n), Space : O(1)      =>The best
    int single(int[] arr) {
        int lo=0, hi=arr.length-1;

        while(lo<hi){
            int mid = lo + (hi-lo)/2;

            if(mid % 2 == 1) mid--;                     // Make mid even b/q mid + 1 is its paired position
            if(arr[mid] == arr[mid+1]) lo=mid+2;        //When pair is correct → unique/single element is on right
            else hi=mid;                                //When Pair is broken → unique element is on left or at mid
        }
        return arr[lo];
    }


    //Method 1: Brute Force (linear scan)        //Time  : O(n), Space : O(1)
//    int single(int[] arr) {
//        int n= arr.length;
//
//        if(n==1) return arr[0];
//        if(arr[0] != arr[1]) return arr[0];
//        if(arr[n-1] != arr[n-2]) return arr[n-1];
//
//        for(int i=1; i<n-1; i++){
//            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]) return arr[i];
//        }
//
//        return -1;
//    }
}


/* Explanations:
Sorted Array + Every element twice + One element once
                    ↓
              Binary Search
                    ↓
              Make mid EVEN
                    ↓
arr[mid] == arr[mid+1] → go RIGHT
arr[mid] != arr[mid+1] → go LEFT
                    ↓
              return arr[lo]


One-line pattern: Make mid even → if arr[mid] == arr[mid+1], go right; otherwise go left.
 */