// See Again Solution
//for lowercase alphabet

package Pattern_Printing;
import java.util.Scanner;

public class AlphabetSquare_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        char ch = 'a';

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(i % 2 != 0) {
                    System.out.print(ch + " ");
                } else {
                    System.out.print(Character.toUpperCase(ch) + " ");
                }

            }

            ch++;
            System.out.println();
        }

    }
}
