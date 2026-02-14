// Write a Java program to take the first term (a), common difference (d), and number of terms (n) as input from the user and print the Arithmetic Progression (AP) up to n terms.
// or, Take user i/p for a, d, n and print Ap.
// or, Take user i/p and print Ap.

package Loops;
import java.util.Scanner;

public class Ap_2ndPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term(a): ");
        int a=sc.nextInt();
        System.out.print("Enter common difference(d): ");
        int d= sc.nextInt();
        System.out.print("Enter number of terms (n): ");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a += d;
        }
    }
}
