//Que: Take 3 positive integers input and print the least of them.

package If_Else;
import java.util.Scanner;

public class LeastOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd no: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd no: ");
        int c = sc.nextInt();

        if (a<=b && a<=c){
            System.out.println(a);
        } else if (b<=a && b<=c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
