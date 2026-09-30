//By Sir: Best
//Time: O(n), Space: O(n)

package Stacks;
import java.util.Stack;

//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class RemoveNodesFromLL {
    public ListNode removeNodes(ListNode head) {
        //1st method:        //T.C.= O(n), A.S.=O(n)
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        while(temp!=null){
            while(st.size()>0 && st.peek().val < temp.val) st.pop();            // st.size()>0;  ==>use this to handle underflow error
            st.push(temp);
            temp=temp.next;
        }
        while(st.size()>0){
            ListNode top = st.pop();
            top.next = temp;
            temp = top;
        }
        return temp;
    }
}


/* Idea: Remove a node if there is a node to its right with a greater value.
Example: 5 → 2 → 13 → 3 → 8

5 → remove because 13 is greater
2 → remove because 13 is greater
13 → keep
3 → remove because 8 is greater
8 → keep

Result: 13 → 8
 */


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