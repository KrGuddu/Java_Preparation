package Array;

public class ProductOfElements_Basics {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-7,8};
        int product = 1;
        for (int i = 1; i <arr.length; i++) {       //yaha par arr[0]=1 hai to product par koe effect nhi par rha hai but agar koe aur value hoti to ye concept wrong ho jati So, array loop ko hamesa index 0 se start kare.
            product *= arr[i];
        }
        System.out.println(product);
    }
}
