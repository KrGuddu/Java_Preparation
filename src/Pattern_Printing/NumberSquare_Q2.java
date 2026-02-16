package Pattern_Printing;

import java.util.Scanner;

public class NumberSquare_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i + " " );             // jab i=1 hua to inner loop chala aur check kiya j=1 hai agar hai to i print hua. aur jitna n ki value user i/p se ayegi utni bar i print hoga.
            }
            System.out.println();
        }

    }
}
