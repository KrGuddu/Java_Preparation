package MultiDimentionalArrays_Or_2D_Array;

public class Elements_SubQue {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {2,3,0}, {0,5,9}};
//        int minEle = Integer.MAX_VALUE;

        //1. Minimum Element in 2D Array       [Logic: Maximum element wale question jaisa hi logic hai. Bas > ki jagah < use karna hai.]      [Complexity: Time O(r × c), Auxiliary Space O(1).]
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                if(arr[i][j] < minEle) minEle = arr[i][j];
//            }
//        }
//        System.out.println(minEle);

        //2. Maximum Element in Each Row    [Logic: Har row ka maximum element find karna hai.]     [Complexity: Time O(r × c), Auxiliary Space O(1).]
        // Important: maxEle ko outer loop ke andar initialize karenge, kyunki har row ke liye maximum alag find karna hai.
        //Note: Agar maxEle ko outer loop ke bahar initialize karoge, toh previous row ka maximum next row mein bhi carry forward ho jayega. Isse answer galat aa sakta hai.
//        for(int i = 0; i < arr.length; i++){
//            int maxEle = Integer.MIN_VALUE;         // Reset for every row
//            for(int j = 0; j < arr[i].length; j++){
//                if(arr[i][j] > maxEle) maxEle = arr[i][j];
//            }
//            System.out.println("Row " + i + " Max: " + maxEle);
//        }

        //3. Minimum Element in Each Column     [Logic: Is question mein outer loop columns ko control karega aur inner loop rows ko.]      [Complexity: Time O(r × c), Auxiliary Space O(1).]   =>Doubt in o/p
        //Yahan loop ka order change hoga.
//        for(int j = 0; j < arr[0].length; j++){
//            int minEle = Integer.MAX_VALUE;
//            for(int i = 0; i < arr.length; i++){
//                if(arr[i][j] < minEle) minEle = arr[i][j];
//            }
//            System.out.println("Column " + j + " Min: " + minEle);
//        }


        //4. Find the Row Containing Maximum Sum      [Logic: Har row ke elements ka sum calculate karna hai. Phir jis row ka sum maximum hoga, uska index print karna hai.]    [Complexity: Time O(r × c), Auxiliary Space O(1).]
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) sum += arr[i][j];
            if(sum > maxSum){
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println("Maximum Sum: " + maxSum);
        System.out.println("Row Index: " + maxRow);

        /* Important concepts:
            - sum = 0 → Har row ka sum separately calculate karna hai.
            - maxSum → Ab tak ka maximum sum store karta hai.
            - maxRow → Maximum sum wali row ka index store karta hai.
            - maxRow = i → Current row maximum sum wali row ban gayi.
         */

        //5. Find the Column Containing Maximum Sum     [Logic: Har column ke elements ka sum calculate karna hai. Phir maximum sum wale column ka index print karna hai.]      [Complexity: Time O(r × c), Auxiliary Space O(1).]
//        int maxSum = Integer.MIN_VALUE;
//        int maxCol = -1;
//
//        for(int j = 0; j < arr[0].length; j++){
//            int sum = 0;
//            for(int i = 0; i < arr.length; i++) sum += arr[i][j];
//            if(sum > maxSum){
//                maxSum = sum;
//                maxCol = j;
//            }
//        }
//        System.out.println("Maximum Sum: " + maxSum);
//        System.out.println("Column Index: " + maxCol);
    }
}


/*
All 5 Questions: Important Loop Patterns
Ye table apne DSA notebook mein zaroor likhna.

Question	                    Outer loop	    Inner loop	    Variable initialization
Minimum in 2D	                Row i	        Column j	    Before both loops
Maximum in each row	            Row i	        Column j	    Inside outer loop
Minimum in each column	        Column j	    Row i	        Inside outer loop
Row with maximum sum	        Row i	        Column j	    sum inside outer loop
Column with maximum sum	        Column j	    Row i	        sum inside outer loop

Note: Row-wise vs Column-wise Traversal Visualization  => See in image

# Practice Questions (Test Yourself)
Ab in concepts ko apply karne ke liye ye 3 questions try karo:
1. Find the maximum element in each column.
2. Find the row containing the minimum sum.
3. Find the column containing the minimum sum.

Meri recommendation: In 5 solutions ko samajhne ke baad bina code dekhe dobara likho. Especially maxEle, minEle, sum ko kahan initialize karna hai, ye concept clear hona chahiye.
 */