//Time: O(n)
//Auxiliary Space: O(n) — recursion call stack

package Stacks;
import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); // bottom
        st.push(20);
        st.push(30);
        st.push(40); // top
        int ele = 50;
        System.out.println(st);             //o/p: [10, 20, 30, 40]
        pushAtBottom(st,ele);
        System.out.println(st);             //o/p: [50, 10, 20, 30, 40]

//        reverse(st);
//        System.out.println(st);
    }

//    private static void reverse(Stack<Integer> st) {          //By recursion method       =>Bad, not recommended
//        if(st.size()<=1) return;          //Base case
//        int top = st.pop();               //1st Step: last element ko nikalkar top me store kar liye
//        reverse(st);                      //2nd Step: magic se reverse kar liye
//        pushAtBottom(st,top);             //3rd Step: last(jo ki top me store tha) element ko bottom me and then reversed element ko ko dal diya
//    }

    private static void pushAtBottom(Stack<Integer> st, int ele) {          //By normal method  =>Good
        if(st.size()==0){           //Step3: Base case      =>jab stack empty ho gaya tab dalo.
            st.push(ele);
            return;
        }
        int top = st.pop();         //Step1: Remove top element       ==>stack ki ek elements ko nikalkar top me store kar diye
        pushAtBottom(st,ele);       //Step2: Go until stack becomes empty         //pushAtBottom() recursively keeps popping elements until the stack becomes empty. At that point, it pushes ele, and during backtracking it restores all popped elements.     //ye line bar bar chalega jabtak stack khali na ho jaye.
        st.push(top);               //Step4: Restore removed element          =>fir ek-ek karke savi elements ko bapas se top se stack me dal rhe hai
    }
}



/* Dry run:-
For: [10, 20, 30, 40] → push 50 at bottom
1. Pop 40
2. Pop 30
3. Pop 20
4. Pop 10
5. Stack becomes empty → push 50
6. Backtracking → push 10
7. Push 20
8. Push 30
9. Push 40

Final: [50, 10, 20, 30, 40]
 */