// 1st method to find total surface area (TSA) of a cuboid
// formula of TSA : 2*(l*b + b*h + h*l)
// formula of Lateral Surface Area (LSA): 2h(l+b) (excludes top and bottom)

package Basics;

public class TSA {
    public static void main(String[] args) {
        double l = 5;
        double b = 6;
        double h = 7;

        // double area = l*b + b*h + h*l;
        // System.out.println(area*2);

        double tsa = 2*(l*b + b*h + h*l);       // this is best in basic method
        System.out.println("Total Surface Area is: " + tsa);
    }
}
