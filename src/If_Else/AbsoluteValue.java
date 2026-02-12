package If_Else;
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // 1st method
//        if (n >= 0) {
//            System.out.println(n);          // System.out.println(n + " is Already Absolute Number");
//        }else {
//            System.out.println(-n);        // System.out.println("Absolute Number of " + n + " is " + -n);
//        }


        // 2nd method => mai if-else condition me sirf if condition ka use krke absolute value ko print krna chahta hu.
        if (n < 0) n = -n;      // ye positive number ko check nhi krega sirf negative number ko check krega qki positive already hi absolute value hai, bus negative number ko absolute banana hai.
        System.out.println(n);

        // ye sortcut hai iska  =>matlab dono line alag alag hai if alag and sysout alag. jisme sysout hamesa chalega
//        if(n < 0){
//            n = -n;
//        }
//        System.out.println(n);

    }
}
