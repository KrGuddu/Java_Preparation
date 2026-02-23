/* for long datatype. i.e:
Constraints:
        1 ≤ arr.size() ≤ 10^6
        1 ≤ arr[i] ≤ arr.size() + 1
*/
package Array;
public class MissingNumber_gfg {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int arr[]) {
        long n = arr.length + 1;
        long sum = n*(n+1)/2;
        long arrSum = 0;
        for(int ele : arr){
            arrSum += ele;
        }
        return (int)(sum - arrSum);
    }
}
