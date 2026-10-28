package Array;

public class ReverseInGroups {
    //It will give ArrayIndexOutOfBoundsException
    // public void reverseInGroups(int[] arr, int k) {
    //     int i=0, j=k-1;

    //     while(i<j){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }

    //     i=k; j=arr.length-1;     //or, int m=k, n=arr.length-1;
    //      while(i<j){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }
    // }

    //TC: O(n), har element maximum ek baar swap hota hai;  AS: O(1)
    public void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        for (int start = 0; start < n; start += k) {
            int i = start;
            int j = Math.min(start + k - 1, n - 1);

            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
    }
}


/* Dry run
Input: arr = [1, 2, 3, 4, 5, 6, 7, 8, 9], k = 3

Group	i	j	Result
1st	    0	2	[3, 2, 1, 4, 5, 6, 7, 8, 9]
2nd	    3	5	[3, 2, 1, 6, 5, 4, 7, 8, 9]
3rd	    6	8	[3, 2, 1, 6, 5, 4, 9, 8, 7]

Math.min(start + k - 1, n - 1) last group ka ending index array ki limit ke andar rakhta hai.

Revision trick: start += k se next group par jao, i = start se group ka beginning set karo, aur j = Math.min(start + k - 1, n - 1) se group ka ending index nikalo.
*/

