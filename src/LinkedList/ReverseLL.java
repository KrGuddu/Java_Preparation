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
         Node temp = head;
         ArrayList<Node> arr = new ArrayList<>();
         while(temp!=null){
             arr.add(temp);
             temp = temp.next;
         }

         int n = arr.size();
         for(int i=n-1;i>=1;i--){
             arr.get(i).next = arr.get(i-1);
         }
         arr.get(0).next = null;
         return arr.get(n-1);

    }
    public static void main(String[] args) {

    }
}
