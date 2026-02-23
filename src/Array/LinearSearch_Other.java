package Array;

public class LinearSearch_Other {
    public static void main(String[] args) {
        int[] arr = {12,3,27,53,18,62,88,6,53};
        int target = 18;
        int found = -1;     //-1 is index not value  // -1 means target array me nahi hai    // found me koe v -ve le skte hai like -20 or -70 etc.
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                found = i; // any no. except -1 means target array me hai
                break;
            }
        }
        if(found!=-1) System.out.println("Target exists in Array at index "+found);
        else System.out.println("Target missing in Array");
    }
}
