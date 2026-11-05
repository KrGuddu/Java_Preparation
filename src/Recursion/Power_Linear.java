//Print a to the power of b
/*
1st: Linear Recursion (Naive Recursive Exponentiation):     [TC: O(b), AS: O(b)]
pow(a,b) = a*pow(a, b-1)

2nd: Optimized Recursion [Exponentiation by Squaring (Fast Exponentiation / Binary Exponentiation)]:        [TC: O(log b), AS: O(log b)]        =>Recommended
pow(a,b) = call*call        =>when b is even        Where, call = pow(a, b/2)
         = a*call*call      =>when b is odd


Que: Why is called Linear Recursion?
Ans: Because in every recursive call, the exponent decreases by 1:
 */


package Recursion;
import java.util.Scanner;

public class Power_Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        System.out.println(pow(a,b));
    }
//    public static int pow(int a, int b){
//        if(b==0) return 1;
//        return a*pow(a, b-1);
//    }

    //2nd method => best
    public static int pow(int a, int b){
        if(b==0) return 1;
        int call = pow(a, b/2);
        if(b%2 == 0) return call*call;
        else return a*call*call;

//        if(b%2 == 0) return pow(a, b/2)*pow(a, b/2);        //Bad practice: ek funtion/call [pow(a, b/2)] ko multiple times likhna bad practice hai isse code fat jati hai. so, pow(a, b/2) kisi variable me store kar lo and then use karo.
//        else return a*pow(a, b/2)*pow(a, b/2);
    }
}