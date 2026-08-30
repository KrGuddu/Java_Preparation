package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {5,9,4,6,2,3,7,8,0,1};
        recPrint(arr, 0);
    }

    public static void recPrint(int[] arr, int idx){
        if(idx == arr.length) return;   //Base case: Agar Array index, array ki length ke equal ho jaye to code ko wahi se terminate kar do otherwise chalate raho [arr[idx] and idx+1].
        System.out.print(arr[idx] + " ");
        recPrint(arr, idx+1);

        //for reverse the array  ==>> //Agar normally kam ke baad call ho rhi hai to call ke baad kam karne par cheeje reverse ho jati hai. So reverse method lagane ke liye ye best hai.
//        if(idx == arr.length) return;
//        recPrint(arr, idx+1);
//        System.out.print(arr[idx] + " ");
    }

}

