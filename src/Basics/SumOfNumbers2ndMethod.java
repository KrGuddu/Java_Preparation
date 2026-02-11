// Q2. Print sum of numbers

package Basics;
import java.util.Scanner;

public class SumOfNumbers2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter 3rd number: ");
        double num3 = sc.nextDouble();

        double sum = num1 + num2 +num3;
        System.out.println("sum of these numbers are: " + sum);
        sc.close();
    }
}
