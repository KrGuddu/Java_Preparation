package LinkedList;
import java.util.Scanner;

//Object and constructor function is imported from NodeOfLinkedList

public class DisplayList {
    //Use this to display address of a node, value of a node, or any things of a node.
    public static void display(Node head){                               //Node behave like datatype
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;                                           //It behaves like temp++  ==>Connect on node to another node     //VERY IMPORTANT
        }
        System.out.println();

//        for(Node temp = head; temp != null; temp = temp.next){        //Using for loop => Not recommended
//            System.out.print(temp.val + " ");
//        }
//        System.out.println();
    }

    public static void displayRec(Node head){           //Display recursively
        if(head == null) return;                       //Base case means: terminative condition of for loop. Here for loop terminative condition is null so base case is null.      //Note: Recursive code ko kavi v null tak na jane de, null tak ane se pahle hi return kar do.
        System.out.print(head.val + " ");
        displayRec(head.next);

        //to print in reverse =>Need to call first and then print
//        displayRec(head.next);
//        System.out.print(head.val + " ");
    }

    private static int get(Node head, int idx) {
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);                          //Given user i/p in LinkedList
//        Node a = new Node(sc.nextInt());

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        display(a);           //o/p: 10 20 30 40 50
        displayRec(a);
        System.out.println();
        System.out.println(get(a,4));       //To find LinkedList 4th index value.       //a ko head mante hue 4th index ki value print karo.
        System.out.println(get(c,1));       //c ko head mante hue 1st index ki value print karo.

//        Node n = null;                      //Agar koe node null hai to uski value assign nhi kar skte hai, jisse uski na to koe value hogi aur na hi uska koe next variable hoga.
//        n.val = 10;                         //NullPointerException: Cannot assign field "val" because "n" is null
//        System.out.println(n.val);          //NullPointerException: Cannot read field "val" because "n" is null
//        System.out.println(n.next);         //NullPointerException: Cannot read field "next" because "n" is null
    }
}



/* Revision steps
1. display ->main method
2. displayRec   ->main method
3. get ->main method
4. NullPointerException
5. To print in reverse
6. To find LinkedList 4th index value

 Note: Recursive code ko kavi v null tak na jane de, null tak ane se pahle hi return kar do.
 */