package BinarySearch;

public class Last_Occurrence {
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
                lo=mid+1;       // move left if target element is available in left/lower index index
            }
        }
        if (idx != -1)
            System.out.println("Last Occurrence at index: " + idx);
        else
            System.out.println("Element not found");
    }
}
