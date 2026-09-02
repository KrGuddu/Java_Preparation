package Recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }
    public static void pip(int n){
        if(n==0) return;        //return sirf particular/current statement ko hi terminate karta hai, baki sare code ka kam karta hai.
        System.out.print(n + " ");  //pre: call se pahle kam
        pip(n-1);
        System.out.print(n + " ");  //In: do call ke bich ka kam
        pip(n-1);
        System.out.print(n + " "); //post: call ke baad ka kam
    }
}

