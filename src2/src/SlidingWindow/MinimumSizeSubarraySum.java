package SlidingWindow;/* Pattern: Sliding Window,  Variable-Size Window
Problem Understanding
Given:
- An array of positive integers nums.
- A target value target.
Find the minimum length of a contiguous subarray whose sum is greater than or equal to target.
If no such subarray exists, return 0.

Example:
nums = [2, 3, 1, 2, 4, 3]
target = 7

Possible valid subarrays:
Subarray	    Sum	    Length
[2, 3, 1, 2]	8	    4
[3, 1, 2, 4]	10	    4
[4, 3]	        7	    2

Answer = 2
Because [4, 3] has the minimum length and its sum is equal to 7.
 */


public class MinimumSizeSubarraySum {
    //Brute Force Approach  =>Time: O(n^2), Space: O(1)
    // public int minSubArrayLen(int target, int[] nums) {
    //     int minLen = Integer.MAX_VALUE;

    //     for (int i = 0; i < nums.length; i++) {
    //         int sum = 0;
    //         for (int j = i; j < nums.length; j++) {
    //             sum += nums[j];
    //             if (sum >= target) {
    //                 minLen = Math.min(minLen, j - i + 1);
    //                 break;
    //             }
    //         }
    //     }
    //     return minLen == Integer.MAX_VALUE ? 0 : minLen;
    // }


    //Optimized Approach — Variable Size Sliding Window
    // Time: O(n) =>right and left each traverse the array at most once
    // Space: O(1)	=>Only a few variables are used
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}


/*
1. Brute Force Approach
Logic:
1. Start from every index i.
2. Calculate the sum by expanding the subarray using j.
3. Whenever sum >= target, update the minimum length.
4. Break because all elements are positive, so expanding further cannot decrease the sum or improve the length.


2. Optimized Approach — Variable Size Sliding Window
Most Important — O(n)
Core Logic:

Unlike LC 643, where window size is fixed, here the window size keeps changing.

We use two pointers:
- left → Starting index of the window.
- right → Ending index of the window.

Rules:
1. Expand window by moving right and adding nums[right] to sum.
2. Whenever sum >= target, we have a valid subarray.
3. Update minLen.
4. Shrink window by removing nums[left] and incrementing left.
5. Repeat shrinking while sum >= target.


Visual understanding:
target = 7

[2, 3, 1, 2, 4, 3]
 L           R

sum = 12

Since sum >= 7:
Update minimum length = 5

Remove nums[left] = 2

   [3, 1, 2, 4, 3]
    L        R

sum = 10

Update minimum length = 4

Remove nums[left] = 3

      [1, 2, 4, 3]
       L     R

sum = 7

Update minimum length = 3

Remove nums[left] = 1

         [2, 4, 3]
          L  R

sum = 6

sum < target → Stop shrinking.


Continue expanding right until the array ends. Eventually the window [4, 3] gives length 2.



Why is it O(n), not O(n²)?
Although we use a while loop inside a for loop:
- right moves from 0 to n-1.
- left also moves from 0 to n-1 at most.
- Neither pointer moves backwards.
Therefore, total operations are approximately \(2n\), which gives \(O(n)\).
 */