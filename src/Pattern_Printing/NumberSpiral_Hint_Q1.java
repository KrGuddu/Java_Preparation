package Pattern_Printing;
import java.util.Scanner;

public class NumberSpiral_Hint_Q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
//                if (i<j){
//                    System.out.print(i + " ");
//                }else {
//                    System.out.print(j + " ");
//                }
                //or, standard a/c ternary
                System.out.print(Math.min(i, j) + " ");
                //or, using ternary operation =>standard a/c if-else
//                System.out.print((i<j ? i : j) + " ");

            }
            System.out.println();
        }

    }
}
