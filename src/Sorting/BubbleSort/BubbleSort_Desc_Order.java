package Sorting.BubbleSort;

public class BubbleSort_Desc_Order {
    public static void main(String[] args) {
        int[] arr = {5,4,8,-2,0,9,7,4,2};
        int n = arr.length;

        for(int i=n-1;i>0;i++){ // n-1 passes
            int swaps = 0;
            for(int j=n-1;j>i;j++){
                if(arr[j+1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
            System.out.println(arr);
        }

    }
}
