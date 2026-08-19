package Strings;

import java.util.Locale;

public class BuiltInMethod {
    public static void main(String[] args) {
        String s = "harshita";
//        s.toUpperCase();      //This is not work. o/p: harshita
        s = s.toUpperCase();    //This is work. o/p: HARSHITA
        System.out.println(s);

        //Important   //if string value is a integer then by this method we can convert string to integer
        String str = "32145697";
        int n = Integer.parseInt(str);
        System.out.println(n);
        System.out.println(n+1);    //o/p: 32145698
    }
}
