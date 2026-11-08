package HashMap_HashSet;

public class SubarraySumEqualsK {
    //1st method: Brute Force Approach      [T.C. = O(n³), S.C. = O(1)]
    // Generate every possible subarray and calculate its sum.
    // public int subarraySum(int[] nums, int k) {
    //     int count = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i; j < nums.length; j++) {
    //             int sum = 0;
    //             for (int l = i; l <= j; l++) {
    //                 sum += nums[l];
    //             }
    //             if (sum == k) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    //2nd method: Running Sum       [T.C. = O(n²), S.C. = O(1)]     => Better Approach
    //Instead of calculating the sum again for every subarray, maintain a running sum.
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) count++;
            }
        }
        return count;
    }


    //3rd method: Prefix Sum + HashMap      =>Optimal Approach [Most Important for Interviews]
    //1. T.C. = O(n) — one traversal, average O(1) HashMap operations.
    //2. S.C. = O(n) — HashMap can store up to n+1 prefix sums.
    // public int subarraySum(int[] nums, int k) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     map.put(0, 1);
    //     int sum = 0;
    //     int count = 0;

    //     for (int num : nums) {
    //         sum += num;
    //         count += map.getOrDefault(sum - k, 0);          // Check whether (sum - k) exists
    //         map.put(sum, map.getOrDefault(sum, 0) + 1);     // Store current prefix sum frequency
    //     }
    //     return count;
    // }
}



/* 3rd method: Prefix Sum + HashMap     =>Optimal Approach      =>Most Important for Interviews
Core concept:

We know:
PrefixSum = Sum(0 to j)

Suppose we want a subarray sum equal to k.
PrefixSum - PreviousPrefixSum = k

Therefore:
PreviousPrefixSum = PrefixSum - k

So, while traversing the array:
1. Calculate the current prefix sum.
2. Check whether sum - k exists in the HashMap.
3. If it exists, add its frequency to count.
4. Store/update the current prefix sum frequency.
 */