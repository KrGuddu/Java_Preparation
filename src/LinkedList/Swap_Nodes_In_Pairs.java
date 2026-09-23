package LinkedList;

public class Swap_Nodes_In_Pairs {
    //1st method
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null) return head;

        ListNode dummy= new ListNode(-1);
        ListNode a = head;
        ListNode b= head.next;
        ListNode c = dummy;

        while(a!=null && b!=null){
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = a;
            a = a.next;
            if(a!=null) b = a.next;
        }
        return dummy.next;
    }

    //2nd method: By breaking & adding node

    public static void main(String[] args) {

    }
}

//Check this on github(Bhaiya) : SwappingNodesInALinkedList
