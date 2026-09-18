////"Slow and fast approach" or "Tortoise and Hare Algorithm" or "Floyd's Cycle Detection Algorithm".
//
//package LinkedList;
//
////class Node {
////    int data;
////    Node next;
////
////    Node(int x) {
////        data = x;
////        next = null;
////    }
////}
//public class Middle_of_LinkedList {
//    int getMiddle(Node head) {
//        //1st mehod: Not ONE PASS solution  =>Not recommended
//        // int length = 0;
//        // Node temp = head;
//
//        // while(temp!= null){         //used to find length of linked list
//        //     temp = temp.next;
//        //     length++;
//        // }
//
//        // temp = head;        //while loop se temp null/last par chala gya tha jisko baas se head par le aya.
//
//        // for(int i=1; i<=length/2; i++){    //use to find middle element
//        //     temp = temp.next;           // i to middle element tak travel kiya and temp ko middle element tak le gya.
//        // }
//        // return temp.data;           //and now, middle element ki value/data ko return kar diya.
//
//
//        //2nd method: "Slow and fast approach" or "Tortoise and Hare Algorithm" or "Floyd's Cycle Detection Algorithm".
//        Node slow = head;
//        Node fast = head;
//        while(fast != null && fast.next !=null){        // (fast.next !=null && fast != null) ye nhi kar skta hu qki agar 1st condition true ho gayi to 2nd check kiye bina hi loop break ho jayega. Error: NullPointerException qki null ka koe next nhi hota hai.
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow.data;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
