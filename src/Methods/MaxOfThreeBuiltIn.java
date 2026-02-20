// Que: Find the maximum of three number using built-in function
package Methods;

import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = Math.max(a,b);
        System.out.println(Math.max(d, c));

        //or
        System.out.println(Math.max(Math.max(a,b), c));
    }
}
