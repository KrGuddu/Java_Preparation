// Print all even numbers from 1 to 100
package Loops;

public class EvenNumber {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {      //Solution step1: fetch all numbers from 1 to 100     //step2. then apply even number condition and print it.
            if (i%2 == 0) {                    //for odd number: i%2 != 0
                System.out.println(i);
            }
        }

        //Or, more Efficient way
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
