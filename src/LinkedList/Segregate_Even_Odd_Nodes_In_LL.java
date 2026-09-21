package LinkedList;

//class Node {
//    int data;
//    Node next;
//
//    Node(int x){
//        data = x;
//        next = null;
//    }
//}

public class Segregate_Even_Odd_Nodes_In_LL {
    Node divide(Node head) {
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node t1 = d1;       //for smaller value
        Node t2 = d2;       //for larger value
        Node t = head;

        while(t != null){
            if(t.data%2==0){
                t1.next = t;
                t1 = t1.next;
            }
            else{
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }

        t1.next = d2.next;
        t2.next = null;
        return d1.next;
    }

    public static void main(String[] args) {

    }
}
