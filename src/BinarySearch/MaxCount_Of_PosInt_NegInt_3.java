//Method3: Simple Linear Scan       =>Agar question specifically binary search nahi maang raha, sabse simple.
//T.C. = O(n),  S.C. = O(1)

package BinarySearch;

public class MaxCount_Of_PosInt_NegInt_3 {
    public int maximumCount(int[] nums) {
        int negCount = 0;
        int posCount = 0;

        for (int num : nums) {
            if (num < 0) {
                negCount++;
            } else if (num > 0) {
                posCount++;
            }
        }

        return Math.max(negCount, posCount);
    }
}
