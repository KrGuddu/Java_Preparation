//isko pura karo

package Pattern_Printing;

import java.util.Scanner;

public class AlphabetTriangle_HorizFlipped_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
