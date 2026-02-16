package Pattern_Printing;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // in square all side are equals so row = column
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //2nd method  ==> Not recommended
//        int row = sc.nextInt();
//        int col = sc.nextInt();             //i/p me row and col same dene hoge tavi wo square hoge.
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= col; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    }
}
