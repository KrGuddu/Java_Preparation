//Que: Print sum of elements of the array.
//for taken i/p elements of array from user => Best Method

package Array;
import java.util.Scanner;

public class SumOfElements_2ndMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.print("Enter an array: ");
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
