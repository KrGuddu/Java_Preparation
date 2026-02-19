// Best method b/q of this method is most modular

package Pattern_Printing;
import java.util.Scanner;

public class StarTriangleVerticallyFlipped_2ndMethod {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {     //or, (int j = 2; j <=n+1-i; j++) =>not good 2nd condition
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
