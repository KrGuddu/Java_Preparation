// Ques: Two Sum / Pair Sum (i.e. sum of any two array elements is equal to taget.)
//Note: return keyword pure function ko khatam krta hai (return function/method ki execution ko immediately terminate karta hai aur control caller ko return karta hai. return ke baad us method ka remaining code execute nahi hota.)
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
