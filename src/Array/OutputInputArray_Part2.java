//Que: Take user input and print an array

package Array;
import java.util.Scanner;

public class OutputInputArray_Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        //take Input
        for (int i = 0; i <7 ; i++) {
            int x = sc.nextInt();   //7 bar input le rhe hai
            arr[i] = x;  // har bar arr ke under x (jo ki input value hai) ko store kar rhe hai

            //or
//            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");     // output   //If i/p is: 1 2 3 4 5 6 7 then o/p is 1 2 3 4 5 6 7
        }

        //Output
//        for (int i = 0; i <7; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

}
