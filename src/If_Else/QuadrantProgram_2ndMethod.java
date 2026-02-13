// Using ternary operator

package If_Else;
import java.util.Scanner;

public class QuadrantProgram_2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter value of y: ");
        double y = sc.nextDouble();

        String result = (x == 0 && y == 0) ? "The point lies at the Origin." :
                (x == 0) ? "The point lies on the Y-axis." :
                        (y == 0) ? "The point lies on the X-axis." :
                                (x > 0 && y > 0) ? "The point lies in the 1st Quadrant." :
                                        (x < 0 && y > 0) ? "The point lies in the 2nd Quadrant." :
                                                (x < 0 && y < 0) ? "The point lies in the 3rd Quadrant." :
                                                        "The point lies in the 4th Quadrant.";

        System.out.println(result);

        sc.close();
    }
}
