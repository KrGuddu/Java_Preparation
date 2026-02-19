//without using uppercase character

package Pattern_Printing;
import java.util.Scanner;

public class AlphabetSquare_Q4_2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i%2 == 1){  // if row is odd then print lower letter otherwise upper letter
                    System.out.print((char)(i+96)+ " ");
                }else{
                    System.out.print((char)(i+64)+ " ");
                }

               //Or, using ternary operator
//                System.out.print((char)(i%2 == 1 ? i+96 : i+64) + " ");           // condition ? value_if_true : value_if_false
            }
            System.out.println();
        }
    }
}
