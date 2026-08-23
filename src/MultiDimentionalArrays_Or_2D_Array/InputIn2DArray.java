//Q: Take user input and print 2D Array

package MultiDimentionalArrays_Or_2D_Array;
import java.util.Scanner;

public class InputIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];        //User i/p 3 row and 4 column ki i/p hogi jiski total elements 3*4=12 hogi.     // separate the input using space.

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
