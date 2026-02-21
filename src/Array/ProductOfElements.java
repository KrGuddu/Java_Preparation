//Que: Print product of elements of the array

package Array;
import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        System.out.print("Enter an array: ");
        int[] arr = new int[n];
        int product = 1;
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
            product *= arr[i];
        }
        System.out.print(product);
    }
}
