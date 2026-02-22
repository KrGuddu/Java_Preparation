//Note: Shallow copy original array ko change karti hai but deep copy nhi.
package Array;
import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        int[] brr = new int[arr.length];    // brr is deep copy => 2nd method of deep copy
        for(int i=0;i<arr.length;i++){
            brr[i] = arr[i];
        }

        //shallow copy
        int[] x = arr; // x is shallow copy of arr
        x[0] = 100;
        System.out.println(arr[0]);

        // deep copy
        int[] y = Arrays.copyOf(arr, arr.length);    // arr: name of array jise ham update krna chahte hai, arr.length: kaun si length par update krna chahte hai
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
