//Que: Print sum of elements of the array.
//for given array in the question

package Array;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
