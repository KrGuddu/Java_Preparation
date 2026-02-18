//Ques: Print the given pattern

package Pattern_Printing;
import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==j || j==n+1-i){      //logic from "Star plus" and "Star Triangle Horizontally Flipped"
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
