package LinkedList;
import java.util.Scanner;

//Object and constructor function is imported from NodeOfLinkedList

public class DisplayList {
    public static void displayRec(Node head){           //Display recursivelly
        if(head == null) return;        //Base case means: terminative condition of for loop. Here for loop terminative condition is null so base case is null.
        System.out.print(head.val + " ");
        displayRec(head.next);
    }
    public static void display(Node head){                               //Node behave like datatype
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;                                           //It behaves like temp++     //VERY IMPORTANT
        }
        System.out.println();

//        for(Node temp = head; temp != null; temp = temp.next){        //Using for loo => Not recommended
//            System.out.print(temp.val + " ");
//        }
//        System.out.println();
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

//        display(a);
        displayRec(a);


//        Node n = null;
//        n.val = 10;                         //NullPointerException: Cannot assign field "val" because "n" is null
//        System.out.println(n.val);          //NullPointerException: Cannot read field "val" because "n" is null
//        System.out.println(n.next);         //NullPointerException: Cannot read field "next" because "n" is null
    }
}

/* Revision steps
1. main method
2. display
3. displayRec
4. NullPointerException


 Note: Recursive code ko kavi v null tak na jane de, null tak ane se pahle hi return kar do.
 */