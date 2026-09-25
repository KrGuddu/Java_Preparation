//By chatgpt (https://chatgpt.com/c/6ab60cb3-391c-83e8-8628-cfaf126fe106)

package LinkedList;

public class Deletion_And_Reverse_In_LL_2 {
    // Function to reverse a circular linked list
    Node reverse(Node head) {

        // UPDATE 1:
        // Handle empty list and single-node circular list.
        if (head == null || head.next == head) {
            return head;
        }

        // Find the tail of the circular linked list
        Node tail = head;

        while (tail.next != head) {
            tail = tail.next;
        }

        // UPDATE 2:
        // Instead of breaking the circular link and calling reverseList(),
        // reverse the circular linked list directly.
        Node prev = tail;
        Node curr = head;
        Node fwd;

        do {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        } while (curr != head);

        // UPDATE 3:
        // After reversal, old head becomes the new tail.
        // New head is 'prev'.
        head.next = prev;

        return prev;
    }


    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {

        // UPDATE 4:
        // Handle empty linked list.
        if (head == null) {
            return null;
        }

        // UPDATE 5:
        // Handle the case where there is only one node.
        if (head.next == head) {
            if (head.data == key) {
                return null;
            }
            return head;
        }

        // Case 1: Delete the head node
        if (head.data == key) {

            // Find the tail
            Node tail = head;

            while (tail.next != head) {
                tail = tail.next;
            }

            // Move head to the next node
            head = head.next;

            // Maintain circular connection
            tail.next = head;

            return head;
        }

        // Case 2: Delete a node other than head
        Node temp = head;

        // UPDATE 6:
        // Traverse until temp.next becomes head.
        // This prevents going outside the circular list.
        while (temp.next != head) {

            if (temp.next.data == key) {

                // Delete temp.next
                temp.next = temp.next.next;

                return head;
            }

            temp = temp.next;
        }

        // Key was not found
        return head;
    }
}
