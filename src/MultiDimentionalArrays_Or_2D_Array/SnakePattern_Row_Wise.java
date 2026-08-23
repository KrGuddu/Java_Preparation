package MultiDimentionalArrays_Or_2D_Array;

public class SnakePattern_Row_Wise {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,5}, {4,5,6,2}, {7,8,9,3}, {6,5,9,0}, {8,2,0,3}};
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for(int j= arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
