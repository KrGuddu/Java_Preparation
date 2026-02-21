//Que: Take n number of user i/p and print the array in 2x or 2 multiply of array.

package Array;

import java.util.Scanner;

public class OutputInput_QuePart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = sc.nextInt();
            arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }
}
