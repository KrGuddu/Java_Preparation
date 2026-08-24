package MultiDimentionalArrays_Or_2D_Array;
import java.util.Arrays;

public class RotateBy90Degree_Clockwise {

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

    public static void rotateMatrix(int[][] arr) {
        // Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < arr.length; i++) {
            int stCol = 0;
            int endCol = arr[i].length - 1;

            while (stCol < endCol) {
                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;

                stCol++;
                endCol--;
            }
        }
    }
}


/*
Remember this trick
For a square matrix:

Rotation	                    Steps
90° Clockwise ↻	                Transpose → Reverse each row
90° Anticlockwise ↺	            Transpose → Reverse each column

Note: Matrix rotation square aur rectangular dono ki ho sakti hai, but DSA interviews mein in-place 90° rotation ka standard question generally square matrix (n × n) par hota hai.

Note: Matrix Rotation
90° Matrix Rotation
- Square Matrix (n × n) → In-place rotation Transpose + Reverse method se easily ki ja sakti hai.
- Rectangular Matrix (m × n) → 90° rotation mathematically possible hai, lekin dimensions change ho jaate hain:
    m × n → n × m
- Isliye in-place Transpose + Reverse method generally square matrix ke liye use hoti hai.

*/