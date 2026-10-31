// LC.704 Binary Search
// https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1

package BinarySearch;

public class BinarySearch_LC704 {
    //1st method: Iterative Binary Search
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }


    //2nd method: Recursive Binary Search
//    public int helper(int[] nums, int target, int lo, int hi){      //Binary search me 2 index lene parte hai low and high.
//        if(lo>hi) return -1;
//        int mid = lo + (hi-lo)/2;
//        if(nums[mid]==target) return mid;
//        else if(nums[mid]>target) return helper(nums, target, lo, mid-1);       //since, nums[mid]>target so hi=mid-1. So search space low to mid-1 tak bacha, mid+1 to high neglect ho gya.
//        else return helper(nums, target, mid+1, hi);    //search space mid+1 to high tak bacha
//    }
//    public int search(int[] nums, int target) {         //Qki ye 2 hi variable hai so ek helper function banani hogi.
//        int n = nums.length;
//        return helper(nums, target, 0, n-1);
//    }
}



/* Recursive vs Iterative
Comparison	                Recursive	            Iterative
1. Technique	            Function calls	        While loop
2. Base case	            lo > hi	                Loop ends
3. Space	                O(log n)	            O(1)
4. Time	                    O(log n)	            O(log n)
5. Extra function	        Yes	                    No

Yaad rakhne wali baat:
- Recursive: return helper(...) → Next recursive call.
- Iterative: lo = mid + 1 / hi = mid - 1 → Update search range, then loop continues.
- Dono approaches mein mid ko search space se eliminate karte hain.

My recommendation: Dono approaches seekho, lekin interviews aur coding practice mein iterative approach ko priority do. Ismein auxiliary space O(1) hoti hai.
 */