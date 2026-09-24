package LinkedList;

public class Reverse_Sublist_Of_LL {
    //2nd method: Best
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

    Node reverseBetween(int l, int r, Node head) {      //here we consider a as left, and b as right.
        Node dummy = new Node(-1);
        Node temp = dummy;
        dummy.next = head;

        for(int i=1;i<=l-1;i++){
            temp = temp.next;
        }
        Node tail1 = temp;
        Node head2 = temp.next;

        for(int i=1;i<=r-l+1;i++){      //Also we write:  [ temp = dummy;  for(int i=1; i<=r; i++) {temp = temp.next;} ]        =>temp = dummy means temp ko bapas se dummy par le gya.
            temp = temp.next;
        }
        Node tail2 = temp;
        Node head3 = temp.next;

        tail1.next = null;
        tail2.next = null;

        reverse(head2);

        tail1.next = tail2;
        head2.next = head3;
        return dummy.next;
    }

    //1st method
    // Node reverseBetween(int a, int b, Node head) {
    //     ArrayList<Node> arr = new ArrayList<>();
    //     Node temp = head;

    //     while(temp!=null){
    //         arr.add(temp);
    //         temp = temp.next;
    //     }

    //     int i = a-1, j = b-1;
    //     while(i<j){
    //         //swap
    //         Node t1 = arr.get(i);
    //         Node t2 = arr.get(j);
    //         arr.set(i,t2);
    //         arr.set(j,t1);
    //         i++;
    //         j--;
    //     }

    //     for(i=0;i<arr.size();i++){
    //         arr.get(i).next = (i==arr.size()-1) ? null : arr.get(i+1);
    //     }
    //     return arr.get(0);
    // }
}
