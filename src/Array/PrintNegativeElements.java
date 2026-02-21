//Ques: Given an Array, print negative elements only
//Note: best method: Recommended

package Array;
import java.util.Scanner;

public class PrintNegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.print("Enter an array: ");
        int[] arr = new int[n];
        //Taking i/p
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Printing -ve
        for (int i = 0; i <arr.length; i++){
            if (arr[i] < 0) System.out.print(arr[i] + " ");
        }
    }
}
