package LinkedList;
class ListNode{ // user defined data type
    int val;
    ListNode next; // null
    ListNode(int val){
        this.val = val;
    }
}

public class Intersection_Of_Two_LL {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        //Use this to find length of 1st linked-list
        int len1 = 0;
        ListNode temp1 = head1;
        while (temp1 != null) {
            temp1 = temp1.next;
            len1++;
        }

        //for 2nd linkedlist's length
        int len2 = 0;
        ListNode temp2 = head2;
        while (temp2 != null) {
            temp2 = temp2.next;
            len2++;
        }

        temp1 = head1;                                      //∵ dono temp null par chala gya tha to bapas se dono temp ko head par le ayege.
        temp2 = head2;
        if (len1 > len2) {                                  // temp1 ko aage bhejenge
            for (int i = 1; i <= len1 - len2; i++) {        //ex: len1=7, len2=5 then 7-5=2 means i ko 2 se badha diya jisse dono ki length same ho gaye and dono ki temp same index se start hogi jisse dono ek dusre ko ek point par intersect karegi.
                temp1 = temp1.next;
            }
        } else {                                            // temp2 ko aage bhejenge
            for (int i = 1; i <= len2 - len1; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != temp2) {                           //jabtak temp1 and temp2 equal na ho jate hai tab tak dono ko aage badhate raho and jaha par equal ho jaye usi node ko return kar do
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;                                      //chuki, temp1 and temp2 dono ek hi node par hai to temp1 ya temp2 dono me se kisi ko v return kar skte hai.
    }

    public static void main(String[] args) {
//        getIntersectionNode(a,b);
    }
}


/*
When length is difference: sabse pahle dono linked-list ka length nikalege and then dono ka difference nikalege fir jitna difference ayega utne se big linked-list ki node ko age badhayege taki dono linked-list kisi point par ek dusre ko intersect kar sake, and jaha intersect karega uska node return kar denge.
agar question kahe kux ayese node hai jo dono me common hai means dono list ek dusre ko common node par intersect kar rhi hai to uss question ka solution yehi hogi.
 */