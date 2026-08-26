//Que: Count digits of a number
package Loops;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==0) n=1;  // jab i/p 0 ho to n ke under 1 store hoga, so count of digit is 1 hogi.  ==>> yaha par n=1 ki jagah par koe v number le skte hai one digit ka.
        int count = 0;
        while (n != 0){     // jab tak n=0 na ho jaye tabtak loop chalao.       //For Interview: 0 is a special case because the loop condition n != 0 would otherwise execute zero times
            n = n/10;   // n/=10;
            count++;
        }
        System.out.println(count);


        //2nd approach: best
//        int count = 0;
//
//        if (n == 0) {
//            count = 1;
//        } else {
//            while (n != 0) {
//                n /= 10;
//                count++;
//            }
//        }
//        System.out.println(count);

    }
}


/*Tips for DSA
n % 10  [ %10 ] → last digit GET
n / 10  [ /10 ] → last digit REMOVE

Example n = 12345:
n % 10 → 5       // last digit
n / 10 → 1234    // last digit removed
* */


/*
To find digits in a number: n/10

n / 10¹  → n / 10    → last 1 digit remove
n / 10²  → n / 100   → last 2 digits remove
n / 10³  → n / 1000  → last 3 digits remove
n / 10⁴  → n / 10000 → last 4 digits remove

eg:
/10     → 1 zero → 1 digit
/100    → 2 zeros → 2 digits
/1000   → 3 zeros → 3 digits
/10000  → 4 zeros → 4 digits


Why does this happen?
Java mein int division mein decimal part discard ho jata hai.
For example: 12345 / 10 = 1234.5
But int mein: 12345 / 10 = 1234

.5 discard ho gaya.

Isi wajah se last digit remove hota hai.
* */