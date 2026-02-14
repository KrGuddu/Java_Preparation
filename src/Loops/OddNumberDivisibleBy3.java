//Que: Print all odd numbers divisible by 3 from 1 to 100
package Loops;

public class OddNumberDivisibleBy3 {
    public static void main(String[] args) {
//        for (int i = 3; i <=100 ; i++) {
//            if (i%3==0){
//                System.out.println(i);
//            }
//        }

        // or
        for (int i = 3; i <= 100; i=i+3) {
            System.out.println(i);
        }
    }
}
