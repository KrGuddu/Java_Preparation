//Ques: Print the Minimum element in the array [lesser/least element in array]

package Array;

public class MinElements {
    public static void main(String[] args) {
        int[] arr = {5,-1,0,99,56,105,-13};

        int min = arr[0];   // assume minimum element of array is arr[0] that is 5.     //Note: array ki minimum element ko array ki maximum value se initialized/ assume krte hai like here arr[105] taki maximum value ko minimum assum kare aur diye hue maximum value tak check kare. so we can use here: int min = arr[0];  or  int min=arr[105]   or   int min=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}
