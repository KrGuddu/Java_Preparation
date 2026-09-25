//By sir

package LinkedList;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Deletion_And_Reverse_In_LL {
    // Function to reverse a circular linked list
    void reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node fwd = null;

        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
    }
    Node reverse(Node head) {
        Node tail = head;
        while(tail.next!=head) tail = tail.next;
        tail.next = null;
        reverseList(head);
        head.next = tail;
        return tail;
    }


    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        Node tail = head;
        while(tail.next!=head) tail = tail.next;
        tail.next = null;

        if(head.data==key){
            head = head.next;
            tail.next = head;
            return head;
        }

        Node temp = head;
        Node temp2 = head.next;
        while(temp2!=null){
            if(temp2.data == key){
                temp.next = temp2.next;
                break;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        tail.next = head;
        return head;
    }
}


/* // Function to reverse a circular linked list
Step1: Convert circular ll to singly ll
Step2: Reverse the list
Step3: Then, head.next=tail; return tail;           //tail is representing head of final ll

// Function to delete a node from the circular linked list
Step1: Create a tail node and move tail to tails position and connect to null       ==>To make circular to singly ll
Step2: if head.val==key then head=head.next; and tail.next=head;                    ==>To delete specific node
Step3: temp=head; and k=head;        ==>Dono ko head par rakhe
       In while loop, if k==key then temp.next=k.next; (or, temp.next=temp.next.next;) and t.next=head;
 */