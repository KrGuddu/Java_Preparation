//package Stacks;
//import java.util.Stack;
//
//public class BalancedBrackets {
//    public static void main(String[] args) {
//
//    }
//
//    static boolean isBalanced(String s) {
//        int n = s.length();
//        if(n%2 == 1) return false;              //means, odd hai to false return karo
//        Stack<Character> st = new Stack<>();
//
//        for(int i=0;i<n;i++){
//            char ch = s.charAt(i);
//            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);      //Also we can use isbalanced properties.
//            else{           // ch closing bracket hua to
//                if(st.size()==0) return false;          //If stacks is empty then return false.
//                char top = st.peek();
//                if(sameStyle(top,ch)) st.pop();
//                else return false;
//            }
//        }
//        return (st.size()==0);
//    }
//
//    static boolean sameStyle(char a, char b) {
//        if(a=='(' && b==')') return true;
//        if(a=='[' && b==']') return true;
//        if(a=='{' && b=='}') return true;
//        return false;
//    }
//}


/* Balanced Brackets — Short Steps
Main Idea:
Opening bracket → push into Stack
Closing bracket → top bracket se match karo

Steps
1. String ki length n check karo.
   - n odd → false
   - Even → continue.
2. Ek Stack<Character> banao.
3. String ko left → right traverse karo.
4. Agar opening bracket (, [, { hai:
   - Stack me push() karo.
5. Agar closing bracket ), ], } hai:
   - Stack empty hai → false
   - Stack ke top ko peek() karo.
   - top aur current closing bracket matching pair hain:
     - pop() karo.
   - Match nahi karte → false
6. Loop complete hone ke baad:
   - Stack empty → true
   - Stack non-empty → false


Example
{[()]}
{  → push
[  → push
(  → push
)  → ( match → pop
]  → [ match → pop
}  → { match → pop

Stack empty → Balanced → true
One-line Revision
Opening → Push | Closing → Peek + Match → Pop | Mismatch/Empty → False | End me Empty → True
 */



/* Solution Tips:
Stacks me opening bracket use karte jayege jaise hi closing bracket ayega to check karege ki jo current closing bracket hai uska opening bracket peek/top par hai ya nhi agar hai to usko stcks se bahar nikal denge and then next bracket ka kam karege(ye kam tab tak karege jabtak i/p string me closing bracket hoga, jaise hi savi bracket khatam ho jayege and stack empty ho jayege means savi bracket pair me the so true return karege.)
Aur, gar nhi hai to loop wahi par terminate kar denge, and false return kar denge.
 */
