//T.C. : O(log n),    S.C : O(1)
//For interview: "I use binary search on the answer range [0, n] and find the largest mid such that mid * mid <= n."

package BinarySearch;

public class SquareRoot {
    int floorSqrt(int n) {
        int lo=0;
        int hi=n;       //hi ko n par isliye rakha qki loop 0 to hi (means 0 to n) tak chalayege. like n=11 ka square root nikalne ke liye loop 0-11 tak chalega.
        int ans=0;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid<n){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }


    //By Brute force methods    //T.C. : O(n),    S.C : O(1)
//    int floorSqrt(int n) {
//        for(int i=1; i<=n; i++){
//            if(i*i == n) return i;
//            if(i*i >n) return i-1;
//        }
//        return 0;
//    }

}

/* Logics:
if (mid² == tar) return mid;            //mid hi perfect square root hai
if(mid² < tar) store and go right;      //can be our answer, but maybe there is a bigger valid number. so store it and recheck it bigger value.
else go left;                           //qki ye question binary search ka hai  and binary search sorted hoti hai to agar if condition fail hua to aage check karne ka koe matlab nhi hai, qki age isse bada number hi milega.
 */

/* Dry Run
if n = 11

Search Space:
0   1   2   3   4   5   6   7   8   9   10  11
↑                                           ↑
lo                                          hi

Iteration 1:
0   1   2   3   4  [5]  6   7   8   9   10  11
                   ❌
                  25 > 11
Search:
0 ─────────── 4

Iteration 2:
0   1  [2]  3   4
       ✅
       4 < 11

Store, answer = 2

Search:
3 ─── 4

Iteration 3:

3  [3]  4
    ✅
    9 < 11

answer = 3

Search:
4 ─── 4

Iteration 4:
[4]
 ❌
16 > 11

Search becomes:

low = 4
high = 3

low > high → STOP

ANSWER = 3
 */





/* Brute force pattern logic
i² == n  → exact answer → return i
i² > n   → answer = i - 1 → return i - 1
i² < n   → keep searching
 */