package Array;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {5,8,2,6,9};

        //Normal for loop
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

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


// enhanced for loop / for-each loop