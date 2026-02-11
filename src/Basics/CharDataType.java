package Basics;

public class CharDataType {
    public static void main(String[] args) {
        // Typecasting: convert one datatype to another datatype
        char ch = 'A';
        // int x = ch;      // implicit typecasting   => not recommended b/q not work everywhere
        int x = (int) ch;   // explicit typecasting
        System.out.println(x);    // we can write directly: System.out.println((int) ch);

        char y = 'a';
        System.out.println(y);      // a    // b/q is consider only character
        System.out.println(y+0);    // 97  // it consider character ascii value  =>Also this is Typecasting   --> Smart method of typecasting
        System.out.println(y+1);    // 98
        System.out.println(y*y);    // 9409
        System.out.println(y*1);    //99
        // Note: character par koe v arithmatics operation perform krte hai to wo character ki ascii value me consider krta hai. so, output ascii value me ata hai.

        // Convert integer to character
        int z = 65;
        char chr = (char) z;
        System.out.println(chr);

        // Arithmatics
        int p = 10;
        p = p+1;  // same things: p += 1;  // p++;   // ++p;
        // p = p - 1; // same thing: p -= 1;   // p--  // --p;
        System.out.println(p);

        int q = 5;
        System.out.println(q++);  // 5
        System.out.println(q);   // 6

        int r = 5;
        System.out.println(++r);  // 6
        System.out.println(r);   // 6

        int c = 10;
        int d = c++;        // d pahle c ko print krega(qki post increment hai) phir increment krega(now, print krne ke baad d me 11 store hogi). and 1 add hone se c=11 hogi.
        System.out.println(c + " " +d);    // 11   10

    }
}
