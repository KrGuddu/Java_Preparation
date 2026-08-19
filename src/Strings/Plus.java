package Strings;

public class Plus {
    public static void main(String[] args) {
        String s = "guddu";
        s = s + "kumar";    //or: s += "kumar";
//        System.out.println(s);

        //Note: We can add numbers, characters in a string from last position. like: s+=10, s+='a';    //Remember we can't do s -+ 10; or s -+ 'a';

//        System.out.println("guddu" + 10);                    //o/p: guddu10
//        System.out.println(10 + "guddu");                    //10guddu
//        System.out.println(10 + "guddu" + 10);               //10guddu10
//        System.out.println("guddu" + 10 + 20);               //guddu1020
//        System.out.println(10 + 20 + "guddu");               //30guddu
//        System.out.println(10 + 20 + "guddu" + 10);          //30guddu10
//        System.out.println(10 + 20 + "guddu" + 10 + 20);     //30guddu1020
//        System.out.println("guddu" + 10 + "Kumar");          //guddu10Kumar
//
//        System.out.println("guddu" + (10 + 20));                            //guddu30
//
//        System.out.println(10 + "guddu" + 20 + "Kumar");                    //10guddu20Kumar
//        System.out.println("guddu" + 10 + 20 + "Kumar");                   //guddu1020Kumar
//        System.out.println(10 + 20 + "guddu" + 10 + "Kumar");              //30guddu10Kumar
//        System.out.println(10 + 20 + "guddu" + 10 + 20 + "Kumar");         //30guddu1020Kumar
//
//        System.out.println('A' + 10 + "guddu");     //75guddu  ==> b/q of A ki ascii value 65 hoti hai and 75+10 is 75.
    }
}
