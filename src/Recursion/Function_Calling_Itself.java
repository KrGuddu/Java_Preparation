// Recursion is the process where a function calls itself directly or indirectly.

package Recursion;

public class Function_Calling_Itself {
//    public static void main(String[] args) {
//        guddu(1);
//    }
//    public static void guddu(int n){
//        if(n==5) return;              //return function ko wahi par terminate kar deta hai. yaha par n==5 par function terminate hua hai.
//        System.out.println("name");
//        guddu(n+1);
//    }

    //print 5 to 1 by recursion     //or, n to 1
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }

    //print 0 to n by recursion
//    public static void main(String[] args) {
//        print(0);       //initial value => it print 0-24
//    }
//    private static void print(int n) {
//        if(n==25) return;       //give where you want to terminate the loop.      //this is hard coded, for best logic see in OneToN file
//        System.out.println(n);
//        print(n+1);
//    }

}
