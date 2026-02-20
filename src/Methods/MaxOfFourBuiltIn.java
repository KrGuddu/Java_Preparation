// Que: Find the maximum of four number using built-in function

package Methods;

import java.util.Scanner;

public class MaxOfFourBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(Math.max(Math.max(a,b), Math.max(c,d)));
    }
}
