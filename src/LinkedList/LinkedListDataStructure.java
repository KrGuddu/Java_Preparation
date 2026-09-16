package LinkedList;

//class Node{ // user defined data type
//    int val;
//    Node next; // null
//    Node(int val){
//        this.val = val;
//    }
//}
class Linkedlist{ // user defined data structure
    Node head; // null
    Node tail; // null;
    int size;

    boolean search(int val){        //when boolean datatype
        if(head == null) return false;
        Node temp = head;
        while(temp != null){
            if(temp.val == val) return true;     //temp.val and val both are different
            temp = temp.next;
        }
        return false;
    }

    //or,
//    int search(int val){            //when integer datatype
//        if(head==null) return -1;
//        Node temp = head;
//        int idx = 0;
//
//        while(temp != null){
//            if(temp.val == val) return idx;     //temp.val and val both are different
//            temp = temp.next;
//            idx++;
//        }
//        return -1;
//    }

    void addAtHead(int val) {
        Node temp = new Node(val);                  //Create a new node which name is temp
        if(head==null) head = tail = temp;          //pahle tail ke under temp store hua then head ke under.
        else{
            temp.next = head;           //temp ko head se connect kiya and head ko temp par le aya (means ab temp head ban gya)
            head = temp;
        }
        size++;
    }

//    void addAtTail(int val){
//        Node temp = new Node(val);
//        if(tail==null) head = tail = temp;
//        else {
//            tail.next = temp;           //tail.next me temp ko attached kiya then temp hi tail ho gya
//            tail = temp;
//        }
//        size++;
//    }

    //or,
    void addAtTail(int val){
        if(tail==null){             //Agr zero size ka linkedlist hai to iska matlab head par add karna hoga, so add karke wahi par kam khatam karo
            addAtHead(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;           //tail.next me temp ko attached kiya then temp hi tail ho gya
        tail = temp;
        size++;
    }

    void deleteAtHead(){
        if(head==null){     //for empty linkedlist
            System.out.println("List Is Empty!");
            return;
        }
        head = head.next;       //delete karne ke liye head ko aage badha dene se new head banta hai and old head delete ho jata hai.
        if(head==null) tail = null;     //for one size linkedlist       //agar head null par chala gya to tail ko v null par le aao. qki head kavi v tail se chhota nhi ho skta hai ya to equal ya bada ho skta hai.
        size--;
    }

    void display() {
        if(head==null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int get(int idx) {
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void insert(int val, int idx) {
        if(idx<0 || idx>size) System.out.println("Invalid Index!");
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp = head;
            for(int i=1;i<=idx-1;i++){          //or i<idx
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;                 //temp ka next, t ka next bana
            temp.next = t;                      //temp ka next t bana
            size++;
        }
    }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index!");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; // delete
        if(idx == size-1) tail = temp; // we are deleting tail
        size--;
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.deleteAtHead();          //Ye empty linkedlist(qki sare list iske baad add ho rhe hai) hai to wo delete nhi ho payegi to ye o/p "List Is Empty!" degi.
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40); ll.display();
        ll.addAtHead(50);
        ll.addAtHead(60); ll.display();
        ll.deleteAtHead(); ll.display();
        System.out.println(ll.size);
        ll.insert(45,2); ll.display();
        System.out.println(ll.get(4));
        ll.delete(3); ll.display();
    }
}



//Kavi v head and tail me se koe ek null nhi ho skta hai ya to dono hi null hoga ya dono ke pass value hogi. jab ek hi node hoga to tab wo ek node hi head v hoga nad tail v hoga.
//LinkedList me multiple node ek node ko point kar skte hai but ek node multiple node ko point nhi kar skte hai. (Means, multiple node ka ek next ho skte hai but ek node ka multiple next nhi ho skte hai.)
//Add karne se size++ hoti hai and delete karne se size-- hoti hai


/*
addAtHead
addAtTail
deleteAtHead
display
search
insert
get
delete
 */