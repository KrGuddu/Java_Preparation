package LinkedList;

public class Circular_LL_Traversal {
    public void printList(Node head) {
        //1st method
        // System.out.print(head.data+" ");
        // Node temp = head.next;
        // while(temp!=head){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }

        //2nd method
        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }

}
