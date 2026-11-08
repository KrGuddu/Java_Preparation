package TwoPointers;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for(int fast=1; fast<nums.length; fast++){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;      //Also, we can use int k = slow + 1;
    }
}


/*
TC: O(n)
AS: O(1)
*/