package Sorting.SelectionSort;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {3,1,2,1,1,4,5,5};
        int[] b = {6,1,1,4,4,2,8};

        int i=0, j=0;
        Arrays.sort(a);     // mlogm
        Arrays.sort(b);     // nlogn
        ArrayList<Integer> ans = new ArrayList<>();

        while(i<a.length && j<b.length){    //m+n
            if(a[i]==b[j]){
                ans.add(a[i]);    //or, use b[j] b/q of a[i]=b[j]
                i++;
                j++;
            }
            else if(a[i]<b[j]) i++;
            else j++;
        }
        System.out.println(ans);        //ans: [1,1,2,4]

//        while(i < a.length && j < b.length){
//            if(a[i] == b[j]){
//                // avoid duplicates   //ans: [1,2,4]
//                if(ans.isEmpty() || ans.get(ans.size()-1) != a[i]){
//                    ans.add(a[i]);
//                }
//                i++;
//                j++;
//            }
//            else if(a[i] < b[j]) i++;
//            else j++;
//        }

    }
}

//Note: Time complexity is: mlogm + nlogn +m+n => nlogn      : jo big hoga whi t.c.
//So, T.C. is O(nlogn), Space comlexity is O(n)