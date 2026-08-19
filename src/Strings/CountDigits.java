//Que: count digits without applying loop conditions

package Strings;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // int n = sc.nextDouble(); ==> if input is 000.006700 then output is 6, it will count like this (000.006700 ==> 0.0067)    //Here, decimal is also counted
        String s = "" + n;      //if input is 98765 then output is 5. but if input is 987650 then we will get an error (Exception in thread). And also if we pass 000032165 then it will not return 9 it will return only 5 it ignore zeros count b/q of we taking input as a number not integer so for number zeros is useless thing (for integer zeros is counted). so zeros is not store in String s, only numbers store.
        System.out.println(s.length());
    }
}
