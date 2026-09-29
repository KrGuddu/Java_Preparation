//We can also create stack data structure using Linked-list
//Why linked-list? 1:27:00

package Stacks;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;
    int peek() throws Exception{
        if(head==null){
            throw new Exception("Stack Underflow Error");
        }
        return head.val;
    }
    int pop() throws Exception{ // deleteAtHead
        if(head==null){
            throw new Exception("Stack Underflow Error");
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }
    void push(int ele){ // addAtHead
        Node temp = new Node(ele);
        if(len==0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}


public class LL_Implementation_Of_Stack {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
//        st.pop();           //Stack Underflow Error
        st.push(10); st.push(20); st.push(30); st.push(40);
        st.display();

        System.out.println("===============");
        st.pop();
        st.display();
    }
}
