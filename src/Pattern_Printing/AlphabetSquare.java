//When j is constant
/* Print this
A B C D
A B C D
A B C D
A B C D
 */
package Pattern_Printing;
import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print( (char)(j+64) + " " );   //count me 64 add krne par Uppercase alphabet ka ascii value aa jayegi then usse typecast kar dene par unn savi value ki alphabet aa jayegi
            }
            System.out.println();
        }
    }
}
