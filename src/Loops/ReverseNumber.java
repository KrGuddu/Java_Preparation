package Loops;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = 0;           // r means reverse number   //1st step: r ko 0 se initialized kiya
        while (n != 0){
            r *= 10;         // r=r*10   //2nd step: r ko 10 multiply karege
            r += (n%10);    // r=r+(n%10)   //3rd step: r=r*10 me unit digit(last digit) ko add kiya
            n /= 10;        // n=n/10   //4th step: i/p number ko 10 se divide kiya
        }
        System.out.println(r);
    }
}
