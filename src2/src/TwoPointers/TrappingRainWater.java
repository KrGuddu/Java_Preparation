package TwoPointers;/* Problem understanding: You are given an integer array height[], where each element represents the height of a vertical bar.
After raining, calculate how much water can be trapped between these bars.

Example:
height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6

Why 6?
The total trapped water across all positions is:
Position:  0 1 2 3 4 5 6 7 8 9 10 11
Height:    0 1 0 2 1 0 1 3 2 1  2  1
Water:     0 0 1 0 1 2 1 0 0 1  0  0
                         ----------
Total = 1 + 1 + 2 + 1 + 1 = 6


# Important concept: How much water can a bar store?
For any index i:
water[i] = min(maxLeft,maxRight) - height[i]

Where:
- maxLeft = maximum height from index 0 to i.
- maxRight = maximum height from index i to n-1.
- height[i] = current bar height.

Example:
        |
    |   |
    | ~ |
  | | ~ |
  | | ~ |
------------

Water level depends on the shorter of the tallest bars on the left and right.
*/


public class TrappingRainWater {
    //Brute force approach  =>Time: O(n^2), Space: O(1)
    // public int trap(int[] height) {
    //     int n = height.length;
    //     int totalWater = 0;

    //     for (int i = 0; i < n; i++) {
    //         int maxLeft = 0;
    //         int maxRight = 0;

    //         for (int j = 0; j <= i; j++) {
    //             maxLeft = Math.max(maxLeft, height[j]);
    //         }
    //         for (int j = i; j < n; j++) {
    //             maxRight = Math.max(maxRight, height[j]);
    //         }
    //         totalWater += Math.min(maxLeft, maxRight) - height[i];
    //     }
    //     return totalWater;
    // }

    //Optimal approach — Two Pointers   =>T.C.: O(n), S.C.: O(1).
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxLeft = 0;
        int maxRight = 0;

        int water = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    water += maxLeft - height[left];
                }
                left++;
            }
            else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    water += maxRight - height[right];
                }
                right--;
            }
        }
        return water;
    }
}


/*
Important difference between LC 11 and LC 42:
- LC 11 calculates the maximum water held by one container.
- LC 42 calculates the total water trapped across multiple positions.
 */