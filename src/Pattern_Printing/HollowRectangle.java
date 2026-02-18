//Ques: Print the given pattern

package Pattern_Printing;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=col; j++) {
                if (i==1 || i==row || j==1 || j==col){
                    System.out.print("* ");
                }else {
//                    System.out.print("# ");
                    System.out.print("  ");     // here give two space b/q 1st space is a space character and 2nd space is a space of those space(means, space character) to look good.
                }
            }
            System.out.println();
        }
    }
}
