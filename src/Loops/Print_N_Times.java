//Que: Print ____Yashika_____ ‘n’ times. Take ‘n’ input from user
package Loops;
import java.util.Scanner;

public class Print_N_Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Que: Print number ‘n’ times. Take ‘n’ input from user
        // ye Infinite loop tak chalegi.
        for (n=0; n<=n; n++){
            System.out.println(n);
        }

        // ye Infinite loop tak nhi chalegi, user jitna input dega wahi tak chalega.
        int num;
        for (num=0; num<=n; num++){
            System.out.println(num);
        }

        //Que: Print ____Yashika_____ ‘n’ times. Take ‘n’ input from user.
        int Yashika;            // datatype int leni hai qki input value integer datatype hogi. jo ki user dega
        for (Yashika=0; Yashika<=n; Yashika++){
            System.out.println("Yashika");         //Yaha datatype String isliye liya gya hai qki Yashika ko string ki format me print krani hai         // user jitna input dega utni bar Yashika print hogi
        }
    }
}
