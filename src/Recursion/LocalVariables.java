package Recursion;

public class LocalVariables {
    public static void main(String[] args) {
        int x=10;                                   //here x local for the main method.
        change(x);                                  //local variable can not be accessible from outside it's own block, so the o/p is 10.
        System.out.println(x);
    }

    public static void change(int x){
        x=20;                                       //here x local for the change method
    }
}
