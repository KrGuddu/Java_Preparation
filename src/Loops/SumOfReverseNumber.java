package Loops;
import java.util.Scanner;

public class SumOfReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0) n=-n;

        int r = 0;
        int sum = 0;
        while (n != 0){
            r *= 10;
            r += (n%10);
            sum += n%10;
            n /= 10;

        }
        System.out.println(r);
        System.out.println(sum);
    }
}


/* Tips:
1. Count Digits: => (Assume, count = 0;)
        n = n/10;
2. Sum of digits: => (Assume, sum = 0;)
         sum += n%10;
         n=n/10;

3. Reverse a number: => (Assume, r = 0;)
         r *= 10;         // r=r*10   //2nd step: r ko 10 multiply karege
         r += (n%10);     // r=r+(n%10)   //3rd step: r=r*10 me unit digit(last digit) ko add kiya
         n /= 10;

4. Sum Of Reverse a number: => (Assume, r = 0; sum = 0;)
        r *= 10;
        r += (n%10);
        sum += n%10;
        n /= 10;


Note: To Handle negative numbers
        n = Math.abs(n);
        Or, if (n<0) n=-n;
 */