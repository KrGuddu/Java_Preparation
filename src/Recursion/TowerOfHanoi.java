package Recursion;
import java.util.Scanner;

public class TowerOfHanoi {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        hanoi(n, 'A', 'B', 'C');
//    }
//
//    private static void hanoi(int n, char a, char b, char c) {          //n: number of disks, a: source, b: helper, c: destination
//        if(n==0) return;                  //Base case
//        hanoi(n-1, a, c, b);              // n-1 disks from A to B via C
//        System.out.println(a+ "->" + c);    // largest from A to C
//        hanoi(n-1, b, a, c);               // n-1 disks from B to C via A
//    }


    //or
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 'A', 'B', 'C');
    }

    private static void hanoi(int n, char src, char hpr, char dest) {          //n: number of disks, src: source, hpr: helper, dest: destination
        if(n==0) return;                              //Base case
        hanoi(n-1, src, dest, hpr);               // n-1 disks from A to B via C
        System.out.println(src+ "->" + dest);       // largest from A to C
        hanoi(n-1, hpr, src, dest);             // n-1 disks from B to C via A
    }
}



/* To find minimum moves in Tower of Hanoi
Minimum Moves: 2^n -1
Eg: 3 => 2^3 -1 => 8-1 =>7
    5 => 2^5 -1 => 32-1 =>31

 */