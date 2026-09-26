import LinkedList.Node;
import java.util.Arrays;

//class Node{
//    int val;
//    Node next;
//    Node(int val){
//        this.val = val;
//    }
//}

class ListNode{ // user defined data type
    int val;
    ListNode next; // null
    ListNode(int val){
        this.val = val;
    }
}
public class test {
    public static int getMiddleEle(ListNode head1, ListNode head2){
//        int length = 0;
//        Node temp = head;
//        while (temp != null){
//            temp = temp.next;
//            length++;
//        }
//
//        temp = head;
//        for(int i=1; i<=length/2; i++){
//            temp = temp.next;
//        }
//        return temp.val;

//        Node slow = head;
//        Node fast = head;
//        Node temp = head;
//        while(fast != null && fast.next !=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        while (temp != null){
//            temp.next = temp.next.next;
//            slow.next = temp;
//        }
//        return slow.val;


        int len1=0;
        ListNode temp1 = head1;
        while(temp1 != null){
            temp1 = temp1.next;
            len1++;
        }

        int len2=0;
        ListNode temp2 = head2;
        while(temp2 != null){
            temp2 = temp2.next;
            len2++;
        }

        temp1 = head1;
        temp2 = head2;

        if(len1>len2){
            for(int i=1; i<=len1-len2; i++){
                temp1 = temp1.next;
            }
        }
        else {
            for(int i=1; i<=len2-len1; i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
//        return temp2;
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

        System.out.println(getMiddleEle(a));
    }
}

