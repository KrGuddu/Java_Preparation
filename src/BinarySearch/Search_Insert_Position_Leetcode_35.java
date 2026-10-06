package BinarySearch;

public class Search_Insert_Position_Leetcode_35 {
    //1st method: Lower Bound concept   //T.C.: O(log n)  A.S.: O(1)
    public int searchInsert(int[] nums, int target) {
        int lo=0, hi=nums.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]<target) lo=mid+1;
            else hi=mid-1;
        }
        return lo;          //Important: Target nahi mila to lo hi answer hota hai, kyunki lo exactly us position par pahunchta hai jahan target insert karna chahiye.
    }



    //Normal Binary Search      //T.C.: O(log n)  A.S.: O(1)
//    public int searchInsert(int[] nums, int target) {
//        int lo = 0, hi = nums.length - 1;
//
//        while (lo <= hi) {
//            int mid = (lo + hi) / 2;
//            if (nums[mid] == target) {
//                return mid;
//            }
//            else if (nums[mid] < target) {
//                lo = mid + 1;
//            }
//            else {
//                hi = mid - 1;
//            }
//        }
//
//        return lo;
//    }
}


/* Main Idea
nums[mid] == target → return mid
nums[mid] < target → right jao  → lo = mid + 1
nums[mid] > target → left jao   → hi = mid - 1
 */

/* Index-based Visual Dry Run (when target is not exist in array then return last element index)
arr = [1, 3, 5, 6], target = 7

[1,  3,  5,  6]
 ↑   ↑       ↑
lo  mid      hi

arr[mid] = 3 < 7    → lo = mid + 1 = 2

[1,  3,  5,  6]
         ↑   ↑
        lo  mid
             ↑
             hi

mid = (2 + 3) / 2 = 2       arr[mid] = 5 < 7        → lo = mid + 1 = 3

[1,  3,  5,  6]
             ↑
          lo,mid,hi

arr[mid] = 6 < 7        → lo = mid + 1 = 4

[1,  3,  5,  6]
             ↑   ↑
         hi,mid  lo

lo > hi → STOP

return lo = 4
 */



/*
Most important part of this question is:
if (nums[mid] < target) {
    lo = mid + 1;
}
else {
    hi = mid - 1;
}


Agar nums[mid] target se chhota hai → right jao.
Agar nums[mid] target se bada hai → left jao.
Aur jab loop khatam hota hai:
return lo;

lo exactly woh position hoti hai jahan target insert hona chahiye.


Example: target = 2
nums = [1, 3, 5, 6]

Initially:
lo = 0
hi = 3

Iteration 1
mid = 1
nums[mid] = 3

3 > 2
hi = mid - 1
hi = 0

Iteration 2
mid = 0
nums[mid] = 1

1 < 2
lo = mid + 1
lo = 1

Now:
lo = 1
hi = 0

Loop ends.
return lo;

Answer:
1

Because 2 should come here:
[1, 2, 3, 5, 6]
    ↑
   index 1

Connection with Floor
Tumne abhi Floor problem mein dekha tha:

arr[mid] <= x
       ↓
ans = mid
       ↓
right jao

LC 35 mein:
nums[mid] < target
       ↓
right jao

और अंत में:
return lo;

LC 35 = lower bound type binary search
Floor = last position where arr[i] <= x
LC 744 = first position where letters[i] > target

Note: Ye teen problems ko ek saath samajh loge to binary search ke bahut saare questions easy ho jayenge.
* */