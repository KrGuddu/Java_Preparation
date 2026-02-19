package Pattern_Printing;
import java.util.Scanner;

public class Bridge_2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;

        for (int i = 1; i <=2*n-1; i++) System.out.print("* ");
        System.out.println();
        for (int i = 1; i <=n-1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
    }
}
