//Best practice
//Ques: Two Sum / Pair Sum (i.e. sum of any two elements of array is equal to any 3rd elements or equal to any given number.)
//This is Brute Force Method: Har possible pair ko try karna

package Array;

public class TwoSum_2nd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 7;

        System.out.println(twosum(arr, target));
    }

    public static boolean twosum(int[] arr, int target){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}



/* DSA classification
Array
 └── Searching / Pair problems
      └── Two Sum
           ├── Brute Force → O(n²) ← Current approach           //Space: O(1)
           ├── HashMap → O(n)   ← optimized
           └── Two Pointer → O(n)
                (usually sorted array ke saath)
 */