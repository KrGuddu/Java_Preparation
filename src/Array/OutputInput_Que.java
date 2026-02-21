//Que: Take user i/p and print the array in 2x or 2 multiply of array.

package Array;
import java.util.Scanner;

public class OutputInput_Que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            arr[i] *= 2;
            System.out.print(arr[i] + " ");     //Or, 2*arr[i]
        }
    }
}
