//Ques: Two Sum. i.e. sum of any two elements of array is equal to any 3rd elements or equal to any given number.
//Best practice
package Array;

public class TwoSum_2nd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 7;

        System.out.println(twosum(arr, target));
    }

    public static boolean twosum(int[] arr, int target){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
