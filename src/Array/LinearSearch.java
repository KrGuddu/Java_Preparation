//Ques: Search in Array

package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        boolean flag = false;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == target){
//                System.out.println("Target exist in array at index: " + i);      //use to find index of array
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Target exist in array");  //Actually written here: if(flag==true)
        else System.out.println("Target not exist in array");
    }
}
