//Que: Ques: Segregate 0s and 1s
//2nd Method by Two pointer technique   ==> best a/c to sir.

package Array;
import java.util.Arrays;

public class Segregate0and1_3rdMethod {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};
        segregate0and1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void segregate0and1(int[] arr) {
        int n = arr.length;
        int i=0, j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }

        }
    }
}
