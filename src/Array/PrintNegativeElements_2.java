package Array;
import java.util.Scanner;

public class PrintNegativeElements_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.print("Enter an array: ");
        int[] arr = new int[n];

        boolean foundNegative = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
                foundNegative = true;
            }
        }
        if (!foundNegative) {
            System.out.println("No negative element found. Please enter at least one negative number.");
        }
    }
}


/* Logic
Condition	                    Meaning
arr[i] < 0	                    Negative element mila
foundNegative = true	        At least one negative mila
!foundNegative	                Ek bhi negative nahi mila
 */