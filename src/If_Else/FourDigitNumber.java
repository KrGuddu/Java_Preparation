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
