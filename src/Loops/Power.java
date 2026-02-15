package Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();   //base
        int b = sc.nextInt();   //exponential
        int pow = 1;            //power
        for (int i = 1; i <=b; i++) {
            pow *= a;
        }
        System.out.println(pow);
    }
}
