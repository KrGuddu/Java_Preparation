//Ques: Print the table of 19
package Loops;

public class Table17 {
    public static void main(String[] args) {
        // Not recommended b/q loop 154 [170-17+1 (b/q 17 is inclusive)] times chalega.     // isme loop 171 par break hogi.
//        for (int i = 17; i <= 170; i++) {
//            if (i%17 == 0){
//                System.out.println(i);
//            }
//        }

        //Or, more Efficient way =>b/q ye loop only 10 times chalega/Iteration.   //isme loop 187 [b/q last time 170 par chalega phir increament hokar 170+17=187 par condition false hogi] par break hogi.
//        for (int i=17; i<=170; i=i+17){
//            System.out.println(i);
//        }
        //or
        for (int i=1; i<=10; i=i+1){         // Not write i++ here
            System.out.println(i*17);
        }
    }
}
