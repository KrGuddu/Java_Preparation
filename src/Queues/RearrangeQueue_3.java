//Chatgpt
//Also check sir code

package Queues;
import java.util.Queue;
import java.util.Stack;

public class RearrangeQueue_3 {
    class Solution {
        public void rearrangeQueue(Queue<Integer> q) {
            int n = q.size();
            Stack<Integer> st = new Stack<>();

            // Step 1: Move first half into stack
            for (int i = 0; i < n / 2; i++) {
                st.push(q.remove());
            }

            // Step 2: Put them back into queue
            while (!st.isEmpty()) {
                q.add(st.pop());
            }

            // q = [3, 4, 2, 1]

            // Step 3: Move first half to stack again
            for (int i = 0; i < n / 2; i++) {
                st.push(q.remove());
            }

            // q = [2, 1]
            // st = [3, 4]

            // Step 4: Interleave
            while (!st.isEmpty()) {
                q.add(st.pop());
                q.add(q.remove());
            }

            // q = [4, 3]

            // Step 5: Reverse queue
            while (!q.isEmpty()) {
                st.push(q.remove());
            }

            while (!st.isEmpty()) {
                q.add(st.pop());
            }

            // q = [3, 4]
        }
    }
}

