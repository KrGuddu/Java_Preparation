package Queues;
import java.util.Queue;
import java.util.Stack;

//It will give runTimeError
//public class Reverse_First_K_Elements_In_Queue {
//    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
//        Stack<Integer> st = new Stack<>();
//
//        // 1. First K elements -> Stack
//        for(int i = 0; i < k; i++) {
//            st.push(q.remove());
//        }
//
//        // 2. Stack -> Queue
//        while(st.size() > 0) {
//            q.add(st.pop());
//        }
//
//        // 3. Remaining elements ko end me shift karo
//        int n = q.size() - k;
//
//        for(int i = 0; i < n; i++) {
//            q.add(q.remove());
//        }
//
//        return q;
//    }
//}


//Use this to handle error       =>The runtime error is because k > q.size().
public class Reverse_First_K_Elements_In_Queue {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();

        // If k is greater than queue size
        if(k > n) {
            return q;
        }

        Stack<Integer> st = new Stack<>();

        // 1. Put first K elements into stack
        for(int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        // 2. Put them back into queue in reverse order
        while(st.size() > 0) {
            q.add(st.pop());
        }

        // 3. Move remaining elements to the back
        for(int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }

        return q;
    }
}


/*
Important edge cases
q = [1,2,3,4,5], k = 3
→ [3,2,1,4,5]

q = [1,2,3,4,5], k = 5
→ [5,4,3,2,1]

q = [1,2,3,4,5], k = 7
→ [1,2,3,4,5]

So the key check is:
if(k > q.size()) return q;

Revision point:
Before removing k elements, always ensure k <= queue.size().

 */