// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

package BinarySearch;

public class Floor_in_Sorted_Array_gfg {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 8, 10, 10, 12, 19};
//        int x = 5;
//        int lo=0, hi=arr.length-1, idx=-1;
//
//        while(lo<=hi){
//            int mid = (lo+hi)/2;
//            if(arr[mid]>x) hi=mid-1;
//            else{
//                idx=mid;
//                lo=mid+1;
//            }
//        }
//        return idx;
    }
}


/*
Is problem ka core pattern yaad rakho

Floor = largest element <= x

So binary search mein:
arr[mid] <= x
       ↓
   valid answer
       ↓
ans = mid
       ↓
right jao
       ↓
lo = mid + 1

And:
arr[mid] > x
       ↓
too large
       ↓
left jao
       ↓
hi = mid - 1

Ek bahut important rule:
mid = index
arr[mid] = element/value

* */