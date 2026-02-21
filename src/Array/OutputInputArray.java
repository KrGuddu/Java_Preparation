package Array;

public class OutputInputArray {
    public static void main(String[] args) {
        int[] arr = {89,85,-2,0,56,79};
        //to print all element of array => messy
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);

        //so, use this
        for (int i =0; i<=5; i++){
            System.out.print(arr[i] + " ");
        }
        //or,
        for (int i =0; i<6; i++){       //Array length is 6, so loop run 0 to length of array.
            System.out.print(arr[i] + " ");
        }
        //or, using arr.length =>use when the length of array is not known
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //or,
        int n = arr.length;     // length of array = n-1 where n is arr.length
        for (int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        //Note: Default value of an array is 0
        int[] arr2 = new int[7];    //Means, 7 length ka ek array hai jiska default value 0 hai
        for (int i = 0; i <7 ; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
