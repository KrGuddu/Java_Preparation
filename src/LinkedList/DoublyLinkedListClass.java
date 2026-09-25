package LinkedList;
class ListNode{ // user defined data type
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(size==0){        //head==null and size==0 dono se kam ban jayega
            System.out.println("List is Empty!");
            return;
        }
        if(size==1) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteAtTail(){
        if(size==0){
            System.out.println("List is Empty!");
            return;
        }
        if(size==1) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    void insert(int idx, int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index!");
            return;
        }
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        ListNode a = new ListNode(val);
        ListNode temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        a.prev = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.prev = a;
        size++;

        //or, 2nd method
//        ListNode b= temp.next;
//        temp.next = a;
//        a.prev = temp;
//        a.next = b;
//        b.prev=a;
    }
}
public class DoublyLinkedListClass {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.display();                 //o/p: 30,20,10 =>rever me isliye aa rha hai qki ham head par add kar rhe hai: 1st node me 10 then 20 ad at head then 30 add at head
        list.insertAtTail(40);
        list.display();
        // list.displayReverse();
        list.deleteAtHead();
        list.deleteAtTail();
        list.display();
    }
}


//H.w.: Delete at a particular index.  =>5:19:59
//Disadvantage of dll: taking more space



/*
========================= dll notes ===========

data members
methods

addAthead(val)
2case: ll hai but koe khali nhi hai                 Note: bydefalut previous is null
1st case
1. create a node
2. temp.next=head;
3. head.prev=temp
2nd case: head and tail is null (empty ll)


addAttail(val)
1st case: steps
1. create a node with value like temp
2. tail.next=temp;
3. temp.prev=tail
4. tail=tail.next; or tail=temp;        //tail ko tem par le aya
2nd case: head and tail is null (empty ll)


deleteAtHead()          ==> 3case:
1st case: Also written in notes
2nd case: if list is empty then trough an error like: "List is empty! so can't delete"
3rd case: if length is one (one node ll) then, if(size==1) head=tail=null;


deleteAtTail()          ==> 3case:
1st case: Also written in notes
2nd case: if list is empty then trough an error like: "List is empty! so can't delete"
3rd case: if length is one (one node ll) then, if(size==1) head=tail=null;

 */