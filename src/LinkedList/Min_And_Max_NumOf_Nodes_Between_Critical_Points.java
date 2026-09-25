package LinkedList;
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Min_And_Max_NumOf_Nodes_Between_Critical_Points {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        int idx = 1, firstIdx = -1, lastIdx = -1, minDist = Integer.MAX_VALUE;          //Initially b ko 1st index par rkhe hai so idx=1;       //Agar value -1 hai to index exist hi nhi karta hai means it return false.
        ListNode a = head;
        ListNode b = a.next;
        ListNode c = b.next;
        if(c==null) return ans; // 2 size ki LL

        while(c!=null){
            // check for critical point
            if((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val)){
                if(firstIdx==-1) firstIdx = idx;
                if(lastIdx!=-1){
                    int dist = idx - lastIdx;
                    minDist = Math.min(dist,minDist);
                }
                lastIdx = idx;      //current index ko lastIdx banaya
            }
            idx++;
            a = a.next;
            b = b.next;
            c = c.next;
        }
        int maxDist = lastIdx - firstIdx;
        if(maxDist==0) maxDist = -1;
        if(minDist==Integer.MAX_VALUE) minDist = -1;
        ans[0] = minDist;
        ans[1] = maxDist;
        return ans;
    }
}


/*
This is a singly ll.

one pass means:
local minima means:
local maxima means:
minDistance means:
maxDistance means:

Note: 0th and last node kavi v local min or max nhi ho skta hai.
consecutive nodes: It refer to nodes in a linked list or tree that are directly connected to each other without any other nodes in between.

 */