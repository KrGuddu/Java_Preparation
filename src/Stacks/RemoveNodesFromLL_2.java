//By chatgpt

package Stacks;
import java.util.Stack;

//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}


public class RemoveNodesFromLL_2 {
    public ListNode removeNodes(ListNode head) {

        // Stack to store nodes in decreasing order
        Stack<ListNode> stack = new Stack<>();

        ListNode curr = head;

        while (curr != null) {

            // Remove smaller nodes from stack
            // because current node is greater than them
            while (!stack.isEmpty() && stack.peek().val < curr.val) {
                stack.pop();
            }

            // Add current node
            stack.push(curr);

            curr = curr.next;
        }

        // Reconstruct the linked list
        ListNode newHead = null;

        while (!stack.isEmpty()) {
            ListNode node = stack.pop();

            node.next = newHead;
            newHead = node;
        }

        return newHead;
    }
}


/* Dry run
For: 5 → 2 → 13 → 3 → 8

Current	        Stack
5	            [5]
2	            [5, 2]
13	            [13] → removes 2, 5
3	            [13, 3]
8	            [13, 8] → removes 3

Then reconstruct:
13 → 8

Complexity
Time: O(n) — every node is pushed and popped at most once.
Space: O(n) — stack can contain up to n nodes.

Key interview line:
"A node is removed if a greater node exists on its right, so while traversing from left to right, I maintain a monotonic decreasing stack and pop all smaller nodes when a greater current node is found."
 */