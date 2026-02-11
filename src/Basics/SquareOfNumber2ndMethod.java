// 2nd method to find square of a number => best A/C to 1st method

package Basics;
import java.util.Scanner;

public class SquareOfNumber2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        double num = sc.nextDouble();

        double result = Math.pow(num, 2);
        System.out.println("Square of " + num + " is: " + result);
    }
}
