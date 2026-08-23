package MultiDimentionalArrays_Or_2D_Array;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,5}, {4,5,6,2}, {7,8,9,3}};

        //Not working: give ArrayIndexOutOfBoundsException      ==>> It will only work in square matrix like 2*2 3*3, 4*4, 5*5 etc [like {{1,2,3,5}, {4,5,6,2}, {7,8,9,3}} ]
//        for(int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[0].length; j++){
//                System.out.print(arr[j][i] + " ");
//            }
//            System.out.println();
//        }

        //For hints
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i][0]);        //here 0th column is constant but row(i) is changing from 0 to arr.length
//        }
//        System.out.println();
//
//        for(int i=0; i<arr.length; i++){        //here 1st column is constant but row(i) is changing from 0 to arr.length
//            System.out.print(arr[i][1]);
//        }
//        System.out.println();
//
//        for(int i=0; i<arr.length; i++){        //here 2nd column is constant but row(i) is changing from 0 to arr.length
//            System.out.print(arr[i][2]);
//        }


        //final solution
        for(int j=0; j<arr[0].length; j++){     //here row(i) is constant but column(j) is changing
            for (int i=0; i<arr.length; i++){   //here column is constant but row is changing
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
