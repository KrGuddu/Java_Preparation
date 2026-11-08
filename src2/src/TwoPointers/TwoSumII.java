package TwoPointers;/*
Problem: Given a 1-indexed sorted array arr and an integer target, find two numbers whose sum equals the target.
Return their indices using 1-based indexing.
 */

public class TwoSumII {
    public int[] twoSum(int[] arr, int target) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1};     //Why i+1 or j+1 => b/q of 1-based format
            }
            else if (sum > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return new int[]{-1, -1};
    }
}


/*
Time Complexity	: O(n)	 => Each pointer moves at most n times
Space Complexity : O(1)	 => No extra data structure is used
 */

/* Comparison of LC1–Two Sum Vs LC167-Two Sum II
Feature	        LC 1 – Two Sum	        LC 167 – Two Sum II
Array	        Unsorted	            Sorted
Approach	    HashMap	                Two Pointers
Time	        O(n)	                O(n)
Space	        O(n)	                O(1)
Indexing	    0-based	                1-based
 */