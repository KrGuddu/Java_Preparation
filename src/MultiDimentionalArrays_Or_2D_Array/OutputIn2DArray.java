//Q: Print 2D Array

package MultiDimentionalArrays_Or_2D_Array;

public class OutputIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];            //This is 3x4 array and default value is 0.         // int[][] arr = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}}
        // System.out.println(arr.length + " " + arr[0].length);       //no. of rows in 2d array: arr.length  //no. of column in 2d array: arr[0].length   or arr[1].length  or arr[2].length  =>where 0,1,2... is representing row's number.

        for(int i=0; i<arr.length; i++){     //so here, i<3 is arr.length
            for(int j=0; j<arr[0].length; j++){     //so here, i<4 is arr[0].length
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
