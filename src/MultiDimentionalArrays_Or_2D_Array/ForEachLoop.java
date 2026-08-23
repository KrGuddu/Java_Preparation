package MultiDimentionalArrays_Or_2D_Array;

public class ForEachLoop {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,5}, {4,5,6,2}, {7,8,9,3}};

        //2D Array ke nested loop ke under for each loop lagana
        for (int i=0; i<arr.length; i++){
            for(int ele : arr[i]){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        //2D Array ke nested loop ke bahar (outer) me for each loop lagana
        for(int[] a : arr){     //Dhayan rhe 2D array ke outer me for each loop lagate time int ke bad [] dena na bhule, otherwise error return karega.     //qki arr ek 2d array hai and isse int ke under store krne ki kosis kar rhe hai jo ki error dega so isse int[] me store kare qki int[] ek 1d array hai.
            for(int ele : a){       // 1st loop me 2d array me se 1d array ko uthaya and then 1d array me se element ko print kiya.
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
