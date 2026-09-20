//Que: Given the head of a singly linked list, delete the middle node of the linked list and return the head of the modified linked list.
//Middle_of_LinkedList me slow middle node hai, but deletion ke liye prev chahiye.

package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class DeleteMiddleOfLinkedList {
    public static Node delMiddle(Node head){
        if(head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }

    public static void printList(Node head) {       //This method is used to print the list after deleting and then need to call this in main method.
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " → ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node head = delMiddle(a);        //important because delMiddle() returns the head of the modified list.
        printList(head);
    }
}



/* Example:     10 → 20 → 30 → 40 → 50 → null
Initially:
slow = 10
fast = 10
prev = null

After traversal:
10 → 20 → 30 → 40 → 50
          ↑
         slow
     ↑
    prev

Actually:
prev = 20
slow = 30

So:
prev.next = slow.next;

means:  20 → 40

Final list: 10 → 20 → 40 → 50 → null
30 delete ho gaya.


## Core idea
prev → slow → slow.next

Delete slow:
prev.next = slow.next;

So linked-list deletion ka important pattern yaad rakho:
A → B → C

Agar B delete karna hai:
A.next = B.next;

Result: A → C
 */