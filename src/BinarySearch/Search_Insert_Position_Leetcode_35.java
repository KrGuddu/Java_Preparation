package BinarySearch;

public class Search_Insert_Position_Leetcode_35 {
}



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