/* Print this pattern
 * * * * * * *
   * * * * *
     * * *
       *
 */

package Pattern_Printing;
import java.util.Scanner;

public class Pyramid_Vertically_Flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp=1, nst=2*n-3;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++) System.out.print("  ");
            for(int j=1; j<=nst; j++) System.out.print("* ");
            nsp++;
            nst -=2;
            System.out.println();
        }
    }

}
