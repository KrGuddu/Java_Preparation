package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = Math.abs(n);    // Handle negative numbers
//        if (n<0) n=-n;      //or, Handle negative numbers

        int sum = 0;
        while (n != 0){
            sum += n%10;        // jo v i/p number hogi unn savi ka unit digit ko bari bari se add krta jayega
            n=n/10;
        }
        System.out.println(sum);
//        System.out.println((sum)>0 ? sum : -sum);         //or, Handle negative numbers
    }
}
