// 2nd method  ==> best way
package Loops;
import java.util.Scanner;

public class CountDigit_2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        n = Math.abs(n);    //Handle negative numbers → Agar number negative hai to positive bana do

        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);

    }
}


/* Dry Run
Input: 12345

Iteration	n	    count++	    n/10
1	        12345	1	        1234
2	        1234	2	        123
3	        123	    3	        12
4	        12	    4	        1
5	        1	    5	        0

Output:
Number of digits: 5

How it works
1. count = 0 initializes the digit counter.
2. count++ increases the counter by one for each digit.
3. n = n / 10 removes the last digit using integer division.
4. The loop stops when n becomes 0.

Important cases:
- 12345 → 5 digits
- 7 → 1 digit
- 0 → 1 digit
- -123 → 3 digits

Time Complexity: O(log|n|), or O(d), where d is the number of digits.
Space Complexity: O(1).
 */