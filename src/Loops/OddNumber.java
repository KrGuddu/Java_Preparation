package Loops;

public class OddNumber {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if (i%2 != 0) System.out.println(i);        //or, i%2==1
        }

        //Or, more Efficient way
        for(int i=1; i<=100; i+=2) System.out.println(i);
    }
}
