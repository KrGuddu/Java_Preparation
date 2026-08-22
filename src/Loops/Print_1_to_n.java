//Q. Write a Java program to take an integer N as input and print all numbers from 1 to N.
//Or, User se ek input lo and user jo i/p de waha tak numbers print karo.
package Loops;
import java.util.Scanner;

public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
