//Ques: Print the second Maximum element in the array

package Array;
public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {5,10,10,9,6,3,-5,-9,8,9};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        //calculate max
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        //calculate 2nd max
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > secMax && arr[i] != max) secMax = arr[i];      //Current element (arr[i]) SecMax se bada hona chahiye but Max ke equal nhi hona chahiye isse chota hi hona chahiye.
        }
        System.out.println(max);
        System.out.println(secMax);
    }
}


/* Explaination of arr[i] > secMax && arr[i] != max
condition ka purpose ye hai ki max ko second maximum banne se roka ja sake.
arr[i] > secMax     → current element secMax se bada hai.
arr[i] != max       → lekin current element maximum nahi hona chahiye.

Dono conditions ek saath true honi chahiye.
 */