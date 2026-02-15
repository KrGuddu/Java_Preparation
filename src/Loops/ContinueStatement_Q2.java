package Loops;

public class ContinueStatement_Q2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            if (i==13) continue;    //continue skip the iteration of 13
            System.out.println("Good Morning");
        }
    }
}
