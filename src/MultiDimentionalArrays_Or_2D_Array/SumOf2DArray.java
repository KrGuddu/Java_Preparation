//Q: Sum of elements in given Matrix
//Q: Print sum of elements of given 2d-array.

package MultiDimentionalArrays_Or_2D_Array;

public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {2,3,0}, {0,5,9}};

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
