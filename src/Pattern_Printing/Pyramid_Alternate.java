// Alternate method apply on any types of problem always work.

package Pattern_Printing;
import java.util.Scanner;

public class Pyramid_Alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;         // nsp: number of space, nst: number of star

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp--;      //Space ko ek ghatate jao
            nst += 2;   //Star ko 2 badhate jao
            System.out.println();
        }
    }
}
