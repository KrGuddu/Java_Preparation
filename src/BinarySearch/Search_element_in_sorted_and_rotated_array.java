package BinarySearch;

public class Search_element_in_sorted_and_rotated_array {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int tar = 3;

        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == tar) {
                ans = mid;
                break;
            }
            else if (arr[lo] <= arr[mid]) {    // lo to mid is sorted
                if (arr[lo] <= tar && tar < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            else {    // mid to hi is sorted
                if (arr[mid] < tar && tar <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        System.out.println("Target index: " + ans);
    }
}