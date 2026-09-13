//Ques: Taking input Printing negative elements
//Or: Given an Array, print negative elements only
//Note: best method: Recommended  ==> Begginer friendly

package Array;
import java.util.Scanner;

public class PrintNegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.print("Enter an array: ");
        int[] arr = new int[n];
        //Taking i/p
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
//            if (arr[i]<0) System.out.print(arr[i] + " ");         //Directly ye v kar skte hai ==> Slightly shorter
        }

        //Printing -ve
        for (int i = 0; i <arr.length; i++){
            if (arr[i] < 0) System.out.print(arr[i] + " ");
        }
    }
}


/* This teaches you the important DSA pattern:
Input → Store → Traverse → Process

And later, if the question changes to:
"Find the largest negative element"
or, "Count negative elements"
or, "Replace all negative elements with 0"

then having the array is useful.
 */


/* else System.out.println("No negative element found. Please enter at least one negative number.");
==>>Dono me kisi v loop me ye likhna wrong approach hoga qki ye har element ko check karne ke baad print hoga like:
Not negative...
        -5
Not negative...
        -20
*/
