/* Print this
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
 */

package Pattern_Printing;
import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {       // ye loop jitna number i/p ayega utna hi number of rows tak count ko chalayega
            for (int j = 1; j <=n; j++) {   // ye loop counting ko print krta hai like 1, 2, 3, 4, 5, ....
                System.out.print(j+ " ");   // i dene par 1111  2222  3333  ... ki format me ayega          //here printing j b/q of j is constant.
            }
            System.out.println();
        }

    }
}
