//Que: maximum element in given 2D array.

package MultiDimentionalArrays_Or_2D_Array;

public class MaxElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {2,3,0}, {0,5,9}};

        int maxEle = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > maxEle) maxEle = arr[i][j];
            }
        }
        System.out.println(maxEle);


//        int minEle = Integer.MAX_VALUE;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                if(arr[i][j] < minEle) minEle = arr[i][j];
//            }
//        }
//        System.out.println(minEle);
    }
}


/*
Time and Space Complexity
Complexity	            Value	        Reason
Time	                O(r × c)	    Every element is visited once
Auxiliary Space	        O(1)	        Only one extra variable maxEle
Input Array Space	    O(r × c)	    Array storage

Note: Auxiliary Space O(1) hai, kyunki existing array ke alawa constant extra memory use ho rahi hai.
 */