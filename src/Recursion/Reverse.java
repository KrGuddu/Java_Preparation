package Recursion;

public class Reverse {
    //By normal method
//    public static void main(String[] args) {
//        int n = 987654;
//        int r = 0;                        //We can also assume count rather than r. like count=0
//
//        while(n!=0){
//            r *= 10;
//            r += (n%10);                //or,  r= r*10 + (n%10);
//            n /= 10;
//        }
//        System.out.println(r);
//    }

    //By recursive method
//    public static void reverse(int n, int r){
//        if(n==0){
//            System.out.println(r);
//            return;
//        }
//        reverse(n/10, r*10 + (n%10));
//    }
//    public static void main(String[] args) {
//        int n =925554;
//        reverse(n, 0);
//    }


    //if return type is int
    public static int reverse(int n, int r){
        if(n==0) return r;
        return reverse(n/10, r*10 + (n%10));
    }
    public static void main(String[] args) {
        int n =12345975;
        System.out.println(reverse(n, 0));
    }
}


//T.C. of reverse number= a/r