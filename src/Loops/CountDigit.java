//Que: Count digits of a number
package Loops;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        if (n==0) n=1;  // jab i/p 0 ho to n ke under 1 store hoga, so count of digit is 1 hogi.  ==>> yaha par n=1 ki jagah par koe v number le skte hai one digit ka
        int count = 0;
        while (n != 0){     // jab tak n=0 na ho jaye tabtak loop chalao.
            n = n/10;   // n/=10;
            count++;
        }
        System.out.println(count);

    }
}
