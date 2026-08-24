package MultiDimentionalArrays_Or_2D_Array;

public class Transpose_Of_Matrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,5}, {4,5,6,2}, {7,8,9,3}, {4,5,3,1}};
//        print(arr);

        //Transpose
        //This is wrong approach  //This is not work b/q of it transpose 2 times os it will return same array/matrix.
//        for(int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[0].length; j++){
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//        print(arr);

        //This is right approach and it will work.
        for(int i=1; i<arr.length; i++){        //We can also start i from 1 (i=0)  //arr[0][0] is not changing so not need to write this. whereas, i=1 is save one iteration of a loop.            //Hints for solution: It will follow triangle solution.
            for (int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }

    private static void print(int[][] arr){
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
