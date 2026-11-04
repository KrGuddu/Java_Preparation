package MultiDimentionalArrays_Or_2D_Array;
import java.util.Arrays;

public class RotateBy90Degree_AntiClockwise {
    public static void main(String[] args) {
        int [][] arr = {{0,1,2}, {3,4,5}, {6,7,8}};
//        int[][] arr = {
//                {0, 1, 2},
//                {3, 4, 5},
//                {6, 7, 8}
//        };

        rotateMatrix(arr);

        // Print matrix
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void rotateMatrix(int[][] arr) {          //without static it will give error  ==>> non-static method rotateMatrix(int[][]) cannot be referenced from a static context
        //1st: Transpose: Convert rows into columns and columns into rows.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //2nd: Reverse each column: Gives 90° anticlockwise rotation.   // After transpose, reverse each column to get 90° anticlockwise rotation.      //Har column ke elements ko top-to-bottom reverse karta hai.
        for (int j = 0; j < arr[0].length; j++) {
            int stRow = 0;
            int endRow = arr.length - 1;

            while (stRow < endRow) {
                int temp = arr[stRow][j];
                arr[stRow][j] = arr[endRow][j];
                arr[endRow][j] = temp;

                stRow++;
                endRow--;
            }
        }
    }
}

/*
Rotation	                Logic
90° Clockwise	            Transpose + Reverse Rows
90° Anti-Clockwise	        Transpose + Reverse Columns

Important: Ye approach in-place transpose/reversal ke saath square matrix ke liye use hoti hai. Rectangular matrix mein dimensions change hoti hain, isliye generally new matrix banana padta hai.
 */
