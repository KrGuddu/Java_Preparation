/* ⚠ Version 3 (Different Purpose)
for (int i = 0; i < n; i++) {
    sum += arr[i];
    System.out.print(sum);
}

Ye kya kar raha hai?: Ye prefix sum print kar raha hai.

Example:
Input:
3
1 2 3

Output: 136

Explanation:
1
1+2 = 3
1+2+3 = 6

👉 Ye wrong nahi hai
👉 But question "Sum of Elements" ke liye correct nahi hai

Ye alag concept hai (Prefix Sum concept).
* */

package Array;
import java.util.Scanner;

public class SumOfElements_2ndMethod_Version3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            sum += arr[i];
            System.out.print(sum);
        }
    }
}
