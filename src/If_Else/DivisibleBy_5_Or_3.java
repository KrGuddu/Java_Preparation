//Que.: Take positive integer input and tell if it is divisible by 5 or 3.

package If_Else;
import java.util.Scanner;

public class DivisibleBy_5_Or_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0 || num %3 == 0) {
            System.out.println("Divisible by 5 or 3");
        }else {
            System.out.println("Not divisible by 5 or 3");
        }
    }
}
