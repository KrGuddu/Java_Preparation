//Pattern: Hashing +  HashSet

package HashMap_HashSet;
import java.util.HashSet;

public class ContainsDuplicate {
    //Method1: Brute Force Approach — Nested Loops   [Time: O(n²), AS: O(1)]
    // public boolean containsDuplicate(int[] nums) {
    //      for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] == nums[j]) return true;
    //         }
    //     }
    //     return false;
    // }

    //Method2: HashSet (Using add())      [Time: O(n) average, AS: O(n)]      => Optimized & The best
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
    //Note: We can also solve this using contains() and add() separately.

    //Method3: HashSet (Using contains() + add())       [Time: O(n) average, AS: O(n)]      => Optimized & The best
    // public boolean containsDuplicate(int[] nums) {
    //     HashSet<Integer> set = new HashSet<>();
    //     for (int num : nums) {
    //         if (set.contains(num)) return true;
    //         set.add(num);
    //     }
    //     return false;
    // }


    //Method4: Using Sorting    [Pattern: Sorting + Adjacent Element Comparison]    [TC: O(n log n), AS: O(log n) typically]    => Good alternative
    // public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);       // Step 1: Sort the array
    //     for (int i = 0; i < nums.length - 1; i++) {     // Step 2: Check adjacent elements
    //         if (nums[i] == nums[i + 1]) return true;
    //     }
    //     return false;
    // }
}
