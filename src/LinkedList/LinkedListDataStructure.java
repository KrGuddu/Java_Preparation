package LinkedList;

import java.util.ArrayList;

//class Node{ // user defined data type
//    int val;
//    Node next; // null
//    Node(int val){
//        this.val = val;
//    }
//}
class Linkedlist{ // user defined data structure
    Node head; // null
    Node tail; // null
    int size;

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

    //------------------------- Search in Singly linked list ---------------------
    //Singly linked-list search     //It use to check if given search value is available in linked-list or not. if yes then return/print true otherwise return false. Ex: ll=10 → 20 → 30 → 40 → null;  if search value=30 then it return true. if 50 then it return false.
    boolean search(int val){                        //when boolean datatype
        if(head == null) return false;              //Base case: for empty list
        Node temp = head;
        while(temp != null){
            if(temp.val == val) return true;        //If temp-value is same as searchable value then return true. (Means, if found then return true)  //temp.val and val both are different
            temp = temp.next;                       //If not found then go to next node.
        }
        return false;                               //When i travel in hole list but not found and get null then return false.
    }                                               //Isme jaha par condition true hogi loop wahi terminate ho jayega, aage check hi nhi karega.

    //or,       //Que: Search a value and return the index of its first occurrence. If not found, return -1.
//    int searchFirst(int val){            //when integer datatype
//        if(head==null) return -1;
//        Node temp = head;
//        int idx = 0;
//
//        while(temp != null){
//            if(temp.val == val) return idx;     //temp.val and val both are different
//            temp = temp.next;
//            idx++;                                  //Here, idx always represents the index of the node currently pointed to by temp.
//        }
//        return -1;
//    }

    //For Last occurrence: For this, don't return immediately when you find the value. Instead, keep updating a variable like lastIdx.
    int searchLast(int val) {
        if (head == null) return -1;

        Node temp = head;
        int idx = 0;
        int lastIdx = -1;

        while (temp != null) {
            if (temp.val == val) {
                lastIdx = idx;
            }
            temp = temp.next;
            idx++;
        }
        return lastIdx;
    }

    /* Ex: For: 10 → 20 → 30 → 70 → 20 → 80 → 20 → null         searchLast(20);
    Dry run:
    idx = 0 → 10 → no
    idx = 1 → 20 → lastIdx = 1
    idx = 2 → 30 → no
    idx = 3 → 70 → no
    idx = 4 → 20 → lastIdx = 4
    idx = 5 → 80 → no
    idx = 6 → 20 → lastIdx = 6

    Final: lastIdx = 6
    So: searchLast(20) → 6
     */

    /* Key difference
    First occurrence: if (temp.val == val) return idx;          Immediately return → first occurrence.
    Last occurrence:if (temp.val == val) { lastIdx = idx; }     Keep searching → last occurrence.
     */


    //To find All indexes where the value occurs        //10 → 20 → 30 → 70 → 20 → 80 → 20      searchAll(20);      o/p: [1, 4, 6]
    ArrayList<Integer> searchAll(int val) {
        ArrayList<Integer> indexes = new ArrayList<>();

        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.val == val) {
                indexes.add(idx);
            }
            temp = temp.next;
            idx++;
        }
        return indexes;
    }

    /* Why return can't be used here?
    Suppose you write: if (temp.val == val) return idx;
    When the first 20 is found: 10 → 20 → 30 → 70 → 20 → 80 → 20
                                     ↑
                                    idx 1
    return 1 immediately ends the method.
    So the program never gets a chance to find index 4 and 6.
    That's why for all occurrences we do: indexes.add(idx); instead of: return idx;
     */

    /* Easy way to remember
    Requirement	                What to do                                      logics
    1. First occurrence	        return idx immediately                          if (temp.val == val) return idx;
    2. Last occurrence	        Store/update lastIdx                            if (temp.val == val) lastIdx = idx;
    3. All occurrences	        Store every matching idx in ArrayList           if (temp.val == val) indexes.add(idx);
     */
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

        ll.search(30); ll.display();
//        ll.searchFirst(30); ll.display();
//        ll.searchLast(30); ll.display();
//        ll.searchAll(30); ll.display();

    }
}



//For single node: Kavi v head and tail me se koe ek null nhi ho skta hai ya to dono hi null hoga ya dono ke pass value hogi. jab ek hi node hoga to tab wo ek node hi head v hoga nad tail v hoga.
//LinkedList me multiple node ek node ko point kar skte hai but ek node multiple node ko point nhi kar skte hai. (Means, multiple node ka ek next ho skte hai but ek node ka multiple next nhi ho skte hai.)
//Add karne se size++ hoti hai and delete karne se size-- hoti hai



/*
addAtHead
addAtTail
deleteAtHead
display
insert
get
delete
search
 */