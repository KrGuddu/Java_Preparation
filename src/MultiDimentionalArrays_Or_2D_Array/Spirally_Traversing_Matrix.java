package MultiDimentionalArrays_Or_2D_Array;
import java.util.ArrayList;

public class Spirally_Traversing_Matrix {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m= arr.length, n=arr[0].length;
        int firstRow = 0, lastRow = m-1, firstCol = 0, lastCol = n-1;

        while(firstRow <= lastRow && firstCol <= lastCol){
            //Right
            for(int j=firstCol; j<=lastCol; j++){
                ans.add(arr[firstRow][j]);              //Here, firstRow is constant but column(j) is changing.
            }
            firstRow++;
            if(firstRow > lastRow || firstCol > lastCol) break;

            //Down
            for(int i=firstRow; i<=lastRow; i++){
                ans.add(arr[i][lastCol]);               //Here, lastCol is constant but row is changing.
            }
            lastCol--;
            if(firstRow > lastRow || firstCol > lastCol) break;

            //Left
            for(int j=lastCol; j>=firstCol; j--){
                ans.add(arr[lastRow][j]);               //Here, lastRow is constant but column is changing.
            }
            lastRow--;
            if(firstRow > lastRow || firstCol > lastCol) break;

            //Up
            for(int i=lastRow; i>=firstRow; i--){
                ans.add(arr[i][firstCol]);              //Here, firstCol is constant but row is changing.
            }
            firstCol++;
        }
        return ans;
    }
}
