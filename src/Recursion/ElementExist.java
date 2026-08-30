//for linear search
//Q: Search the elements in array or linear array

package Recursion;

public class ElementExist {
    public static void main(String[] args) {
        int[] arr = {5,9,4,6,2,3,7,8,0,1};
        int target = 4;
        System.out.println(exists(arr, target, 0));
    }
    public static boolean exists(int[] arr, int target, int idx){      //why idx: ham avi kis index par hai
        if(idx==arr.length) return false;       //Base case: agar index target ko find karte karte array ki length tak pahuch gaya and target nhi mila to return false.
        if(arr[idx]==target) return true;
        return exists(arr, target, idx+1);
    }
}
