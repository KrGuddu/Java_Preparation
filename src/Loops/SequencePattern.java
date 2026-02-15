/* Que: Take ‘n’ as input from user and print the following sequence...   ==> This is Two pointer logic
1
n
2
n-1
3
n-2
…
 */

/*Matlab: • Ek number start se
          • Ek number end se
          • Fir start++
          • Fir end--

 Logic: • start = 1
        • end = n
        • Jab tak start <= end
            • print start
            • print end
            • start++
            • end--
 */

package Loops;
import java.util.Scanner;

public class SequencePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int start = 1;
        int end = n;
        for (; start <= end; start++, end--) {
            System.out.println(start);
            if (start != end){      // avoid duplicate in odd case
                System.out.println(end);
            }
        }
    }
}
