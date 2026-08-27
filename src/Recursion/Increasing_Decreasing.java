package Recursion;
import java.util.Scanner;

public class Increasing_Decreasing {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        if(n==0) return;
        System.out.print(n + " ");
        print(n-1);
        System.out.print(n + " ");
    }                                         //o.p: 5 4 3 2 1 1 2 3 4 5


    //for o/p: 5 4 3 2 1 2 3 4 5        ==> two 1 ki jagah ek 1 rakhne ke liye
//    public static void print(int n){
//        if(n==0) return;
//        System.out.print(n + " ");
//        if(n==1) return;
//        print(n-1);
//        System.out.print(n + " ");
//    }

    //or
//    public static void print(int n){
//        if(n==1) {
//            System.out.print(n + " ");
//            return;
//        }
//        System.out.print(n + " ");
//        print(n-1);
//        System.out.print(n + " ");
//    }

    //or
//    public static void print(int n){
//        if(n==0) return;
//        System.out.print(n + " ");
//        print(n-1);
//        if(n != 1) System.out.print(n + " ");
//    }


}
