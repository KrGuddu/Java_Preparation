package Strings;

public class CompareToStringMethod {
    public static void main(String[] args) {
        //compareTo method
        String s1 = "rita";
        String s2 = "ritu";
        System.out.println(s1.compareTo(s2));     //o.p: -20 ==>ascii/unicode value of a is 97 and u is 117. so, a-u = 97-117=-20   //here, "rita" < "ritu"
        System.out.println(s2.compareTo(s1));   //o/p: 20

        String a = "harshit";
        String b = "harsh";
        System.out.println(a.compareTo(b));     //o/p: 2    //if a=harshita then o/p is 3, if a=harshitam then o/p is 4     //if b.compareTo(a) then o/p will get in negative.

        //Concat method
//        a.concat(b);    //Not working it will only return harshit, but expected o/p is harshitharsh
//        System.out.println(a);
//
//        a= a.concat(b);   //Working: qki jab a and b concat hue to harshitharsh bana jisse a ke under modify kar diye, tab jab a ko print kiya gya to modified a print hua na ki old a.
//        System.out.println(a);
//
//        System.out.println(a.concat(b));    //or, this.

        //without concat method
        a=a+b;
        System.out.println(a);      //or directly write: System.out.println(a+b);
    }
}

