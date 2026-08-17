// https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
// https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1
// Leetcode Binary Search Que. 704  ==>> https://leetcode.com/problems/binary-search/description/

package BinarySearch;

public class First_Occurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int k = 5;   //k means target

        int lo=0, hi=arr.length-1, idx=-1;      //idx=-1 means default value of idx is false. qki index kavi -1 nhi hoti hai

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<k) lo=mid+1;
            else if(arr[mid]>k) hi=mid-1;
            else{   //means, arr[mid]==target
                idx=mid;        // store answer
                hi=mid-1;       // move left if target element is available in left/lower index index
            }
        }
        if (idx != -1)
            System.out.println("First Occurrence at index: " + idx);
        else
            System.out.println("Element not found");
    }
}


/* Binary Search me:
1. Loop sirf search ke liye hota hai
2. Printing loop ke baad hona chahiye otherwise Har iteration me print hoga, Output multiple times aayega (galat behavior), Final correct answer disturb ho jayega

interview Que: "Why not return immediately when found?"
Ans: Kyuki hume first occurrence chahiye, Isliye left side me aur search karna padta(ya pad skta hai) hai

Tips: First Occurrence	hi = mid - 1
      Last Occurrence	lo = mid + 1

*/