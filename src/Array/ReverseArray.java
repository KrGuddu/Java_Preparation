//Ques: Reverse Array or Reverse using two pointer
//concept/Problem: reversing an array/reversing the complete array
//Technique: Two pointer technique

package Array;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,-50,60,-70,80,90};
        int n = arr.length;
        int i=0, j=n-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr) System.out.print(ele +" ");
    }
}
