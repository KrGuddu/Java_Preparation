// Ques: Two Sum
//Note: return keyword pure function ko khatam krta hai
package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 7;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    found = true;
                    break;
                }
            }
        }

        if (found) System.out.println("Yes");
        else System.out.println("No");
    }
}
