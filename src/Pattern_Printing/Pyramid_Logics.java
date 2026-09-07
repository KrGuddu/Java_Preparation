package Pattern_Printing;

import java.util.Scanner;

public class Pyramid_Logics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++) System.out.print("# ");
            for(int j=1; j<=i; j++) System.out.print("* ");
            for(int j=1; j<=i-1; j++) System.out.print("* ");

//            for(int j=1; j<=n-i; j++) System.out.print("# ");       //Use this when the required count is n-i
            for (int j=1; j<=n+1-i; j++) System.out.print("# ");    //Use this when the required count is n+1-i
//            for (int j=1; j<=i; j++) System.out.print("# ");        //Use this when the required count is i
            System.out.println();
        }
    }
}
