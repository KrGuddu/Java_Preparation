//Que: Print this series - 99,95,91,87,... upto all terms which are positive

package Loops;
import java.util.Scanner;

public class Ap_Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 99; i >=103-4*n ; i=i-4) {
            System.out.print(i);
        }

        //for only +ve value   // Use this when know no. of term
        for (int i = 99; i >=103-4*n ; i=i-4) {
            if (i>=0){
                System.out.print(i);
            }
        }

        // *Best & Simple Way => Recommended   //Use this when not given no. of term.
        for (int a = 99; a > 0; a = a - 4) {
            System.out.print(a + " ");
        }

        // Clear AP Style
        int a = 99;
        int d = -4;

        for (; a > 0; ) {
            System.out.print(a + " ");
            a = a + d;
        }

        // *using while loop => Recommended
//        int a = 99;      // first term
//        int d = -4;      // common difference
//
//        while (a > 0) {
//            System.out.print(a + " ");
//            a = a + d;   // next term
//        }

    }
}
