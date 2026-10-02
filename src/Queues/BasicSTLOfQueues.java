package Queues;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicSTLOfQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
//        Queue<Integer> q = new ArrayDeque<>();            //we can use linked-list or arraydeque interface to create a queue

        q.add(10); q.add(20); q.add(30); q.add(40);
        System.out.println(q+" "+q.peek());                // nakli printing => ye v allowed hai
        q.remove();
        System.out.println(q+" "+q.size());
        System.out.println(q.remove()+" "+q);               //jo element remove ho rha hai wo and updated queues dono sath me print ho rha hai.
    }
}
