//By Normal Method

package Recursion;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n*(n+1)/2;
        System.out.println(sum);
    }
}


//jab coding platform par main function ki jagah function template ho to:
//class Solution {
//    public int findSum(int n) {
//        return n * (n + 1) / 2;
//    }
//}


/* Formula:
Sum of natural numbers(1+2+3+...+ n-2 + n-1 +n): n*(n+1)/2
Sum of cubes of natural numbers(1^3 +2^3 +3^3 +...+ (n-2)^3 + (n-1)^3 +n^3) : [n(n+1)/2]^2
                                                                            : [n^2*(n+1)^2]4
 */

/*
Time Complexity: O(1) → sirf ek calculation
Space Complexity: O(1) → extra memory nahi
 */