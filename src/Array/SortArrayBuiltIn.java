package Array;
import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        // sort - ascending order
        int[] arr = {4,1,7,5,-3,10,2};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



/*
public static void main(String[] args) {
    int[] arr={-51,2,-3,0,54,65};
    Arrays.sort(arr);
    System.out.println(arr);
}

Arrays.sort(arr) method array ko sort kar dega but sout(arr) array ko print nhi kareg, Ye array object ki reference-related string representation print karta hai like [I@6acbcfc0.
So, Array ko as-it-is print karane ke liye sout(Arrays.toString(arr)) karna hoga and sorted array ko print karne ke liye loop ka use karna hi hoga.
*/