//Ques: Display this AP - 2,5,8,11... upto ‘n’ terms

package Loops;
import java.util.Scanner;

public class Ap_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= 3*n-1; i+=3) {     //o/p: 2, 5, 8, 11, 14...
            System.out.print(i + " ");
        }
        //or, without Ap formula
        int a=2, d=3;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);      // remember a is call here not i
            a += d;
        }

    }
}
