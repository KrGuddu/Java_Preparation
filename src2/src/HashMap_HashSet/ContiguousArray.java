package HashMap_HashSet;
import java.util.HashMap;

public class ContiguousArray {
    //1st method: Brute Force Approach      [T.C. = O(n³), S.C. = O(1)]
    //Generate all possible subarrays and count the number of zeros and ones.
    // public int findMaxLength(int[] nums) {
    //     int maxLen = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i; j < nums.length; j++) {
    //             int zeros = 0;
    //             int ones = 0;

    //             for (int k = i; k <= j; k++) {
    //                 if (nums[k] == 0) zeros++;
    //                 else ones++;
    //             }

    //             if (zeros == ones) {
    //                 maxLen = Math.max(maxLen, j - i + 1);
    //             }
    //         }
    //     }
    //     return maxLen;
    // }

    //2nd method: Running Count   [[T.C. = O(n²), S.C. = O(1)]]     =>Better
    //Instead of recounting zeros and ones for every subarray, maintain their running counts.
    // public int findMaxLength(int[] nums) {
    //     int maxLen = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         int zeros = 0;
    //         int ones = 0;

    //         for (int j = i; j < nums.length; j++) {
    //             if (nums[j] == 0) zeros++;
    //             else ones++;

    //             if (zeros == ones) {
    //                 maxLen = Math.max(maxLen, j - i + 1);
    //             }
    //         }
    //     }
    //     return maxLen;
    // }

    //3rd method: Prefix Sum + HashMap      [T.C. = O(n), S.C. = O(n)]  =>The best
    /*
     Core Concept: The trick is to convert the binary array into an array containing -1 and +1.
     0 → -1
     1 → +1

     Why: Because we want equal numbers of zeros and ones.
     For example:
     nums = [0, 1, 0, 1]
     Convert: arr = [-1, 1, -1, 1]

     Now calculate the prefix sum:
     Index:       0    1    2    3
     Array:      -1    1   -1    1
     Prefix:     -1    0   -1    0

    */
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;     // Convert 0 to -1 and 1 to +1
            if (map.containsKey(sum)) {         // Check whether prefix sum appeared before
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);                // Store only the first occurrence
            }
        }
        return maxLen;
    }

}
