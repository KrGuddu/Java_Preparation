//for lowercase alphabet
/* Print this
a a a a
B B B B
c c c c
D D D D
 */

package Pattern_Printing;
import java.util.Scanner;

public class AlphabetSquare_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        //1st method: good =>beginner-friendly      //Why: Maintaining extra ch variable.
        //Note: If the output can be directly calculated from i/j, prefer calculating it rather than maintaining an extra variable.
//
//        char ch = 'a';
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <= n; j++) {
//                if(i % 2 != 0) System.out.print(ch + " ");
//                else System.out.print(Character.toUpperCase(ch) + " ");
//            }
//            ch++;
//            System.out.println();
//        }


        //2nd method: Best but Bad for magic number 96 and 64
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2!=0) System.out.print((char) (i+96)+" ");
                else System.out.print((char) (i+64)+" ");
            }
            System.out.println();
        }

        //3nd method: The Best              //Why: No extra ch variable, No magic numbers like 96 and 64, Logic is easy to understand, Directly shows the relationship between row number → alphabet, This is the most useful approach to remember for pattern problems.
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if (i % 2 != 0) System.out.print((char)('a' + i - 1) + " ");
//                else System.out.print((char)('A' + i - 1) + " ");
//            }
//            System.out.println();
//        }



        //For fun
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(n%2!=0) System.out.print((char) (i+96)+" ");         //Agar user Odd number de to ye chale
//                else System.out.print((char) (i+64)+" ");               //Agar user Even number de to ye chale
//            }
//            System.out.println();
//        }

    }
}



