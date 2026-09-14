package Array;

public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {
//        char[] arr = new char[8];                    //boolean[] arr = new boolean[8]; → false false false false false false false false
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");            //In Java, default value of char[] is '\u0000' (null character) or space.
//        }
        String[] arr = {"Abhinav","Harsh","Achyut","Sahil","Isha"};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
