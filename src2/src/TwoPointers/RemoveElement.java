package TwoPointers;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        //Optimal Approach – Slow & Fast Pointers       //TC: O(n), AS: O(1)    =>Best
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;

        //2nd method (Without swapping)         //TC: O(n), AS: O(1)
        // int slow = 0;
        // for (int fast = 0; fast < nums.length; fast++) {
        //     if (nums[fast] != val) {
        //         nums[slow] = nums[fast];
        //         slow++;
        //     }
        // }

        // int k = slow;

        // while (slow < nums.length) {
        //     nums[slow] = 0;
        //     slow++;
        // }
        // return k;
    }
}


/*
Time : O(n)	=> One traversal of the array
Auxiliary Space	: O(1) => No extra array or data structure


Important Concept to Remember
Variable	                    Meaning
1. slow after first loop	    Number of valid elements
2. slow after second loop	    Total array length
3. k	                        Number of valid elements (answer)
*/