//Que: Given the head of a singly linked list and an integer k, swap the values of the kth node from the beginning and the kth node from the end of the linked list.
//Means: [Ye Linked List ke kth node from beginning aur kth node from end ke values ko swap karta hai.]
//Note**: Node ko swap karna difficult hai but node ki value krna nhi so In this type of question always swap node value not node.

package LinkedList;

public class LC1721_SwappingNodes {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1; i<=k; i++){        //Initialy fast ko k steps aage le jao
            fast = fast.next;
        }
        while(fast != null){            //Ab dono(slow & fast) ko saath-saath move karo
            slow = slow.next;
            fast = fast.next;
        }
        fast = head;                    //fast ko bapas se head par lao
        for(int i=1; i<=k-1; i++){      //fast ko kth node par le jao       //means, 2-1=1 so fast 1 se age badhega
            fast = fast.next;
        }
        int temp = fast.val;            //Then dono ki value ko swap kar do.
        fast.val = slow.val;
        slow.val = temp;
        return head;
    }
}

/*Solution Tis in one line:
Fast ko k steps ahead karo → dono ko saath chalao → fast null hua → slow milega = kth node from end.

Aur fast = head karne ke baad k-1 steps chalakar kth node from beginning mil jata hai.
 */

/** Ye code Linked List ke kth node from beginning aur kth node from end ke values ko swap karta hai.
Example
 Linked List:  10 → 20 → 30 → 40 → 50 → null
 k = 2

 2nd node from beginning = 20
 2nd node from end = 40

 Swap ke baad: 10 → 40 → 30 → 20 → 50 → null


 1. Initially
 ListNode slow = head;
 ListNode fast = head;

 Dono head par hain:
 10 → 20 → 30 → 40 → 50 → null
 ↑
 slow
 ↑
 fast

 2. fast ko k steps aage le jao
 for(int i=1; i<=k; i++){
 fast = fast.next;
 }

 Yahan k = 2.

 # First iteration: i = 1 then fast = fast.next;
 fast 10 → 20

 10 → 20 → 30 → 40 → 50
 ↑    ↑
 slow fast

 # Second iteration  i = 2 then  fast = fast.next;
 fast 20 → 30

 10 → 20 → 30 → 40 → 50
 ↑         ↑
 slow      fast

 So: slow = 10
     fast = 30

 Important: fast ko exactly k steps aage rakhne ka purpose hai ki baad mein jab fast end par पहुंचे, slow kth node from end par ho.

 3. Ab dono ko saath-saath move karo
 while(fast != null){
 slow = slow.next;
 fast = fast.next;
 }

 Current:
 10 → 20 → 30 → 40 → 50 → null
 ↑         ↑
 slow      fast

 # Round 1
 slow = slow.next;
 fast = fast.next;

 Now:
 10 → 20 → 30 → 40 → 50 → null
 ↑         ↑
 slow      fast

 slow = 20
 fast = 40

 # Round 2
 10 → 20 → 30 → 40 → 50 → null
 ↑         ↑
 slow      fast
 slow = 30
 fast = 50

 # Round 3
 10 → 20 → 30 → 40 → 50 → null
 ↑         ↑
 slow      fast

 slow = 40
 fast = null

 Ab loop stop.
 Therefore: slow = 40

 So, slow 2nd node from end ko point kar raha hai.

 4. Ab fast ko head par wapas lao
 fast = head;

 Ab:
 10 → 20 → 30 → 40 → 50 → null
 ↑              ↑
 fast           slow

 Humein beginning/starting se kth node chahiye.

 k = 2, so humein fast ko 2nd node par le jana hai.

 5. fast ko kth node par le jao
 for(int i=1; i<=k-1; i++){
 fast = fast.next;
 }

 Notice:
 i <= k-1

 For k = 2:
 k - 1 = 1

 So loop sirf 1 baar chalega.

 Iteration
 10 → 20 → 30 → 40 → 50
 ↑              ↑
 fast           slow

 Now:
 fast.val = 20
 slow.val = 40

 6. Values swap karo
 int temp = fast.val;
 fast.val = slow.val;
 slow.val = temp;

 Initially:
 fast.val = 20
 slow.val = 40

 Step 1
 int temp = fast.val;
 temp = 20

 Step 2
 fast.val = slow.val;
 fast.val = 40

 List temporarily:
 10 → 40 → 30 → 40 → 50

 Step 3
 slow.val = temp;
 slow.val = 20

 Final:
 10 → 40 → 30 → 20 → 50 → null
 */