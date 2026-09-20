package LinkedList;

public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RotateList {
    public int length(ListNode head){           //to find length
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        int n = length(head);
        k %= n;

        if(k == 0) return head;

        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<=k+1;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode a = slow.next;
        slow.next = null;
        ListNode tail = a;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = head;
        return a;
    }

    public static void main(String[] args) {

    }
}
