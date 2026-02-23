// Array ko print krne ke liye ek print function banate hai.     ==> By Sir
package Array;

public class ModifyElements_3rd {
    public static void main(String[] args) {
        int[] arr = {4,1,7,5,-3,10,2};
        print(arr);     //Also, print method call here to print original array.
        for (int i = 0; i < arr.length; i++) {
            if (i%2 != 0) arr[i] *= 2;
            else arr[i] +=10;
        }
        print(arr);     //print method call here
    }

    public static void print(int[] arr) {       //print method create here.
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");     //print updated array
        }
        System.out.println();
    }
}
