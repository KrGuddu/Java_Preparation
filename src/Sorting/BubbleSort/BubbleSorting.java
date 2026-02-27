//boolean kam space leta hai integer se.
package Sorting.BubbleSort;

public class BubbleSorting {
    public static void print(){

    }
    public static void main(String[] args) {
        int[] arr = {5,4,8,-2,0,9,7,4,2};
        int n = arr.length;
//        print(arr);


        // worst case ==> without optimized way =>good, but not recommended
//        for (int i = 0; i <n-1; i++) {
//            for (int j = 0; j <n-1-i; j++) {
//                if (arr[j]>arr[j+1]){
//                    int temp arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        // Bubble Sort Optimised =>better   //Time complexity O(n^2)
//        for(int i = 0 i<n-1;i++){ // n-1 passes
//            boolean isSorted = true;
//            for(int j = 0 j<n-1-1;j++){
//                if(arr[j] > arr[j + 1]){
//                    int temp arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    isSorted false;
//                }
//            }
//            if(isSorted==true) break;
//        }
//        print(arr);

        // Bubble Sort Optimised ==> perfect       //Time complexity O(n)
        for(int i=0;i<n-1;i++){ // n-1 passes
            int swaps = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
    }
}
