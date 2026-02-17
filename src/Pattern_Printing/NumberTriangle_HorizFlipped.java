package Pattern_Printing;

import java.util.Scanner;

public class NumberTriangle_HorizFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n+1-i; j++) {          //2nd method => but not standard method: (int j=n; j>=i; j--)
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
