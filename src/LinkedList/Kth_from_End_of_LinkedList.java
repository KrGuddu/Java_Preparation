//// Another approach of slow & fast approach
//
//package LinkedList;
//
//public class Kth_from_End_of_LinkedList {
//    public int getKthFromLast(Node head, int k) {
//        Node slow = head;
//        Node fast = head;
//        // fast ko k steps aage le jao
//        for(int i=1;i<=k;i++){
//            if(fast==null) return -1;       //Base case: agar fast null se v bahar nikal jaye, means if k>linkedlist.length.
//            fast = fast.next;
//        }
//        while(fast!=null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow.data;
//    }
//}
