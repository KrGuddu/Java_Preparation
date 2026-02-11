//Q3. print sum of n numbers (means 1 to n). eg: input is 5 then print sum of 1 to 5 (1+2+3+4+5)

package Basics;
import java.util.Scanner;

public class SumOf_1toN_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = n*(n+1)/2;
        System.out.println(sum);
    }
}
