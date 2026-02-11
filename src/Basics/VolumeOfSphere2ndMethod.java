// 2nd method to find volume of a sphere

package Basics;
import java.util.Scanner;

public class VolumeOfSphere2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of Sphere: ");
        double radius = sc.nextDouble();

        // Calculate volume
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Output result
        System.out.println("Volume of Sphere is: " + volume);

        sc.close();
    }
}
