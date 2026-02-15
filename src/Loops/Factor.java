//Que: Take a number input and print all of it's factors(divisors).
//Or, Take an integer n as input from the user. Print all numbers that divide n completely (i.e., remainder 0).

package Loops;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        for (int i = 1; i <=Math.pow(n, 0.5) ; i++) {       // i <= n^1/2  => n^0.5  => we can't write n^0.5 in code so i can use Math.pow(n, 0.5)
            if (n%i ==0){
                System.out.print(i + " ");      // factor which is lesser than n^1/2
//              System.out.println(n/i);    // ye duplicate value ko v print kar dega so isko ignore krne ki liye if (i !=n/i ) use krte hai. ex: i/p 64 dege to facor me 8 two time aa jayega.
                if (i !=n/i ){
                    System.out.print(n/i + " ");    // factor which is greater than n^1/2
                }
            }
        }
    }
}
