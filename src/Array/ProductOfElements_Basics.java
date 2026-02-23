package Array;

public class ProductOfElements_Basics {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-7,8};
        int product = 1;
        for (int i = 1; i <arr.length; i++) {
            product *= arr[i];
        }
        System.out.println(product);
    }
}
