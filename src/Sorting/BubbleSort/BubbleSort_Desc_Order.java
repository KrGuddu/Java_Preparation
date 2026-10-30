package Sorting.BubbleSort;
import java.util.Arrays;

public class BubbleSort_Desc_Order {
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {5,4,8,-2,0,9,7,4,2};
        int n = arr.length;

        //1st method: Left-to-right traversal: Largest element moves to the right.          =>Recommended
        for(int i=0; i<n-1; i++){ // n-1 passes
            int swaps = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        print(arr);


        //2nd method: Right-to-left traversal: Largest element moves to the left.       -> Not good
//        for(int i = 0; i < n-1; i++) {
//            int swaps = 0;
//
//            for(int j = n-1; j > i; j--) {
//                if(arr[j] > arr[j-1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                    swaps++;
//                }
//            }
//            if(swaps == 0) break;
//        }
//        print(arr);

    }
}



/*
Complexity of both optimised approaches:
Case	            Time
Best	            O(n)
Average	            O(n²)
Worst	            O(n²)
Auxiliary Space	    O(1)
 */