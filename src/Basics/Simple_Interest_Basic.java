package Basics;

public class Simple_Interest_Basic {
    public static void main(String[] args) {

        int p=69, r=5, t=8;
        // double si = p*r*t/100;     // o/p 27.0    => b/q int/int = int, so value is 27 but the container datatype is double then o/p is 27.0
        double si = p*r*t/100.0;    // o/p 27.6
        System.out.println(si);

    }
}
