// Another approach of slow & fast approach

package LinkedList;

public class Kth_from_End_of_LinkedList {
//    public int getKthFromLast(Node head, int k) {
//        Node slow = head;
//        Node fast = head;
//        // fast ko k steps aage le jao
//        for(int i=1; i<=k; i++){
//            if(fast==null) return -1;       //Base case: agar fast null se v bahar nikal jaye, means k>linkedlist.length.
//            fast = fast.next;
//        }
//        while(fast!=null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow.data;
//    }
}


/* Dry Run:
Step1. Initially:
slow
 ↓
10 → 20 → 30 → 40 → 50 → null
 ↑
fast

Step 2: fast ko k steps aage le jaana, k = 2        [means, i<=2 tak chalao]
First iteration: i = 1      Execute: [fast = fast.next;] in for loop
slow
 ↓
10 → 20 → 30 → 40 → 50
     ↑
    fast

Second iteration: i = 2     Execute: [fast = fast.next;] in for loop
slow
 ↓
10 → 20 → 30 → 40 → 50
          ↑
         fast


Notice: fast is 2 nodes ahead of slow

Step 3: Now both move 1 step            [in while loop]
First iteration: Both move 1 step:
10 → 20 → 30 → 40 → 50 → null
     ↑         ↑
    slow      fast

Second iteration: Again both move 1:
10 → 20 → 30 → 40 → 50 → null
          ↑         ↑
         slow      fast

Third iteration: Again:
10 → 20 → 30 → 40 → 50 → null
               ↑         ↑
              slow      fast

∵ fast null tak pahuch gya hai to Loop stops ho jayege.
Then: return slow.data;
returns: 40
 */