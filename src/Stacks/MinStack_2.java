//2nd method: Advanced

package Stacks;
import java.util.Stack;

public class MinStack_2 {
    Stack<Long> st;
    long min;

    public MinStack_2() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int value) {
        long val = (long)value;
        if(st.size()==0) min = val;

        if(val >= min) st.push(val);
        else{ // val<min, stack me fake value daalo
            st.push(val + (val-min));           //or, 2*val-min
            min = val;
        }
    }

    public void pop() {
        if(st.peek() < min){ // locha hai, minimum roll back karo
            min = min + (min - st.peek());
        }
        st.pop();
    }

    public int top() {
        long peek = st.peek();
        if(peek < min){ // locha hai, minimum roll back karo
            return (int)min;
        }
        else return (int)peek;
    }

    public int getMin() {
        return (int)min;
    }
}
