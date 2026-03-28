//https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

package BinarySearch;
import java.util.*;

public class First_And_Last_Occurence_2nd {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;

        Solution obj = new Solution();
        ArrayList<Integer> ans = obj.find(arr, x);

        System.out.println(ans); // Output: [2, 5]
    }
}

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();

        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);

        res.add(first);
        res.add(last);

        return res;
    }

    int firstOccurrence(int[] arr, int x) {
        int lo = 0, hi = arr.length - 1;
        int idx = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < x) lo = mid + 1;
            else if (arr[mid] > x) hi = mid - 1;
            else {
                idx = mid;
                hi = mid - 1;
            }
        }
        return idx;
    }

    int lastOccurrence(int[] arr, int x) {
        int lo = 0, hi = arr.length - 1;
        int idx = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < x) lo = mid + 1;
            else if (arr[mid] > x) hi = mid - 1;
            else {
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }
}