//Solve without stack, using if-else conditions                 ==>>The best
//TC: O(n)
//AS: O(1)

package Stacks;

public class RemoveNodesFromLL_3 {
    public ListNode removeNodes(ListNode head) {

        // Step 1: Reverse the linked list
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // prev is now the reversed head
        head = prev;

        // Step 2: Remove nodes smaller than the maximum seen so far
        curr = head;
        int max = curr.val;

        while (curr != null && curr.next != null) {

            if (curr.next.val < max) {
                // Remove curr.next
                curr.next = curr.next.next;
            }
            else {
                // Current node becomes the new maximum
                max = curr.next.val;
                curr = curr.next;
            }
        }

        // Step 3: Reverse again to restore original order
        prev = null;
        curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}


/* Dry run
Input: 5 → 2 → 13 → 3 → 8
Reverse: 8 → 3 → 13 → 2 → 5

Now process:
max = 8

3 < 8 → remove 3
13 > 8 → keep 13, max = 13
2 < 13 → remove 2
5 < 13 → remove 5

Remaining: 8 → 13

Reverse again: 13 → 8


The important if-else
if (curr.next.val < max) {
    curr.next = curr.next.next;  // remove
}
else {
    max = curr.next.val;         // keep
    curr = curr.next;
}


The main trick is: reverse → compare with maximum → remove → reverse back.
 */