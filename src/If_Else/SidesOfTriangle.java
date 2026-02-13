// Take 3 positive integers input and tell if they can be the sides of a triangle or not.

package If_Else;
import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st side of triangle: ");
        double a = sc.nextDouble();

        System.out.print("Enter 2nd side of triangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter 3rd side of triangle: ");
        double c = sc.nextDouble();

        if (a+b>c && b+c>a && c+a>b){               // pahle Arithmetics operation perform honge phir relational operation(<, >, etc) perform honge.
            System.out.println("Yes, these are sides of triangle");
        }else {
            System.out.println("Not sides of triangle");
        }
    }
}
