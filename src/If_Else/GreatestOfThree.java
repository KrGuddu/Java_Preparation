//Que: Take 3 positive integers input and print the greatest of them.

package If_Else;
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd no: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd no: ");
        int c = sc.nextInt();

//        if (a>=b && a>=c){
//            System.out.println(a);
//        } else if (b>=a && b>=c) {
//            System.out.println(b);
//        }else {
//            System.out.println(c);
//        }


        // Or,
//        if (a>b && a>c){
//            System.out.println(a);
//        } else if (b>a && b>c) {
//            System.out.println(b);
//        }else {
//            System.out.println(c);
//        }

        // using nested if else
//        if (a>=b && a>=c){
//            System.out.println(a);
//        } else {
//            if (b>=a && b>=c) {
//                System.out.println(b);
//            }else {
//                System.out.println(c);
//            }
//        }

        //2nd method using nested if else
        if (a>=b){
            if (a>=c){
                System.out.println(a);
            }else {
                System.out.println(c);
            }
        }else {
            if(b>=c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }


    }
}
