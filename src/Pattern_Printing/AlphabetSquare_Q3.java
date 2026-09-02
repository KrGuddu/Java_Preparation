//when i is constant
/* Print this
A A A A
B B B B
C C C C
D D D D
 */
package Pattern_Printing;
import java.util.Scanner;

public class AlphabetSquare_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print((char)(i+64) + " " );
            }
            System.out.println();
        }

    }
}
