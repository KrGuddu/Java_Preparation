package Stacks;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {

    }

    static boolean isBalanced(String s) {
        int n = s.length();
        if(n%2 == 1) return false;
        Stack<Character> st = new Stack<>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);      //Also we can use isbalanced properties.
            else{           // ch closing bracket hua to
                if(st.size()==0) return false;          //If stacks is empty then return false.
                char top = st.peek();
                if(sameStyle(top,ch)) st.pop();
                else return false;
            }
        }
        return (st.size()==0);
    }

    static boolean sameStyle(char a, char b) {
        if(a=='(' && b==')') return true;
        if(a=='[' && b==']') return true;
        if(a=='{' && b=='}') return true;
        return false;
    }
}


/* Solution Tips:
Stacks me opening vracket ush karte jayege jaise hi closing bracket ayega to check karege ki jo current closing bracket hai uska opening bracket peek/top par hai ya nhi agar hai to usko stcks se bahar nikal denge and then next bracket ka kam karege(ye kam tab tak karege jabtak i/p string me closing bracket hoga, jaise hi savi bracket khatam ho jayege and stack empty ho jayege means savi bracket pair me the so true return karege.)
Aur, gar nhi hai to loop wahi par terminate kar denge, and false return kar denge.
 */