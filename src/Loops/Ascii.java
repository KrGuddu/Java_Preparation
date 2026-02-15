//Print all alphabets with their corresponding ASCII values.

package Loops;

public class Ascii {
    public static void main(String[] args) {
        for (int i = 65; i <=90 ; i++) {        // (int i = 97; i <=122; i++) => for Lowercase letters a-z      // (int i = 48; i <=57; i++) =>for digits 0-9
//            System.out.println(i);    //print 65 to 90
//            System.out.println((char) i);    // print capital alphabet A-Z
            System.out.println((char) i + " : " + i);    //print A-Z corresponding their number 65-90
        }
    }
}
