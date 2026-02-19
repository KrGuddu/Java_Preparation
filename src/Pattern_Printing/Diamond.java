package Pattern_Printing;
import java.util.Scanner;

public class Diamond {
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

        nsp = 1;
        nst = 2*n-3;
        for (int i = 1; i <=n-1; i++) {     // ye outer loop ek bar kam chal rha hai according to 1st outer loop so (n-1)
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp++;      //Space ko ek badhate jao
            nst -= 2;   //Star ko 2 ghatate jao
            System.out.println();
        }
    }
}
