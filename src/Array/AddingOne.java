//Que: Adding One
//gfg: https://www.geeksforgeeks.org/problems/adding-one2529/1

package Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8};
        Vector<Integer> result = addOne(arr);       // qki method(which name addOne) ka return type vector hai so resultant array ko vector me store krna hoga and iska name kux v like result de diya. aur jab main method me aa gya to usse directly call/print kar skte hai.
                                                    // Arraylist ke liye v same hi rhega koe changes nhi hoge. like: ArrayList<Integer> result = addOne(arr);
        System.out.println(result);
    }
    static Vector<Integer> addOne(int[] arr) {
        Vector<Integer> ans = new Vector<>();
        int  n = arr.length;
        int carry = 1;          //carry means hath me matlab 9+1=10 so unit digit 0 and hath me 1. 8+1=9 so unit digit 9 and hath me 0 hoge.
        for(int i=n-1; i>=0; i--){
            if(arr[i] + carry <= 9){    // assume arr[i]=8 so arr[i]+carry=9. so unit digit written as it is and carry become 0.
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry == 1) ans.add(1);      // Agar galti se v carry me 1 rah gya hai to ans me 1 add kar do. Ye 999 jaise numbers ke liye hai.
        Collections.reverse(ans);
        return ans;

    }
}
