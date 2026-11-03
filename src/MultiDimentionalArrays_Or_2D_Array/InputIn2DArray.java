//Q: Take user input and print 2D Array

package MultiDimentionalArrays_Or_2D_Array;
import java.util.Scanner;

public class InputIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];        //User i/p 3 row and 4 column ki i/p hogi jiski total elements 3*4=12 hogi.     // separate the input using space.

        //Method 1: Input and output together    =>Bad practice
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[0].length; j++){
//                arr[i][j] = sc.nextInt();
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        //Method 2: First input, then output        =>good practice
        for(int i = 0; i < arr.length; i++){        // Input
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){        // Output
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



/*
If arr = 10 20  30  40
         50 60  70  80
         90 100 110 120


Important concepts to remember
Expression	        Meaning	                            Example
i                   Represent Row                       1,2,3       => arr[0] is 1st row
j                   Represent Column                    1,2,3,4     => arr[0][0] is 1st row's 1st column
arr.length	        Total rows	                        3
arr[0].length	    First row columns	                4
arr[i].length	    Current row's columns	            4
arr[i][j]	        Element at row i, column j	        arr[1][2] = 70
new int[3][4]	    3 rows, 4 columns	                12 elements

arr[i][j] → Current element access karta hai.

Time and Space Complexity
- Time Complexity: O(rows × columns) = O(3 × 4) = O(12) → General form O(r × c).
- Space Complexity: O(r × c) for storing the array.
 */