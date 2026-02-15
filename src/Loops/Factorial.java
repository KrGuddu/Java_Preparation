// Note: 16 ka fatorial 2004189184 hogi and uske baad negative me hogi aur jab kisi ka factorial zero aa rha hai matlab ki wo value integer ki max limit ko across kar gaye hai.
package Loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i<=n; i++) {
            fact *= i;      // yaha i hai na ki 1
//            System.out.println(fact);   //factorial ko step by step multiply krke dikayega
        }
        System.out.println(fact);
    }
}
