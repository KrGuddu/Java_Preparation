//Ques: Print the Minimum element in the array [lesser/least element in array]

package Array;

public class MinElements {
    public static void main(String[] args) {
        int[] arr = {5,-1,0,99,56,105,-13};

        int min = arr[0];   // assume minimum element of array is arr[0] that is 5.
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}
