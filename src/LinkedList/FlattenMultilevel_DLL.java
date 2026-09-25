package LinkedList;
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}

public class FlattenMultilevel_DLL {
    public Node flatten(Node head) {
        if(head==null) return head;
        Node curr = head;
        while(curr!=null){
            if(curr.child==null) curr = curr.next;
            else{
                Node fwd = curr.next;
                Node c = flatten(curr.child);
                curr.child = null;
                curr.next = c;
                c.prev = curr;
                Node temp = c;
                while(temp.next!=null) temp = temp.next;
                temp.next = fwd;
                if(fwd!=null) fwd.prev = temp;      //fwd.prev kanre par nullPointerException aa rhaa hai means it confirm fwd is null and nothing is null.next so, to handle nullPointerException we write if(fwd!=null)
                curr = fwd;
            }
        }
        return head;
    }
}

