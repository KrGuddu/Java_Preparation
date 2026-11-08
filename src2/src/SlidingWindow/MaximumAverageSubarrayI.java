package SlidingWindow;/* Pattern: Sliding Window, Fixed-Size Window
 */


public class MaximumAverageSubarrayI {
    //Brute Force Approach  =>TC: O(n*k), SC: O(1)
//    public double findMaxAverage(int[] nums, int k) {
//        double maxAvg = Double.NEGATIVE_INFINITY;
//
//        for (int i = 0; i <= nums.length - k; i++) {
//            int sum = 0;
//
//            for (int j = i; j < i + k; j++) {
//                sum += nums[j];
//            }
//            double avg = (double) sum / k;
//            maxAvg = Math.max(maxAvg, avg);
//        }
//        return maxAvg;
//    }

    //Optimized Approach — Fixed Size Sliding Window    [Time: O(n) =>Each element is processed once, Space: O(1) =>Only variables are used]
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // Calculate initial window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        // Slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}


/*
Brute Force Approach
Logic:
1. Har starting index se k elements ka sum calculate karo.
2. Har subarray ka average calculate karo.
3. Maximum average return karo.


Optimized Approach — Fixed Size Sliding Window      =>Most Important
Logic:
Instead of calculating the sum again and again, maintain a window of size k.
- Add the new element entering the window.
- Remove the old element leaving the window.
- Update the maximum sum.



Pattern Identification
Whenever a question says:
- Find maximum/minimum sum of a subarray of size k.
- Find maximum/minimum average of a subarray of size k.
- Find a contiguous subarray of exactly k elements.

Think about: Fixed-Size Sliding Window
 */