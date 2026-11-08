package SlidingWindow;
import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    //Brute Force Approach  [Time: O(n*k); Space: O(n-k+1) for the answer array; Auxiliary Space: O(1)]
    // public int[] maxSlidingWindow(int[] nums, int k) {
    //     int n = nums.length;
    //     int[] ans = new int[n - k + 1];

    //     for (int i = 0; i <= n - k; i++) {
    //         int max = Integer.MIN_VALUE;
    //         for (int j = i; j < i + k; j++) {
    //             max = Math.max(max, nums[j]);
    //         }
    //         ans[i] = max;
    //     }
    //     return ans;
    // }

    //Optimized Approach — Sliding Window + Monotonic Deque
    // Time: O(n)	=>Each index is inserted and removed at most once
    // Auxiliary Space: O(k)	=>Deque stores at most k indices
    // Output Space: O(n-k+1)	=>Result array
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {   // 1. Remove expired indices
                deque.removeFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {     // 2. Remove smaller elements from back
                deque.removeLast();
            }
            deque.addLast(i);   // 3. Add current index

            if (i >= k - 1) {   // 4. Store maximum of current window
                ans[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return ans;
    }
}


/* Complexity Analysis
Time: O(n)	=>Each index is inserted and removed at most once
Auxiliary Space: O(k)	=>Deque stores at most k indices
Output Space: O(n-k+1)	=>Result array


# Common Mistakes
Mistake	                                                        Correct approach
Storing values instead of indices	                            Store indices
Removing expired elements from back	                            Remove from front
Removing smaller elements from front	                        Remove from back
Using if instead of while for smaller elements	                Use while
Returning nums[deque.peekFirst()] before a full window	        Check i >= k-1
Using i-k+1 incorrectly	                                        Use it as answer array index
 */