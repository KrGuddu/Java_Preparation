package PrefixSum;

public class ProductOfArrayExceptSelf {
    //1st method: Brute Force Approach
    //For every index, multiply all elements except the current element.
    //T.C. = O(n²)
    //S.C. = O(1) auxiliary space (excluding output array).
    // public int[] productExceptSelf(int[] nums) {
    //     int n = nums.length;
    //     int[] answer = new int[n];

    //     for (int i = 0; i < n; i++) {
    //         int product = 1;
    //         for (int j = 0; j < n; j++) {
    //             if (i != j) {
    //                 product *= nums[j];
    //             }
    //         }
    //         answer[i] = product;
    //     }
    //     return answer;
    // }


    //2nd method: Prefix & Suffix Arrays    [T.C. = O(n), S.C. = O(n) auxiliary space.]     =>Better
    // public int[] productExceptSelf(int[] nums) {
    //     int n = nums.length;
    //     int[] prefix = new int[n];
    //     int[] suffix = new int[n];
    //     int[] answer = new int[n];

    //     prefix[0] = 1;  // Calculate prefix products

    //     for (int i = 1; i < n; i++) {
    //         prefix[i] = prefix[i - 1] * nums[i - 1];
    //     }

    //     suffix[n - 1] = 1;      // Calculate suffix products

    //     for (int i = n - 2; i >= 0; i--) {
    //         suffix[i] = suffix[i + 1] * nums[i + 1];
    //     }

    //     for (int i = 0; i < n; i++) {       // Calculate final answer
    //         answer[i] = prefix[i] * suffix[i];
    //     }
    //     return answer;
    // }


    //3rd method: Prefix + Suffix Variables     [Most Important for Interviews]     =>Best
    /*
     Instead of maintaining separate prefix and suffix arrays, use the output array itself to store prefix products.
     Then traverse from right to left and multiply each position by the running suffix product.
    */
    // T.C. = O(n) — two traversals.
    // S.C. = O(1) auxiliary space (excluding output array).
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;      // Step 1: Calculate prefix products

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int suffix = 1;     // Step 2: Calculate suffix products

        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        return answer;
    }
}



/*
# Important Edge Cases
Case 1: Contains zero
nums = [1, 2, 0, 4]
Output = [0, 0, 8, 0]

No special zero-handling logic is required in the optimal approach.

Case 2: Contains two zeros
nums = [0, 2, 0, 4]
Output = [0, 0, 0, 0]


Case 3: Negative numbers
nums = [-1, 2, 3]
Output = [6, -3, -2]


The same algorithm works for all these cases.



# Important Interview Concepts
Question	                                    Answer
Which pattern is used?	                        Prefix + Suffix Product
Why no division?	                            Problem explicitly prohibits division
Why initialize answer[0] = 1?	                No elements exist to its left
Why initialize suffix = 1?	                    No elements exist to its right at the last index
Why traverse backward for suffix?	            We need the product of elements to the right
Why use nums[i] after updating answer?	        To include the current element in the suffix for the next iteration
Does it handle zeros?	                        Yes
Can we achieve O(1) auxiliary space?	        Yes, by reusing the output array


# Difference Between LC 560, 525 and 238
Concept	                LC 560	                    LC 525	                    LC 238
1. Pattern	            Prefix Sum + HashMap	    Prefix Sum + HashMap	    Prefix + Suffix Product
2. Objective	        Count subarrays	            Longest subarray	        Product except self
3. HashMap	            Frequency	                First index	                Not required
4. Main technique	    sum - k	                    Equal prefix sums	        Left product × Right product
5. Complexity	        O(n)	                    O(n)	                    O(n)

# Notebook Revision Notes
1. Pattern: Prefix Product + Suffix Product.
2. answer[i] initially stores product of all elements on the left.
3. suffix stores product of all elements on the right.
4. answer[i] *= suffix combines both products.
5. No division required.
6. T.C. = O(n), Auxiliary S.C. = O(1).

My recommendation: Learn the optimal two-pass approach properly. Pay special attention to why we use nums[i - 1] in the prefix loop and why we update suffix after updating answer[i]. These are common dry-run and coding-round mistakes.
 */