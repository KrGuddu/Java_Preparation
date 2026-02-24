//Que: Wave Array ==> Given a sorted array, rearrange it in-place so that it follows a wave pattern (>= <= >= <= …).
//Solution Tips: Swap every two elements each other, and increase index i from 2 after every swaping like i+=2

package Array;
import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sortInWave(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortInWave(int arr[]) {
        int n=arr.length;
        for(int i=0; i<n; i+=2){       // last element tak loop chala
            if(i == n-1) break;       // this line is use for when total no. of array element is odd. if we do not use then fine for even number but for odd number will give an error is ArrayOutOfBoundException.
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        //Or, mai 2nd last element tak hi loop ko chalau to v sahi hoga no issue.
//        for(int i=0; i<n-1; i+=2){    //2nd last element tak loop chala
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
    }
}
