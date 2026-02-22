//Ques: Print the Maximum element in the array [largest element in array]

package Array;

public class MaxElements {
    public static void main(String[] args) {
        int[] arr = {5,-1,0,99,56,105,-13};

        int max = arr[0];   // assume maximum element of array is arr[0] that is 5.
//        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}
