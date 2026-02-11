// Q1. Print sum of numbers

package Basics;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        double sum = num1 + num2 +num3;
        System.out.println(sum);

        sc.close();
    }
}
