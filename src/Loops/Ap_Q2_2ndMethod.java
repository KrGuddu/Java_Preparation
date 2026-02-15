//Que: Print this series - 99,95,91,87,... upto all terms which are positive
package Loops;
import java.util.Scanner;

public class Ap_Q2_2ndMethod {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first term(a): ");
//        int a=sc.nextInt();
//        System.out.print("Enter common difference(d): ");
//        int d= sc.nextInt();
//        System.out.print("Enter number of terms (n): ");
//        int n=sc.nextInt();
//
//        for (int i = 99; i >=n ; i=i-4) {
//            System.out.println(i);
//            a =a-d;
//        }
//    }


    // Best Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        for (; a > 0; a = a + d) {
            System.out.print(a + " ");
        }


        // Smart Version (handle both +ve and -ve d)    ==> Hard version
//        for (; (d < 0 && a > 0) || (d > 0 && a > 0); a = a + d) {
//            System.out.print(a + " ");
//        }
    }

}
