//Q.: Take an user input and print sum of elements of 2d-array.

package MultiDimentionalArrays_Or_2D_Array;
import java.util.Scanner;

public class SumOf2DArray_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
