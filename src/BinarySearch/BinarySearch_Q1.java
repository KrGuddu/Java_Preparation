//Leetcode QN. 704 Binary Search
//Also, this program checking the target element is exist in array or not if exist return 1 otherwise -1.
package BinarySearch;

public class BinarySearch_Q1 {
    public static void main(String[] args) {
        int[] arr = {-76, -4, 9, 28, 47, 49, 510, 615, 9911, 99999};
        int target = 510;

        int n = arr.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;    //To Avoid Overflow(Ye large array me safe hota hai) use mid=lo+(hi-lo)/2;  //Agar interviewer bole: “Return index instead of printing” to ye use kare.
            if(arr[mid]==target){
                System.out.println("Element found at index: " + mid);
                return;     // loop are stop here
            }
            else if(arr[mid]<target) lo = mid + 1;
            else hi = mid - 1;
        }
//        return -1;  //not here, otherwise we trap in infinite loop
        System.out.println("Element not found");
    }
}
