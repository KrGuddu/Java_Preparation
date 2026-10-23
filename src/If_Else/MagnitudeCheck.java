//Que: Take integer input and tell if its magnitude is smaller than 69 or not.
// To checking a Magnitude number: if(n>0)
// Note: 0 is not a Magnitude number so don't write if(n>=0)

package If_Else;
import java.util.Scanner;

public class MagnitudeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find magnitude (absolute value)
        int num = sc.nextInt();             // use this if question is talking to take Integer input
        int magnitude = Math.abs(num);

//        double num = sc.nextDouble();      // use this if question is talking to take decimal input
//        double magnitude = Math.abs(num);

        if (magnitude < 69) {
            System.out.println("Magnitude is smaller than 69");
        }else {
            System.out.println("magnitude is Not smaller than 69");
        }
    }
}
