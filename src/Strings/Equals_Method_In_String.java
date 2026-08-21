package Strings;

import java.util.ArrayList;

public class Equals_Method_In_String {
    public static void main(String[] args) {
//        String s1 = "guddu";
//        String s2 = "guddu";
//        System.out.println(s1==s2);      //it return true b/q of both s1 and s2 are point to guddu.
//        System.out.println(s1.equals(s2));

        String s1 = new String("guddu");
        String s2 = new String("guddu");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


    }

    //This is the actual function for checks whether two strings are equal in content.
    public static boolean equals(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        for(int i=0; i<=s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    /* Note: Ye method corrupted hai qki isme koe v operations like update or add nhi kar paa rhe hai to iska alternative ye hai:
       1St: string/ characters ki arrayList bana do
       2nd: Character array bana do
       3rd: String Builders     ==>> The best method


       //Character array
       public static void main(String[] args) {
            ArrayList<Character> str = new ArrayList<>();
            str.add('a');
            str.set(0, 'r');
       }

    */

}



/*
o/p: true
     true
     false
     true

Why?
1. String literals
String s1 = "guddu";
String s2 = "guddu";

B/q of, Java String Pool use karta hai.

Conceptually:
String Pool

   "guddu"
      ↑
      |
   ┌──┴──┐
   s1   s2

Dono same pooled String object ko reference karte hain.

Therefore:
s1 == s2       // true
s1.equals(s2)  // true


2. new String()
String s1 = new String("guddu");
String s2 = new String("guddu");

new har baar naya String object banata hai.

In Heap memory
┌───────────────┐
│ "guddu"       │ ← s1
└───────────────┘
┌───────────────┐
│ "guddu"       │ ← s2
└───────────────┘

Objects different hain, although content same hai.

Therefore:
s1 == s2       // false
because == compares references.

But:
s1.equals(s2)  // true
because String.equals() content compare karta hai.

⭐ Interview rule
== → same object/reference?
.equals() → same content/value?

String ke case mein ye distinction bahut important hai.
* */