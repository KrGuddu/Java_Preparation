//Que: WAP to check if a given number is prime or not.
//Note: Prime is opposite of composite number

package Loops;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        boolean flag = true;    // true means prime
        for (int i = 2; i <= n-1 ; i++) {
            if (n%2==0){
//                System.out.println("Composite");
                flag = false;   // false means composite
                break;
            }
        }
        if (n==1) System.out.println("Neither prime nor composite");
        else if (flag == false) System.out.println("Composite");
        else System.out.println("Prime");
    }
}
