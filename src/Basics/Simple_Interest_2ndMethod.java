package Basics;

import java.util.Scanner;

public class Simple_Interest_2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time in Years: ");
        double t = sc.nextDouble();

        double si = p*r*t/100;
        System.out.println("Simple interest is: " + si);

        sc.close();
    }
}
