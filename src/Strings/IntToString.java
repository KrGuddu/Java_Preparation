package Strings;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        String s = "";  //empty string
//        s += n;

        String s = Integer.toString(n);
        System.out.println(s);      //if i/p is integer 100 then o/p is string 100.
    }
}
