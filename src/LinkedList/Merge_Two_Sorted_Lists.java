package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Merge_Two_Sorted_Lists {
    Node sortedMerge(Node head1, Node head2) {
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);                //dummy node me kux value de skte hai, does not matter.
        Node k = dummy;

        while(i != null && j != null){              //Jabtak i and j null tak nhi pahuch jata tabtak loop chalao
            if(i.data <= j.data){                   //Agar i ki data j ki data se kam ya equal hai tab k ki next ko i par le jao, i++ karo, k++ karo.       //In linked-list i++ means: i = i.next; j++ means: j=j.next; k++ means: k=k.next;
                k.next = i;
                i = i.next;
            }
            else{                                   //Otherwise, k ki next ko j par le jao, j++ karo, k++ karo.
                k.next = j;
                j = j.next;
            }
            k = k.next;                             //If i don't want to write here k = k.next; then need to write this under if and else statement.
        }

        if(i==null) k.next=j;                       //Agar i null tak pahuch gya to k ki next ko j se add kar do taki j ki baad sasre list automatic add ho jayege
        else k.next=i;                              //Otherwise, k ki next ko i par le jao
        return dummy.next;                          //Now, dummy ki next ko return kar do.
    }
}
