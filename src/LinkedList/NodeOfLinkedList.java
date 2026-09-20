//package LinkedList;
//class Node{
//    int val;
//    Node next;           //Default value of any node is null.
//    Node(int val){       //Constructor
//        this.val = val;
//    }
//}
//public class NodeOfLinkedList {
//    public static void main(String[] args) {
//        // 10->20->30->40->50
//        Node a = new Node(10);      // head node     //Without constructor we can write this =>> Node a = new Node(); a.val=10;
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);      //tail node
//
////        System.out.println(a);                 //o/p: Address of a
////        System.out.println(a.val);             //o/p: value of a
////        System.out.println(a.next);            //o/p: null     =>b/q default value of any single node is null.  (qki a.next connect karne se pahle use kar rhe hai to, a ko pata nhi hai ki uska next variable kya hai, aur wo khud ko ek single node mann rha hai and every single node ki tail and head same node par hi hoti hai and tail.next hamesa null ko point karta hai. So iss condition me default value null hoti hai.)
//
//        // Connect karenge (Link karenge)
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = null;              //We can set null of the tail node But, No need b/q every tail node's default address is null.    =>Not required
//
////        System.out.println(a);                            //o/p: address of a
////        System.out.println(a.next);                       //o/p: address of b     //a.next and b is same so o/p is same. So it conform a is linked to b.
////        System.out.println(b);                            //o/p: address of b
////        System.out.println(b.next);                       //o/p: address of c
////        System.out.println(c);                            //o/p: address of c
////        System.out.println(c.next);                       //o/p: address of d
//
//        System.out.println(e.val);                          //o/p: value of e
//        System.out.println(a.next.next.next.val);           //o/p: value of d
//        System.out.println(c);                              //o/p: address of c
//        System.out.println(b.next);                         //o/p: address of c
//        System.out.println(a.next.next);                    //o/p: address of c
//    }
//}
//
//
///* Summary
//1. Declaration of node and it's constructor
//2. Create a node and provide value using constructor function and without constructor function.
//3. Connect a node to another node
//4. How to access a node, values of node, address of node, next of node.
// */