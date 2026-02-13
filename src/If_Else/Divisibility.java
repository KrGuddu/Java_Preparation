/* Que: Take positive integer input and print:
____Riya_____ if number is divisible by 5
____Banu_____ if number is divisible by 3
___Apurva______ if number is divisible by 5 & 3 both
______Isha___ if number is not divisible by 5 or 3  */

//Note: jab ek number 2 or 2 se jada condition ko satisfied kare to uss condition ko pahle likhte hai na taki jab dono se divisible number enter ho to both bale condition chale. like (num%5 ==0 && num%3 ==0).

package If_Else;
import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num%5 ==0 && num%3 ==0){
            System.out.println("Divisible by both");
        } else if (num%5 ==0) {
            System.out.println("Divisible by 5");
        } else if (num%3 ==0) {
            System.out.println("Divisible by 3");
        }else{
            System.out.println("Not divisible by both");
        }
    }
}
