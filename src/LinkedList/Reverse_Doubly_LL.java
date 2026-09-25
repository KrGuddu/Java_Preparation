package LinkedList;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Reverse_Doubly_LL {
    //1st method
    public Node reverse(Node head) {
        Node pre = null;         //here we can't use prev because prev is a pointer.
        Node curr = head;
        Node fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = pre;
            curr.prev = fwd; // added line      //What is difference b/w pre vs prev and can i write pre here.
            pre = curr;
            curr = fwd;
        }
        return pre;
    }

    //2nd method: By 2-pointers
    // public Node reverse(Node head) {
    //     if(head.next==null) return head;
    //     Node temp = null;
    //     Node curr = head;
    //     while(curr!=null){
    //         temp = curr.prev;
    //         curr.prev = curr.next;
    //         curr.next = temp;
    //         curr = curr.prev; // aage leke jaa rahe hai
    //     }
    //     return temp.prev;
    // }
}
