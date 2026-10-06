package BinarySearch;

public class Smallest_Letter_Greater_Than_Target_Leetcode_744 {
    public char nextGreatestLetter(char[] letters, char target){
        int lo=0, hi=letters.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(letters[mid]<=target) lo=mid+1;
            else hi=mid-1;
        }
        return letters[lo % letters.length];
    }
}


/*
This question is Opposite of Floor_in_Sorted_Array_gfg
So, Main logic is:
letters[mid] <= target
        ↓
ye answer nahi hai
        ↓
right jao
        ↓
lo = mid + 1

Aur:
letters[mid] > target
        ↓
possible answer
        ↓
left jao
        ↓
hi = mid - 1

Example:
letters = ['c', 'f', 'j']
target = 'c'

Binary search ke baad:
lo = 1
letters[1] = 'f'

Answer:
'f'

lo % letters.length kyu?
Problem mein wrap-around hai.

Example:
letters = ['c', 'f', 'j']
target = 'j'

j se greater koi character nahi hai, to answer first character 'c' hoga.

Search ke baad: lo = 3 par chala jayega jo ki exist hi nhi karta hai invalid hai.
So: letters[lo % letters.length]

gives:
letters[3 % 3]
letters[0]
'c'

Important: Is problem mein ans ki zarurat nahi hai. lo directly smallest element greater than target ka insertion position deta hai.
* */


/* Index-based Visual Dry Run
arr = ["c", "f", "j"]
target = "c"

["c",  "f",  "j"]
  ↑      ↑      ↑
 lo     mid    hi
  0      1      2

arr[mid] = "f"
"f" > "c" ✅
→ possible answer
→ hi = mid - 1 = 0

Now:
["c",  "f",  "j"]
  ↑
 lo,mid
  ↑
 hi
  0

mid = (0 + 0) / 2 = 0
arr[mid] = "c"

"c" > "c" ❌
→ lo = mid + 1 = 1

Now:
["c",  "f",  "j"]
       ↑
    lo, mid
       ↑
      hi = 0

lo = 1
hi = 0

lo > hi → STOP

Answer
return letters[lo]

return letters[1] = "f"

✅ Answer = "f"
Pattern:
arr[mid] > target → hi left
arr[mid] <= target → lo right
Loop end → lo = smallest letter greater than target
 */



/* 1. Lexicographically Smaller: Agar string dictionary order mein pehle aati hai → smaller.
        Ex: "apple" < "banana" Because a < b        ==> a is lexicographically smaller than b
   2. Lexicographically Greater: Agar string dictionary order mein baad mein aati hai → greater.
        Ex: "dog" > "cat" Because: d > c            ==> d is lexicographically greater than c

   Tips: "a" < "b" < "c" < ... < "z"

   Note: Java mein:
        "a".compareTo("b")   // negative → a smaller
        "b".compareTo("a")   // positive → b greater
        "a".compareTo("a")   // 0 → equal
 */