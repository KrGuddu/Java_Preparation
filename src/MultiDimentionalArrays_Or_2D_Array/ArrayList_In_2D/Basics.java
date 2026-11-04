package MultiDimentionalArrays_Or_2D_Array.ArrayList_In_2D;
import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(4); a.add(6); a.add(0);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(4); b.add(2); b.add(0); b.add(7); b.add(9);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(8); c.add(4); c.add(5); c.add(0);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

//        System.out.println(arr);    //It will give ArrayList


        //for Matrix ArrayList: using for loop  ==>> Huge usages
        for(int i=0; i<arr.size(); i++){                        //Size/length of ArrayList: arr.size()
            for(int j=0; j<arr.get(i).size(); j++){             //Size of ArrayList column: arr.get(i).size()  where i is row number (or, index of row)
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);
        arr.get(arr.size()-1).add(20);


        //using for-each loop
        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}



/* Generally Array aur ArrayList dono mein front/middle par insertion last ke comparison mein inefficient hota hai — especially ArrayList mein.
Simple rule yaad rakho:-
Operation	            ArrayList
Last mein add	        O(1) amortized/Average Time
Front mein add	        O(n)
Middle mein add	        O(n)
Last se remove	        O(1)
Front se remove	        O(n)
Middle se remove	    O(n)

Reason: ArrayList internally contiguous array use karta hai. Front/middle mein insertion/removal ke baad elements ko shift karna padta hai.

Summary: Array or Arraylist me operation last se karte hai taki Time and space complexity acha rhe.
 */


/* if arrList = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}}

Expression	            Meaning	                    Output
arr.size()	            Total number of rows	    3
arr.get(0).size()	    Columns in row 0	        3
arr.get(1).size()	    Columns in row 1	        4
arr.get(2).size()	    Columns in row 2	        2
arr.get(1).get(3)       1st row's 3rd column        7


# 2D Array VS ArrayList of ArrayLists
2D Array	                ArrayList of ArrayLists
1. arr.length	            arr.size()
2. arr[i].length	        arr.get(i).size()
3. arr[i][j]	            arr.get(i).get(j)

Important: arr.get(i).size() gives the size of a particular row, not the total number of columns in every row. This matters when working with a jagged matrix.
 */