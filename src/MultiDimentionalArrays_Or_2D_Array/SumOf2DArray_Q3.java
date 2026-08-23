//Q.: Take an user input and print sum of elements of 2d-array as well as array.

package MultiDimentionalArrays_Or_2D_Array;
import java.util.Scanner;

public class SumOf2DArray_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of 2d-array is: " + sum);
    }
}
