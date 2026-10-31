/* Peak Index in a Mountain Array
Meaning: Mountain Array ek aisa array hota hai jisme elements pehle strictly increase hote hain, phir ek point par maximum value (Peak) aati hai, aur uske baad strictly decrease hote hain.
Ex: arr = [1, 3, 5, 8, 6, 4, 2]
- Increasing part: 1, 3, 5, 8
- Peak element: 8
- Decreasing part: 6, 4, 2
- Peak Index: 3 (0-based indexing)
 */

package BinarySearch;

public class Peak_Index_In_Mountain_Array {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 1, hi = arr.length - 2;
        while (lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;              //Agar mid apne aaju/left and baju/right dono se bada/big hai to mid hi peak index honge so mid ko return kar denge.
            else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) lo = mid +1;       //Agr aaju se bada but baju se chota hai to right jayege.   =>Agr mid baju se chota hai matlab baju mid se bada hai, so right jao.
            else hi = mid -1;                                                           //Agr aaju se chota but baju se bada hai to left jayege.
        }
        return 255664;    //In this type of questions should to return any value. Ex: 255664
    }
}
//TC: o(log n), SC: O(1)


/*
              PEAK
             / \\
            /   \\
           /     \\
          /       \\
         /         \\
       low         high
 */

/* Visualize the three cases
Case 1: Peak found
     8
    / \
   5   6


arr[mid] > arr[mid-1] AND arr[mid] > arr[mid+1]
Return mid.

Case 2: Right side mein jao
     5     8
    / \   /
   3   6 /


arr[mid] < arr[mid+1]
lo = mid + 1

Case 3: Left side mein jao
      8
     / \
    6   4
   /
  3


arr[mid] > arr[mid+1]
hi = mid
 */


/* Notebook revision notes
Peak Index – Binary Search
- arr[mid] < arr[mid+1] → Increasing slope → Right.
- arr[mid] > arr[mid+1] → Decreasing slope → Left (including mid).
- lo == hi → Peak index found.

Remember:
if (arr[mid] < arr[mid+1]) lo = mid+1;
else hi = mid;
 */


/*
Q. Why is lo=1, hi=arr.length-2 in Mountain array
Ans: Peak element kabhi first index (0) ya last index (n-1) par nahi ho sakta.

B/q Mountain Array ki condition
LeetCode 852 ke according:
- Array strictly increasing hota hai.
- Uske baad strictly decreasing hota hai.
- Peak dono neighbours se strictly bada hota hai.


Note: Dono neighbours check karne hain → lo = 1, hi = n-2.
      Sirf mid and mid+1 compare karne hain → lo = 0, hi = n-1 with while(lo < hi).
Important: Search boundaries algorithm ke comparison logic par depend karti hain, har Binary Search mein 0 aur n-1 use karna compulsory nahi hai.
 */