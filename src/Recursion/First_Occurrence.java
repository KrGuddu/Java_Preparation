//Q: Find 1st occurrence of elements in a sorted arrays by recursion method.

package Recursion;

public class First_Occurrence {
    public int firstSearch(int[] arr, int k) {
        int n=arr.length;
        return binarySearch(arr, k, 0, n - 1);
    }

    private int binarySearch(int[] arr, int k, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        if (arr[mid] == k) {
            // Check if this is the first occurrence
            if (mid == 0 || arr[mid - 1] != k) {
                return mid;
            }
            return binarySearch(arr, k, lo, mid - 1);
        }

        if (k < arr[mid]) {
            return binarySearch(arr, k, lo, mid - 1);
        }

        return binarySearch(arr, k, mid + 1, hi);
    }
}



/*Tips: Binary Search recursion mein bas 3 cheezein yaad rakho:
1. Base case
   low > high → -1

2. Mid
   mid = low + (high-low)/2

3. Half choose karo
   k < arr[mid] → left
   k > arr[mid] → right

Eg:
arr = [1, 3, 5, 7, 9]
k = 7

low=0, high=4
mid=2 → arr[2]=5

7 > 5
→ right half

low=3, high=4
mid=3 → arr[3]=7

→ return 3
 */