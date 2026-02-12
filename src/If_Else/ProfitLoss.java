//Que.: If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss or no profit no loss. Also determine how much profit he made or loss he incurred.
//Note: we can use multiple if condition at a time. Absolutely allowed

package If_Else;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CP: ");
        double cp = sc.nextDouble();          // Better way to use double datatype => if I give and double value then will get an error, so always use double. => when datatype is int so error is: Exception in thread "main" java.util.InputMismatchException.

        System.out.print("Enter Sp: ");
        double sp = sc.nextDouble();

        // Use this to find only profit or loss
        if (sp > cp) {
            System.out.println(sp);
        }else {
            System.out.println(cp);
        }

        // or, Use this to find profit or loss or no profit no loss
//        if (sp > cp) System.out.println(sp);
//        if (cp > sp) System.out.println(cp);
//        if (cp == sp) System.out.println("No Profit, No Loss");

        // Use this to find profit or loss or no profit no loss as well as how many profit or loss.
//        if (sp > cp) System.out.println("Profit is: " + (sp - cp));
//        if (cp > sp) System.out.println("Loss is: " + (cp - sp));
//        if (cp == sp) System.out.println("No Profit, No Loss");

        // or, using else-if condition
        if (sp > cp) System.out.println("Profit is: " + (sp - cp));
        else if (cp > sp) System.out.println("Loss is: " + (cp - sp));
        else System.out.println("No Profit, No Loss");


        // use this to find profit % or loss % as well as no profit no loss.
//        if (sp > cp) System.out.println("Profit % is: " + (sp - cp)*100/cp + " %");
//        if (cp > sp) System.out.println("Loss % is: " + (cp - sp)*100/cp + " %");
//        if (cp == sp) System.out.println("No Profit, No Loss");

        // or, using else-if condition
        if (sp > cp) System.out.println("Profit % is: " + (sp - cp)*100/cp + " %");
        else if (cp > sp) System.out.println("Loss % is: " + (cp - sp)*100/cp + " %");
        else System.out.println("No Profit, No Loss");
    }
}
