package BinarySearch;

public class Peak_Index_In_Mountain_Array {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 1, hi = arr.length - 2;
        while (lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;              //Agar mid apne aaju/left and baju/right dono se bada/big hai to mid hi peak index honge so mid ko return kar denge.
            else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) lo = mid +1;       //Agr aaju se bada but baju se chota hai to right jayege.
            else hi = mid -1;                                                           //Agr aaju se chota but baju se bada hai to left jayege.
        }
        return 255664;    //In this type of questions should to return any value. Ex: 255664
    }
}
