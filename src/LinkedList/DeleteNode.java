package LinkedList;

public class DeleteNode {
    // Node class
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Delete given node   //This is actual code        //Hint in que: You do not have to delete actual node, it delete the value =>means value delete karna hai node nhi.
    public static void deleteNode(Node tar) {           //void me kux return nhi karna hota hai.
        tar.val = tar.next.val;
        tar.next = tar.next.next;
    }               //isme targeted node ki value ko delete karna hai to target ke next node ki value ko target ke under store kara le and then target.next.next ko target ka next bana do.

    // Print Linked List
    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Before deletion:");     //1 -> 2 -> 3 -> 4 -> null
        printList(head);

        // Delete node 3
        Node target = head.next.next;
        deleteNode(target);

        System.out.println("After deletion:");      //1 -> 2 -> 4 -> null
        printList(head);
    }
}
