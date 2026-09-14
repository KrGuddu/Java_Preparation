//Ques: Print the Maximum element in the array [largest element in array]

package Array;

public class MaxElements {
    public static void main(String[] args) {
        int[] arr = {5,-1,0,99,56,105,-13};

        int max = arr[0];   // assume maximum element of array is arr[0] that is 5.
//        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max) max = arr[i];         //If arr[i] > max then maximum is arr[i] otherwise maximum is arr[0]
//            max = Math.max(max, arr[i]);          //Or by Math.max method
        }
        System.out.println(max);
    }
}


// Discussion: Agar arr[i]>max karne par ek v element max mil gya to arr[0] kisi v halat me max nhi hoga, And agar array me 10 elements hai and 2nd index par hi max mil gya to ho skta hai ki aage v max mile to jo max mila hai arr[i] par usko arr[0] ki jagah par replace hoga means max ke under arr[i] store hoga, like max=arr[i].