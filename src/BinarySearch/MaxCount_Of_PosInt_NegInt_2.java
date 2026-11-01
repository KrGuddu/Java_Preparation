/* Method 2: Two Separate Binary Searches  [By Sir]          =>good
   T.C.= O(log n) + O(log n) = O(2 log n) = O(log n)         =>because we perform two independent binary searches
   S.C. = O(1)       //because we use only constant extra variables.    //No extra data structures or recursion.    //We are using [int n; int lo; int hi; int mid; int negCount; int posCount;]  No extra array, Stack, Queue, recursion, etc. So, S.C. = O(1)
*/

package BinarySearch;

public class MaxCount_Of_PosInt_NegInt_2 {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // First non-negative → negative count
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] >= 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        int negCount = lo;

        // First positive → positive count
        lo = 0;
        hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] > 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        int posCount = n - lo;
        return Math.max(negCount, posCount);
    }
}


/* One important learning: Your two searches are actually examples of boundary search:
- First search → Lower Bound of 0 (first element >= 0).
- Second search → Upper Bound of 0 (first element > 0).

This connects directly to the Floor, Lower Bound and Upper Bound concepts you were studying earlier.

Remember: Zero is neither negative nor positive. That's why you need two different boundaries.
 */