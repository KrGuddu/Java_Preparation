//Q: What is the row's of the maximum sum of elements.
//Means: Wo kaun sa row hai jiski sum of elements maximum hai baki savi rows se.

package MultiDimentionalArrays_Or_2D_Array;

public class Rows_MaxSum_Q2 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int maxSum = Integer.MIN_VALUE;
        int row = -1;

        for (int i=0; i<arr.length; i++){
            int sum=0;
            for (int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println("Maximum sum of the elements: " + maxSum);
        System.out.println("Row's of the maximum sum of the element: " + row);
    }
}
