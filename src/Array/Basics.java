package Array;

public class Basics {
    public static void main(String[] args) {
        //1st method of array initialization
        int[] x = {9,169,5,84,91,82};
        System.out.println(x);  //it will give memory allocation not an array. like: [I@6acbcfc0
        //Indexing
        System.out.println(x[2]);   //access
        //Updating elements - mutability (array element changed b/q is it mutable and its process is known as mutability).
        x[4] = 79;
        System.out.println(x[4]);

        //2nd method of initialization
        int[] arr = new int[4];     // 4 size ka array  // index is 0 to 3
        arr[0] = 10;    //this is known as assign or update of the value.
        arr[1] = 20;
        arr[2] = -15;
        arr[3] = 150;
    }
}
