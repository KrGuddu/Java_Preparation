//Que: Ques: Segregate 0s and 1s
//Two pointer technique using while loop    ==> best a/c to chatGpt.
//gfg: https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

package Array;
import java.util.Arrays;

public class Segregate0and1_2ndMethod {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};
        segregate0and1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void segregate0and1(int[] arr) {
        int n = arr.length;
        int i=0, j=n-1;

        while(i<j){
            while(i<j && arr[i] ==0){
                i++;
            }
            while(i<j && arr[j] ==1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}

