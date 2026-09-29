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
        if(st.size()==0){           //Base case
            st.push(ele);
            return;
        }
        int top = st.pop();         //stack ki ek elements ko nikalkar top me store kar diye
        pushAtBottom(st,ele);       //ye check karegea avi v stack me elements hai ya nhi agar nhi hai to push kar dega
        st.push(top);               //fir ek-ek karke savi elements ko bapas se top se stack me dal rhe hai
    }
}
