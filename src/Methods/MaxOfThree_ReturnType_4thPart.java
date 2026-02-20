// Note jab koe method me int return type use karte hai aur agar usme if condition lagate hai to usme else condition lagana mandatory hota otherwise error(missing return statement) de deta hai. qki agar if condition true nhi hua to wo else condition check rkna hota hai aur else condition nhi hoga to check kya krega.

package Methods;

public class MaxOfThree_ReturnType_4thPart {
    public static void main(String[] args) {
        System.out.println(guddu(3));
    }
    public static int guddu(int a){
        if (a < 5) return a;        //In int type return: Always use else condition after if statement.
        else return -9;
    }
}
