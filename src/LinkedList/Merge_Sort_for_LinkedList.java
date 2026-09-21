package LinkedList;

class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}

public class Merge_Sort_for_LinkedList {
    public Node mergeSort(Node head) {
        if(head.next == null) return head;      //Base case

        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;

        head = mergeSort(head);                 //here, This class return type is Node so need to store in Node like head.
        head2 = mergeSort(head2);               //∵ merge sort lagaya hai and merge sort me bar-bar list adha hota jayega and end me sort hokar ek sorted linked-list de isliye mergeSort(head) and mergeSort(head2) ko call kiya ye process dono node me hoge, so head and head2 pass kiya.
        return merge(head, head2);

    }

    Node merge(Node head1, Node head2) {        //This method is "Merge_Two_Sorted_Lists" question
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node k = dummy;

        while(i != null && j != null){
            if(i.data <= j.data){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }

        if(i==null) k.next=j;
        else k.next=i;
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
