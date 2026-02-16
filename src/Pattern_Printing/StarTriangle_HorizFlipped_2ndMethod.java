package Pattern_Printing;
import java.util.Scanner;

public class StarTriangle_HorizFlipped_2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;  //no. of star to be printed in each lines.
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= a; j++) {          //2nd method => but not standard method: (int j=n; j>=i; j--)
                System.out.print("* ");
            }
            a--;    // a-- inner loop ke bahar and outer loop ke under isliye likha qki mai chahta hu inner loop puri line chale and fir ek star kam ho then fir se inner loop chale ayesa bar-bar ho, jab tak ki outer loop terminate na ho jaye.
            System.out.println();
        }
    }
}
