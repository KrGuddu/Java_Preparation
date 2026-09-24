package LinkedList;
import java.util.List;

public class Merge_K_Sorted_LL {
    //1st method
    //For Array
    Node mergeKLists(Node[] arr) {
        if (arr == null || arr.length == 0) return null;
        Node result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = merge(result, arr[i]);
        }
        return result;
    }

    //for ArrayList
//    Node mergeKLists(List<Node> arr) {
//        while(arr.size()>1){
//            Node a = arr.get(arr.size()-1);
//            arr.remove(arr.size()-1);
//            Node b = arr.get(arr.size()-1);
//            arr.remove(arr.size()-1);
//            Node c = merge(a,b);
//            arr.add(c);
//        }
//        return arr.get(0);
//    }

    Node merge(Node head1, Node head2) {
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node k = dummy;
        while(i!=null && j!=null){
            if(i.data <= j.data){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null) k.next = j;
        else k.next = i;
        return dummy.next;
    }

    //2nd method: Timestamp = 3:04:00

    public static void main(String[] args) {

    }
}

/* In ArrayList method: Dry run
If ArrayList = [k1, k2, k3, k4]

merge k4 + k3 → c
[k1, k2, c]

merge c + k2 → c
[k1, c]

merge c + k1 → c
[c]
 */

/*
Generally Array aur ArrayList dono mein front/middle par insertion last ke comparison mein inefficient hota hai — especially ArrayList mein.
Reason: ArrayList internally contiguous array use karta hai. Front/middle mein insertion/removal ke baad elements ko shift karna padta hai.

Isi wajah se current code mein:
arr.remove(arr.size() - 1);
arr.add(c);

Jo ki achha hai, kyunki dono operations end par ho rahe hain.
Summary: Array or Arraylist me operation last se karte hai taki Time and space complexity acha rhe.
 */

//one based indexing means: if a =1 so it talking about 1st element(means 0th index), a=8 means 8th element(means 7th index).