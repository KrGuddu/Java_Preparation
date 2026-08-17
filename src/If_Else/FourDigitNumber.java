//Que: Take positive integer input and tell if it is a four digit number or not.

package If_Else;
import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        if (n >999 && n<10000){             //or, if (n >=1000 && n<= 10000)
            System.out.println("It is 4 digit number");
        }else {
            System.out.println("Not a 4 digit number");
        }
    }
}


/* In java 999 < n < 10000 does not work because of how the compiler evaluates expressions. Java evaluates operators of the same priority from left to right, one step at a time. Here is exactly why it fails:
The Evaluation Order
1. The compiler looks at the first part: 999 < n.
2. This expression evaluates to a boolean value (true or false).
3. The compiler then tries to evaluate the remaining part: [boolean] < 10000.
4. Java cannot compare a boolean to an int, causing a compiler error.
 */