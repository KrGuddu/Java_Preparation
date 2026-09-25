//T.C.: O(n),   A.S.: O(1)
//The best solution as well of this question.   //Ye solution hashmap se v best hai qki hashmap me T.C.: O(n), A.S.: O(n) lagta hai but hashmap ka solution isse easy hai.

package LinkedList;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Copy_List_with_Random_Pointer {
    public Node deepCopy(Node head1) {
        Node temp1 = head1;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        while(temp1!=null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }
    public void merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp2!=null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
    }
    public void randomConnections(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=null && temp2!=null){
            if(temp1.random==null) temp2.random = null;
            else temp2.random = temp1.random.next;          //Ye main cheez hai jo ki connect kra rha hai 1st list ki random ko 2nd list ki random se.
            temp1 = temp1.next.next;
            if(temp2.next!=null) temp2 = temp2.next.next;
        }
    }
    public void split(Node head1) {
        Node dummy1 = new Node(-1);
        Node temp1 = dummy1;
        Node dummy2 = new Node(-1);
        Node temp2 = dummy2;
        Node temp = head1;                      // merged list pe traverse kar rha hai

        while(temp!=null){
            temp1.next = temp;
            temp = temp.next;
            temp1 = temp1.next;

            temp2.next = temp;
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp1.next = null;
    }
    public Node copyRandomList(Node head1) {
        // Step 1 : Creating deep copy without random
        Node head2 = deepCopy(head1);
        // Step 2 : InterWeaved/Alternatively connecting lists
        merge(head1,head2);
        // Step 3 : Assigning Random Pointer
        randomConnections(head1,head2);
        // Step 4 : Split the list
        split(head1);
        return head2;
    }
}


//Note: By default deep copy ki random null hoti hai