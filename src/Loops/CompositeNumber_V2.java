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


//Note: composite number ka ek na ek factor jarur milta hai. (Or, agar ek v factor mil gya to wo composite number hoga).

/* 💡 The Core Logic
• A Prime Number has exactly two factors: 1 and the number itself.
• A Composite Number has more than two factors. This means it must have at least one other factor besides 1 and itself.
Therefore, when you write code to check if a number N is composite, your loop starts searching for factors from 2 up to √n (or up to N-1).
• The moment your code finds even a single factor (remainder is 0), you can immediately stop searching.
• You don't need to count how many total factors it has. Finding just one extra factor is absolute proof that the number is composite.


⚠️ One Important Exception
While this logic is 100% correct for numbers greater than 3, remember to handle 1, 2, and 3 separately in your code:
• Number 1 is a special case: it is neither prime nor composite.
• Numbers 2 and 3 are prime numbers.

 */