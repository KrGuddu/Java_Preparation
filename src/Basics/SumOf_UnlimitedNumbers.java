// Q4. Take user input for n numbers and print the sum of those numbers.

package Basics;

import java.util.Scanner;

public class SumOf_UnlimitedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to add: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt(); // jo user input karega usko num variable me store karenge.
            sum = sum + num;

            // System.out.println("Sum = " + sum); // Ye line har iteration ke baad sum
            // print karega, agar aapko final sumhi chahiye to is line ko nhi likho.
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
