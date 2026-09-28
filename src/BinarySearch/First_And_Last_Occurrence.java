package BinarySearch;

public class First_And_Last_Occurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int k = 5;

        int first = firstOccurrence(arr, k);
        int last = lastOccurrence(arr, k);

        if (first != -1) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        } else {
            System.out.println("Element not found");
        }
    }

    //First Occurrence
    static int firstOccurrence(int[] arr, int k) {
        int lo = 0, hi = arr.length - 1, idx = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < k) lo = mid + 1;
            else if (arr[mid] > k) hi = mid - 1;
            else {
                idx = mid;
                hi = mid - 1; // move left
            }
        }
        return idx;
    }

    //Last Occurrence
    static int lastOccurrence(int[] arr, int k) {
        int lo = 0, hi = arr.length - 1, idx = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < k) lo = mid + 1;
            else if (arr[mid] > k) hi = mid - 1;
            else {
                idx = mid;
                lo = mid + 1; // move right
            }
        }
        return idx;
    }
}


/* Solutions flow:
1. Create a method for firstOccurrence
2. Create a method for lastOccurrence
3. store these in first and last
4. then, apply condition and print/return "First Occurrence and Last Occurrence" and handle "Element not found"
 */