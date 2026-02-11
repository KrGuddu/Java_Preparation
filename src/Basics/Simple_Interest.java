// Print Simple Interest SI = (p*r*t)/100 where p: principal amount, r: Interest rate, t: time in years

package Basics;
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        System.out.println(p*r*t/100);
    }
}
