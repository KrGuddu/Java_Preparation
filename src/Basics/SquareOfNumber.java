// 1st method to find square of a number

package Basics;
import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        double num = sc.nextDouble();

        double square = num * num;
        System.out.println("Square of " + num + " is: " + square);
        sc.close();
    }
}
