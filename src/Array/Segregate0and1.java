//Que: Ques: Segregate 0s and 1s
//1St Method by Two pass solution   ==> Not pass all test cases to not recommended.
package Array;
import java.util.Arrays;

public class Segregate0and1 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};
        segregate0and1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void segregate0and1(int[] arr) {
        int numberOfZeros = 0;
        int numberOfOnes = 0;   //Also we can use this solution without numberOfOnes b/q numberOfOnes is started from numberOfZeros.

        for(int ele : arr){
            if(ele == 0) numberOfZeros++;
            else numberOfOnes++;
        }
        for(int i=0; i<numberOfZeros; i++){
            arr[i] =0;
        }
        for(int i=numberOfZeros; i<arr.length; i++){
            arr[i] =1;
        }
    }
}
