package Loops;
import java.util.Scanner;

public class CompositeNumber_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        boolean flag = false;       //I assume false(means: composite number) initially.

        for (int i = 2; i <= n - 1; i++) {          //Optimization Way: i*i<=n Means: Agar n composite hai, to uska at least ek factor √n tak mil jayega.
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Composite Number");
        } else {
            System.out.println("Not Composite Number");
        }
    }
}
