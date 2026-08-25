package MultiDimentionalArrays_Or_2D_Array;

public class Search_In_A_Row_Column_Sorted_matrix {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;

        //Method1: Best b/q of T.C. : O(m+n)
        int i=0, j=n-1;
        while(i<m && j>=0){
            if(arr[i][j] > target) j--;
            else if(arr[i][j] < target) i++;
            else return true;
        }
        return false;


        //Bad b/q of T.C. : O(m*n)
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(arr[i][j] == target) return true;
        //     }
        // }
        // return false;
    }
}
