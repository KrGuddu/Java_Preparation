package If_Else;
import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int x = (int)n;

        if (n-x == 0) System.out.println("It is an Integer");       //2nd method:  if (n- (int)n == 0)  or,  if(n == (int)n)    => mai yaha par direct typecasting kar de rha hu. So agar ye likh rhe ho to int x = (int)n; likhne ki jarurat nhi hai.
        else System.out.println("Not an Integer");

        // or, Not recommended b/q it is fine for positive number but not for negative number. Ex: if n = -3.1546 then x = -3 and n-x = -0.1546. So, user give negative number then will get wrong answer.
//        if (n-x > 0) System.out.println("Not an Integer");
//        else System.out.println("It is an Integer");

    }
}
