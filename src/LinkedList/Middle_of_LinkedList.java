////"Slow and fast approach" or "Tortoise and Hare Algorithm" or "Floyd's Cycle Detection Algorithm".
//
//package LinkedList;
//
//class Node{
//    int data;
//    Node next;
//    Node(int val){
//        this.data = val;
//    }
//}
//public class Middle_of_LinkedList {
//    public static int getMiddle(Node head) {
//        //1st mehod: Not ONE PASS solution  =>Not recommended
////         int length = 0;
////         Node temp = head;
////
////        // Find length of linked list
////         while(temp!= null){
////             temp = temp.next;
////             length++;
////         }
////
////        // Move to middle
////         temp = head;        //length find karne ke liye temp null/last par chala gya tha jisko bapas se head par le aya.
////
////         for(int i=1; i<=length/2; i++){    //use to find middle element
////             temp = temp.next;           // i to middle element tak travel kiya and temp ko middle element tak le gya.
////         }
////         return temp.data;           //and now, middle element ki value/data ko return kar diya.
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
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//
//        System.out.println(getMiddle(a));
//    }
//}
//
///* Note: (fast != null) rahte hue (fast.next !=null) que? ==> Fast khud bhi exist karta ho And fast ka next node bhi exist karta ho, tabhi fast.next.next hoga. qki agar fast ka next null hua to fast.next.next means null.next ho jayegi and chuki null ka koe next nhi hota hai to NullPointerException error de dega.
//Solution Method1
//Step 1. Find length of linked list
//Step 2. Move to middle and find temp.data or value (keep temp at head)
//
//Method2
//1. slow and fast dono ko head par rkhege
//2. Check karege fast and fast.next node dono ek sath exist hai ya nhi
//   Agar hai to slow ko ek se age badhao, and fast ko 2 se age badhao. jisse falst null tak chala jayega and slow middle node tak hi pahuch pahega.
//3. so, then return middle node or it's data.
// */