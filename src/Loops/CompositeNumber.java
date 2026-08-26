// Que: WAP to check if a given number is composite or not.
//A composite number is a positive whole number greater than 1 that has more than two factors.
//Eg: 6: Divisible by 1, 2, 3, and 6.

package Loops;
import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n-1 ; i++) {       // yaha par loop ek bar hi chala qki jaisehi n%2==0 hua aur wo composite tha waisehi loop terminate ho gya. Agar break keyword ka use na karte to loop 'n-1' times tak chalegi.
            if (n%i==0){    // 'i' to 'n' ka ek factor nikla
                System.out.println("Composite Number");
                break;
            }
        }
    }
}
