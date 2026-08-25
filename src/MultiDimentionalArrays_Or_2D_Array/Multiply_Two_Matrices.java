package MultiDimentionalArrays_Or_2D_Array;
import java.util.ArrayList;

public class Multiply_Two_Matrices {
    public static void main(String[] args) {

    }

    public ArrayList<ArrayList<Integer>> multiplyMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int[][] c = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        // return c;       //for integer return type


        //Converting int[][] to ArrayList<ArrayList<Integer>>
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(new ArrayList<>());
            for(int j=0; j<n; j++){
                ans.get(i).add(c[i][j]);
            }                                   //This is good approach

            //or => //This is best approach
//             ArrayList<Integer> row = new ArrayList<>();
//             for (int j = 0; j < n; j++) {
//                 row.add(c[i][j]);
//             }
//             ans.add(row);
        }
        return ans;


        //Directly: Not good Readability        ==> [for videos help: 3:40:00]
//         int n = a.length;
//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//
//         for(int i=0; i<n; i++){
//             ans.add(new ArrayList<>());
//             for(int j=0; j<n; j++){
//                 int sum = 0;
//                 for(int k=0; k<n; k++){
//                     sum += (a[i][k] * b[k][j]);
//                 }
//                 ans.get(i).add(sum);             //ans.get(i) is not an element it is an ArrayList.
//             }
//         }
//         return ans;
    }
}




// Time Complexity: O(n²)
// Space Complexity: O(n²)


/* In 2nd Approach: Conceptually second wala exactly ye karta hai:
Create a row
     ↓
Fill the row
     ↓
Add completed row to answer
     ↓
Create next row


Below is the natural structure of 2D ArrayList:
ans
 ├── row 0 → [1, 2, 3]
 ├── row 1 → [4, 5, 6]
 └── row 2 → [7, 8, 9]
*/