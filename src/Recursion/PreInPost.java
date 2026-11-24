//This is known as Euler's tour tree    =>This is usefull for Binary Tree Data Structure
package Recursion;

public class PreInPost {
    public static void main(String[] args) {
//        pip(1);     //o/p: 1 1 1
//        pip(2);     //o/p: 2 1 1 1 2 1 1 1 2
        pip(3);     //o/p: 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
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



//Dry run this code