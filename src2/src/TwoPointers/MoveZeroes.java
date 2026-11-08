package TwoPointers;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        //1st method (Two Pointers)     //TC: O(n), AS: O(1)    =>Best
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }


        //2nd method (Without Swapping)     //TC: O(n), AS: O(1)    =>good
        // int slow = 0;

        // // Move non-zero elements to the beginning
        // for (int fast = 0; fast < nums.length; fast++) {
        //     if (nums[fast] != 0) {
        //         nums[slow] = nums[fast];
        //         slow++;
        //     }
        // }

        // // Fill remaining positions with zeroes
        // while (slow < nums.length) {
        //     nums[slow] = 0;
        //     slow++;
        // }
    }
}



/* In 1st method
# Why do we use slow and fast?
Pointer	    Responsibility
slow	    Tracks the position where the next non-zero element should be placed
fast	    Traverses the array to find non-zero elements

Important observation:
When nums[fast] == 0, we don't increment slow because we haven't placed a non-zero element at that position yet.
When nums[fast] != 0, we swap and increment slow.

# Complexity Analysis
Complexity	        Value	Reason
Time	            O(n)	Only one traversal of the array
Auxiliary Space	    O(1)	Only one temporary variable is used
 */