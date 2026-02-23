package Array;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {5,8,2,6,9};

        //ForEach method ==>Allowed
        for(int ele : arr){
            System.out.print(ele+" ");
        }

        // not Allowed to modify/update array elements in for-each loop
        for(int ele : arr){
            ele *= 2;       //like this
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
