//Ques: Given an Array, print negative elements only
//not Recommended

package Array;
import java.util.Scanner;

public class PrintNegativeElements_2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.print("Enter an array: ");
        int[] arr = new int[n];
        for (int i = 0; i <arr.length; i++) {   //or, i<n
           arr[i] = sc.nextInt();
           if (arr[i] < 0){
               System.out.print(arr[i] + " ");
           }
        }
    }
}
