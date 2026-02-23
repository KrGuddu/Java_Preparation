//Que: Reverse an array elements b/w index 2 to 6.
//Que: Reverse using two pointer
//Concept/Problem: reverse part of array.
//Technique: Two pointer technique

package Array;

public class ReversePartOfArray {
    public static void main(String[] args) {
        int[] arr = {0,10,20,30,40,-50,60,-70,80,90};
        int n = arr.length;
        int i=2, j=6;     //or use, j=n-1-3 => j=n-4   ==> kha se kha tak matlab jaha se krna hai usse i assume kare and jaha tak krna hai usse j assume kare.

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
