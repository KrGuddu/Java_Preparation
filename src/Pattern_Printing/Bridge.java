package Pattern_Printing;
import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=2*n-1; i++) System.out.print("* ");
        System.out.println();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=2*i-1; j++) {       //if n=1 then j=1 so *  //if n=2 then j=3 so ***   //if n=3 then j=5 so *****   //if n=4 then j=1 so *******
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
