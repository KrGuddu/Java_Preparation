//Q: Snake print column wise

package MultiDimentionalArrays_Or_2D_Array;

public class SnakePattern_Column_Wise {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,5}, {4,5,6,2}, {7,8,9,3}, {6,5,9,0}, {8,2,0,3}};
        for(int j=0; j<arr[0].length; j++){
            if(j%2 == 0){
                for(int i=0; i<arr.length; i++){            //arr[i].length or arr[0].length que nhi: qki 2D matrix me column traversal row ke under ke element par hoti hai and mai outer loop se row ke under aa chuka hu to ham automatically current row ki har column par traverse kar rha hu so we write here [arr.length], not arr[0].length or arr[i].length.   //Also, we can write arr[0].length or arr[i].length only when matrix is Rectangular.
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for(int i= arr.length-1; i>=0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}


/*
1 2 3 5
4 5 6 2
7 8 9 3
6 5 9 0
8 2 0 3

   ↓

1 2 3 3
4 5 6 0
7 8 9 3
6 5 9 2
8 2 0 5

   ↓

Array me ayesa dikhta hai: 1 4 7 6 8 2 5 8 5 2 3 6 9 9 0 3 0 3 2 5

Final o/p:
1 4 7 6 8
2 5 8 5 2
3 6 9 9 0
3 0 3 2 5



or, easy to understand:
Column 0 ↓
1 → 4 → 7 → 6 → 8

Column 1 ↑
2 → 5 → 8 → 5 → 2

Column 2 ↓
3 → 6 → 9 → 9 → 0

Column 3 ↑
3 → 0 → 3 → 2 → 5


Final o/p:
1 4 7 6 8
2 5 8 5 2
3 6 9 9 0
3 0 3 2 5

 */