// Que: Take length and breadth of rectangle as input and write a program to find whether the area of rectangle is greater than its perimeter.

package If_Else;
import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        double Area = l*b;
        double perimeter = 2*(l+b);

        if (Area > perimeter){
            System.out.println("Area is greater than perimeter");
        }else {
            System.out.println("Perimeter is greater than Area");
        }

    }
}
