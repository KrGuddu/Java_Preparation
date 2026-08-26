//continue → Skip current iteration
//break → Terminate the loop immediately

package Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //By normal method
            if (i%2==0){
                System.out.print(i + " ");
            }
            //By continue statement
            if (i%2 != 0){     //or, (i%2 == 1)
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
