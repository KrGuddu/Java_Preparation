//Using brute-force (if-else) approach : If you specifically want to understand it without Stack first.

package Stacks;
import java.util.ArrayList;

public class NextGreaterElement_BF {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    ans.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if (found == false) {
                ans.add(-1);
            }
        }
        return ans;
    }
}


/* Dry run
arr = [1, 3, 2, 4]

For 1: 3 > 1 → yes
So: 1 → 3

For 3: 2 > 3 → no
       4 > 3 → yes
So: 3 → 4

For 2: 4 > 2 → yes
So: 2 → 4

For 4: No element exists on the right:
4 → -1

Final: [3, 4, 4, -1]

Time Complexity: O(n²)
Auxiliary Space: O(1) excluding the answer array.

For interviews, the important next step is the O(n) Stack/Monotonic Stack solution. This question is actually one of the standard problems for understanding monotonic stacks.
 */