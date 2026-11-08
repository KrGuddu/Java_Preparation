package TwoPointers;/* Problem Understanding: Given an array nums containing only three values:
- 0 → Red
- 1 → White
- 2 → Blue
Sort the array in-place so that all 0s come first, followed by all 1s, then all 2s.

Important conditions:
- Do not use a library sorting function.
- Solve it in a single pass.
- Use O(1) extra space.

Example:
Input:  nums = [2, 0, 2, 1, 1, 0]
Output: [0, 0, 1, 1, 2, 2]
 */

public class SortColors {
    //Pattern: Two Pointers – Dutch National Flag Algorithm
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) mid++;
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 2nd method : Counting sort (count 0s, 1s, 2s)    => 2-passes     =>TC: O(n), AS: O(1)
    // Dutch National Flag	=> 1-pass   => TC: O(n), AS: O(1)
}


/*
Time : O(n)  =>Each element is processed at most once
Auxiliary Space: O(1)  =>Only three pointers and a temporary variable
*/