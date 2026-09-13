//Que: Take n number of user i/p and print the array in 2x or 2 multiply of array.

package Array;
import java.util.Scanner;

public class OutputInput_QuePart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }
}



/*If Input is:
5
1 2 3 4 5

Then Output is: 2 4 6 8 10
 */