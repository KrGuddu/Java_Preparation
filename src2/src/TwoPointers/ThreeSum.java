package TwoPointers;/*
Pattern: Two Pointers – Sorting + Opposite Direction
Problem Understanding: Given an integer array nums, find all unique triplets [arr[i], arr[j], arr[k]] such that: arr[i]+arr[j]+arr[k]=0

Important conditions:
- The sum of three elements must be zero.
- You cannot use the same index more than once.
- The answer must not contain duplicate triplets.
- The order of triplets in the result does not matter.

Example:
Input: nums = [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]

# Optimal Approach – Sorting + Two Pointers
The main idea is:
1. Sort the array.
2. Fix one element using a for loop (i).
3. Use two pointers (left and right) to find the remaining two elements.
4. Calculate the sum of all three elements.
5. If sum is zero, store the triplet.
6. If sum is less than zero, increment left.
7. If sum is greater than zero, decrement right.
8. Skip duplicate elements to avoid duplicate triplets.
 */

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // All remaining elements will be positive
            if (nums[i] > 0) break;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicate left elements
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right elements
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if (sum < 0) left++;
                else right--;
            }
        }
        return ans;
    }
}


/*
Dry Run
Input:
nums = [-1, 0, 1, 2, -1, -4]


After sorting:
nums = [-4, -1, -1, 0, 1, 2]


We fix one element using i and search for the other two using left and right.

Iteration 1: i = 0

Fixed element = -4
i	left	right	Values	Sum	Action
0	1	5	-4, -1, 2	-3	left++
0	2	5	-4, -1, 2	-3	left++
0	3	5	-4, 0, 2	-2	left++
0	4	5	-4, 1, 2	-1	left++

No triplet found.

Iteration 2: i = 1

Fixed element = -1
i	left	right	Values	Sum	Action
1	2	5	-1, -1, 2	0	Store triplet
1	3	4	-1, 0, 1	0	Store triplet

After this iteration, both pointers cross.

Iteration 3: i = 2

nums[2] == nums[1]

Skip this iteration because we already processed -1 as the fixed element.

Iteration 4: i = 3

Fixed element = 0.

Since left = 4 and right = 5, the sum is:

0 + 1 + 2 = 3

No valid triplet.

Final result:
[[-1, -1, 2], [-1, 0, 1]]

2-Unique Triplets Found
 */


/*  2-Unique Triplets Found
5. Most Important Concept – Duplicate Handling
This is the trickiest part of LC 15. There are three places where we handle duplicates.

A. Skip duplicate fixed elements
if (i > 0 && nums[i] == nums[i - 1]) {
    continue;
}


Example:
nums = [-4, -1, -1, 0, 1, 2]


When i = 2, nums[i] and nums[i-1] are both -1.

We skip it because we already considered -1 as the fixed element.

B. Skip duplicate left elements
while (left < right && nums[left] == nums[left - 1]) {
    left++;
}


C. Skip duplicate right elements
while (left < right && nums[right] == nums[right + 1]) {
    right--;
}


Why do we skip duplicates only after finding a valid triplet?

Because after finding a triplet, repeating the same left or right value would generate the same triplet again.
6. Why do we use Sorting?
Sorting serves two important purposes:
1. Makes duplicate elements adjacent, so we can skip them easily.
2. Allows us to decide pointer movement based on the sum.
Condition	Action	Reason
sum == 0	Store triplet, move both	Found a valid triplet
sum < 0	left++	Need a larger sum
sum > 0	right--	Need a smaller sum

Why if (nums[i] > 0) break?

Because the array is sorted.

If the fixed element is positive, all elements after it will also be positive.

Therefore, their sum cannot be zero.
7. Complexity Analysis
Operation	Complexity
Sorting	O(n log n)
Outer loop	O(n)
Inner two-pointer traversal	O(n) per iteration
Overall Time	O(n²)
Auxiliary Space	O(log n) for Java sorting stack; O(1) for the two-pointer logic

Output list space is excluded from auxiliary space.
8. Comparison: LC 167 vs LC 15
Feature	LC 167 – Two Sum II	LC 15 – 3Sum
Sorting	Already sorted	Sort required
Fixed element	No	Yes (i)
Pointers	2	2 + fixed index
Target	Given target	-nums[i]
Duplicate handling	Not required	Required
Time	O(n)	O(n²)

9. Notebook Notes – LC 15
- Pattern: Sorting + Two Pointers.
- Sort the array first.
- Fix one element using i.
- Initialize left = i + 1, right = n - 1.
- Calculate sum = nums[i] + nums[left] + nums[right].
- sum < 0 → left++.
- sum > 0 → right--.
- sum == 0 → Store triplet and move both pointers.
- Skip duplicates for i, left and right.
- If nums[i] > 0, break.


Reference: LeetCode 15 – 3Sum · NeetCode explanation

My recommendation: Practice the duplicate-skipping logic separately. Understanding those three conditions is more important than memorizing the complete code.
 */