package Array;
import java.util.Scanner;

public class ModifyElements_2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();      //First: take input
        }

        //2nd: Apply condition
        for (int i = 0; i < n; i++) {
            if (i%2 != 0){      // odd index
                arr[i] *= 2;
            }else{              // even index
                arr[i] +=10;
            }
//            System.out.print(arr[i] + " ");       //Also we can print here directly
        }
        //3rd: Print result
        System.out.print("Modified array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
