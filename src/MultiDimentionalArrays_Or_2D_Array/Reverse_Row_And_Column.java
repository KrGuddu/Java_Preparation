package MultiDimentionalArrays_Or_2D_Array;

public class Reverse_Row_And_Column {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,5}, {4,5,6,2}, {7,8,9,3}};
        for(int i=0; i<arr.length; i++){
            for(int j=arr[0].length-1; j>=0; j--){
                System.out.print(arr[i][j] + " ");
//                for(j=0; j<arr[0].length; j++){
//                    for(i=arr.length-1; i>=0; i--){
//                        System.out.print(arr[i][j] + " ");
//                    }
////                    System.out.println();
//                }
            }
            System.out.println();
        }


//        for(int j=0; j<arr[0].length; j++){
//            for(int i=arr.length-1; i>0; i--){
//                for(i=0; i<arr.length; i++){
//                    for(j=arr[0].length; j>=0; j--){
//                        System.out.print(arr[i][j] + " ");
//                    }
//                    System.out.println();
//                }
////                System.out.print(arr[i][j] + " ");
////                for(j=0; j<arr[0].length; j++){
////                    for(i=arr.length-1; i>=0; i--){
////                        System.out.print(arr[i][j] + " ");
////                    }
////                    System.out.println();
////                }
//            }
//            System.out.println();
//        }




        for(int j=0; j<arr[0].length; j++){
            for(int i=arr.length-1; i>=0; i--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
