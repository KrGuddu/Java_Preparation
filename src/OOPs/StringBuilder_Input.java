//Q: How to take i/p from string builder

package OOPs;
import java.util.Scanner;

public class StringBuilder_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
    }
}
