//Que: find the count of positive integers, negative integers, and zeros in an array. ==> the simplest method is a linear traversal.
//Note: For LeetCode 2529, zeros don't need to be counted separately. We only need: negative count and positive count. That's why binary search can be used there.
//But if the question explicitly asks for positive + negative + zero count, a simple for loop is the best approach.

//T.C. = O(n),  S.C. = O(1)

package BinarySearch;

public class Extra {
    public void countNumbers(int[] nums) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : nums) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
