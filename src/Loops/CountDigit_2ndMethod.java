// 2nd method  ==> best way
package Loops;
import java.util.Scanner;

public class CountDigit_2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        // Handle negative numbers
        n = Math.abs(n);

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
