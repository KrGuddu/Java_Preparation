/*Print this
 * * * * *
   * * * *
     * * *
       * *
         *
 */

package Pattern_Printing;
import java.util.Scanner;

public class Right_Aligned_Triangle_Horizontally_Flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) System.out.print("  ");
            for(int j=1; j<=n+1-i; j++) System.out.print("* ");
            System.out.println();
        }
    }
}
