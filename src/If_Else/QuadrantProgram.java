/*Que: Given a point (x, y), write a program to find out if it lies in the 1st Quadrant, 2nd Quadrant, 3rd Quadrant, 4th
Quadrant, on the x-axis, y-axis or at the origin. */

package If_Else;
import java.util.Scanner;

public class QuadrantProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter value of y: ");
        double y = sc.nextDouble();

        if (x==0 && y==0){
            System.out.println("Origin");       // The point lies at the Origin.
        }else if (x==0){
            System.out.println("Y-axis");       // The point lies on the Y-axis.
        } else if (y==0) {
            System.out.println("X-axis");       // The point lies on the X-axis.
        } else if (x>0 && y>0){
            System.out.println("1st");          // The point lies in the 1st Quadrant.
        } else if (x<0 && y>0) {
            System.out.println("2nd");          // The point lies in the 2nd Quadrant.
        } else if (x<0 && y<0) {
            System.out.println("3rd");          // The point lies in the 3rd Quadrant.
        } else if (x>0 && y<0) {       // also we can use here only else statement like: else if{System.out.println("4th");}.
            System.out.println("4th");
        }

    }
}
