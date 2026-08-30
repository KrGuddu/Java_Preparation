package Recursion;

public class LC_704_Binary_Search {
    public int helper(int[] nums, int target, int lo, int hi){      //Binary search me 2 index lene parte hai low and high.
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return helper(nums, target, lo, mid-1);       //since, nums[mid]>target so hi=mid-1. So search space low to mid-1 tak bacha, mid+1 to high neglect ho gya.
        else return helper(nums, target, mid+1, hi);    //search space mid+1 to high tak bacha
    }
    public int search(int[] nums, int target) {         //Qki ye 2 hi variable hai so ek helper function banani hogi.
        int n = nums.length;
        return helper(nums, target, 0, n-1);
    }
}


// Note: Binary search me 3 hisse hote hai left-half, middle element, right-half.
//T.C.: log(n)
//A.S.: log(n)