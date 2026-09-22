package LinkedList;
import java.util.ArrayList;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class ReverseLL {
    Node reverseList(Node head) {
        //1st method : Using Extra Array(ArrayList Method): T.C.= O(n), A.S.= O(n)
//         Node temp = head;
//         ArrayList<Node> arr = new ArrayList<>();
//         while(temp!=null){
//             arr.add(temp);
//             temp = temp.next;
//         }
//
//         int n = arr.size();
//         for(int i=n-1;i>=1;i--){
//             arr.get(i).next = arr.get(i-1);
//         }
//         arr.get(0).next = null;
//         return arr.get(n-1);

        //2nd method: 3-pointer approach(Iterative way):  T.C.= O(n), A.S.= O(1)       ==>Best for interview
        Node curr = head;
        Node prev = null;
        Node fwd = null;            //We can set fwd on null, or head or anywhere on the list.
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;

    }
    public static void main(String[] args) {

    }
}
