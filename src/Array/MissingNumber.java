//Ques: Missing in Array. or, Missing number in Array
// gfg que: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
// Error: this solution is not good for long datatype so need to convert typecasting  ==>see solution in MissingNumber_gfg

package Array;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int arr[]) {
        int n = arr.length + 1;     // in question given size is n - 1      //Note: agar array ki length 7 hogi to 8 element hoge, matlab 1 add ho jayege.
        int sum = n*(n+1)/2;
        int arrSum = 0;
        for(int ele : arr){
            arrSum += ele;
        }
        return sum - arrSum;
    }
}
