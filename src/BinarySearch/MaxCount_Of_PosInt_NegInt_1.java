//Method1: 2-Binary Searches — Recommended  =>interview-friendly
//T.C.= O(log n),   S.C.= O(1)

package BinarySearch;

public class MaxCount_Of_PosInt_NegInt_1 {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int firstPositive = lowerBound(nums, 1);
        int firstNonNegative = lowerBound(nums, 0);

        int negCount = firstNonNegative;
        int posCount = n - firstPositive;

        return Math.max(negCount, posCount);
    }

    private int lowerBound(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}


/* Approach
Array sorted hai:
- Negative numbers → left side me hogi
- 0 → middle
- Positive numbers → right side

Isliye binary search se:
1. First positive (> 0) ka index find karo.
2. First non-negative (>= 0) ka index find karo.
3. Negative count = firstNonNegative
4. Positive count = n - firstPositive
5. Answer = max(negativeCount, positiveCount)
 */


/* Index-based Visual Dry Run
nums = [-3, -2, -1, 0, 0, 2, 4, 5]

           0    1    2   3   4   5  6  7
nums =   [-3,  -2,  -1,  0,  0,  2, 4, 5]
           ↑              ↑       ↑
         negative       non-neg  positive


1. Find first positive (target = 1)     =>low = 0, high = 8

low	   high	   mid	   nums[mid]    Decision
0	    8	    4	    0	        0 < 1 → low = 5
5	    8	    6	    4	        4 >= 1 → high = 6
5	    6	    5	    2	        2 >= 1 → high = 5

Now: low = high = 5
So:
firstPositive = 5
positiveCount = 8 - 5 = 3

Visual:
[-3, -2, -1, 0, 0, 2, 4, 5]
                   ↑
                 index 5

Positive = [2, 4, 5]        => 3 numbers


2. Find first non-negative (target = 0)     =>low = 0, high = 8
low	   high    mid	   nums[mid]	Decision
0	    8	    4	    0	        0 >= 0 → high = 4
0	    4	    2	    -1	        -1 < 0 → low = 3
3	    4	    3	    0	        0 >= 0 → high = 3


Now: low = high = 3
So:
firstNonNegative = 3
negativeCount = 3

Visual:
[-3, -2, -1,  0,  0,  2,  4,  5]
 ←─negative─→
   3 numbers

Final
negativeCount = 3
positiveCount = 3

answer = max(3, 3)
       = 3
 */