// Take positive integer input and tell if it is divisible by 5 or not.

package If_Else;
import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n%5 == 0) {
            System.out.println("Yes, It is divisible by 5");
        }else {
            System.out.println("Not divisible by 5");
        }
    }
}
