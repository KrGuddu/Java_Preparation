// Ques: Take positive integer input and tell if it is odd or even

package If_Else;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n%2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        // using ternary operator
        String result = (n%2 == 0) ? "Even" : "Odd";
        System.out.println(result);

        // or, in one line (using ternary operator)
        System.out.println((n%2 == 0) ? "Even" : "Odd");
    }
}
