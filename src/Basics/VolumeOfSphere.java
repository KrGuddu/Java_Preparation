// 1st method to find volume of a sphere

package Basics;

public class VolumeOfSphere {
    public static void main(String[] args) {
        double r = 5;
        // double volume = 4/3 * 3.14159 * r * r * r;             // wrong approch b/q of here 4/3 give 1 not 1.33 (qki java me 4/3 integer division hota hai)
        double volume = (4.0 /3.0) * 3.14159 * r * r * r;        // 1st Approch
        // double volume = (4 * 3.14159 * r * r * r) / 3;       // 2nd Approch
        // double volume = 4 * 3.14159 * r * r * r / 3;        // 3rd Approch
        System.out.println("Volume of Sphere is: " + volume);
    }
}
