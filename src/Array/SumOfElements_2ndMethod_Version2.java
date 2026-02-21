/* ❌ Version 2 (Wrong Logic)
for (int i = 0; i < n; i++) {
    System.out.print(sum);
}

Problem:
Sum already calculate ho chuka hai
Ye loop sum ko n times print karega

Example:
Input:
3
1 2 3

Output: 666

Kyuki sum = 6
Aur loop 3 baar chalega → 6 6 6

❌ Unnecessary loop
❌ Wrong output format
* */


package Array;
import java.util.Scanner;

public class SumOfElements_2ndMethod_Version2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i <n; i++) {
             System.out.print(sum);
        }
    }
}
