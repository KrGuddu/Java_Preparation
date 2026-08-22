//Ques: Display this AP(Arithmetic Progression) 2,5,8,11... upto ‘n’ terms

package Loops;
import java.util.Scanner;

public class Ap_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Using AP formula      // nth term of an AP: an = a + (n - 1)d     //where: First term a = 2, Common difference d = 3, Number of terms = n
        for (int i = 2; i <= 3*n-1; i+=3) {     //o/p: 2, 5, 8, 11, 14...
            System.out.print(i + " ");
        }

        //or, without Ap formula    ==>Best
        int a=2, d=3;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");      // remember a is call here not i
            a += d;
        }

    }
}


//Note: a stores the actual AP term, while i only counts how many terms have been printed.