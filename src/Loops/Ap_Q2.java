//Que: Print this series 99,95,91,87,... upto all terms which are positive

package Loops;
import java.util.Scanner;

public class Ap_Q2 {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 99; i >=103-4*n ; i=i-4) {       //Not Recommended
//            System.out.print(i);
//        }

        //for only +ve value   // Use this when know no. of term         //Not Recommended
//        for (int i = 99; i >=103-4*n ; i=i-4) {
//            if (i>=0){
//                System.out.print(i);
//            }
//        }

        //Or, //Unnecessary
//        int a=99, d=-4;
//        for (int i=99; i>=0; i--){
//            if(a>=0){       //for positive numbers
//                System.out.print(a + " ");
//            }
//            a += d;
//        }

        // *Best & Simple Way => Best, Recommended   //Use this when not given no. of term.
        for (int a = 99; a > 0; a = a - 4) {
            System.out.print(a + " ");
        }

        // Clear AP Style   ==> good
//        int a = 99;
//        int d = -4;
//
//        for (; a > 0; ) {
//            System.out.print(a + " ");
//            a = a + d;
//        }

        // *using while loop => The Best, Recommended
        int a = 99;      // first term
        int d = -4;      // common difference

        while (a > 0) {
            System.out.print(a + " ");
            a = a + d;   // next term
        }

    }
}


/*
AP formula: an = a + (n - 1)d
3=99+(n−1)(−4)
3 = 99 - 4n + 4 =>4n = 100 =>n=25

So,
T.C.: O(n)
S.C.: O(1)
A.C.: O(1)
* */