//Que: Multiply odd indexed elements by 2 and add 10 to even indexed elements
// 2nd method best hai iske comparison me

package Array;

public class ModifyElements {
    public static void main(String[] args) {
        int[] arr = {4,1,7,5,-3,10,2};
        for (int i = 0; i < arr.length; i++) {
            if (i%2 != 0){
                arr[i] *= 2;
            }else{
                arr[i] +=10;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
