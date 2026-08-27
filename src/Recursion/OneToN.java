//Note: for loop is faster and more memory-efficient than recursive code.

package Recursion;
import java.util.Scanner;

public class OneToN {
    //1st Method: Using local variable           ==> ye function 1 to x>n tak chal rha hai.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        print(1, n);
//    }
//
//    public static void print(int x, int n){
//        if(x>n) return;
//        System.out.println(x);
//        print((x+1), n);
//    }


    //2nd Method: Using static variable         ==> ye function 1 to x>n tak chal rha hai.
//    static int n;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        print(1);
//    }
//
//    public static void print(int x){        //interview ke under static int n; likhna red flag hota hai so ye variable print method me pass kar do.
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1);
//    }

    //3rd Method
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
}
