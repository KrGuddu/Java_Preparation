// 2nd method to find total surface area (TSA) of a cuboid  ==> this is best method

package Basics;
import java.util.Scanner;

public class TSA2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double tsa = 2*(l*b + b*h + h*l);
        System.out.println("Total Surface Area of Cuboid is: " + tsa);

        // if you want the result only in integer format then use this
        // int result = (int) tsa;           // first convert the double value into integer data type then store in any variable like result the print the result => Not recommended to use this in TSA b/q value should be in double
        // System.out.println("Total Surface Area of Cuboid is: " + result);

        sc.close();
    }
}
