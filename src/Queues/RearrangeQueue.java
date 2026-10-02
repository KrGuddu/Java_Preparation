//Write code => see screenshort

//1st method

package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class RearrangeQueue {
    class Solution {
        public void rearrangeQueue(Queue<Integer> q) {
            int n = q.size();

            Queue<Integer> first = new LinkedList<>();

            // Store first half
            for (int i = 0; i < n / 2; i++) {
                first.add(q.remove());
            }

            // Interleave first half and second half
            while (!first.isEmpty()) {
                q.add(first.remove());
                q.add(q.remove());
            }
        }
    }
}
