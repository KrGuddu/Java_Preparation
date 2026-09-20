//LC. 141. Linked List Cycle
//Or, https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

package LinkedList;

public class DetectLoop {                                   //Detect cycle and has cycle both are same things.
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){           //When i move fast with 3x then (fast != null && fast.next != null && fast.next.next != null)
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }
}


//Agar fast ya fast.next kavi null tak pahucha hi nhi means koe ayesa node maujud hai jaha se wo loop/cycle bana rha ho. and agr fast slow se 2x se badh rha ho to fast and slow kisi na kisi point par milgega hi milega jaha se loo create ho rha ho, agar ayesa hai to true return karege otherwise false return karege.

//Why fast move with 2x ? why not 3x, 5x ? ==>> mai fast ko 3x ya 5x etc se v badha skte hai to cycle bala code to chal jayega [bass 3x ke liye (fast != null && fast.next != null && fast.next.next != null) karne hoge, similaryly 5x ke liye v]. But jab cycle/loop linked-list na ho to uss condition me kavi condition change karne hoge. isiliye hame fast ko 2x se move karna hi best hota hai.