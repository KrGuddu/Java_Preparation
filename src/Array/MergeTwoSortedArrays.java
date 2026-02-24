package Array;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2,5,6,9,20};
        int[] b = {1,3,4,5,7,8,90};

        int[] c = new int[a.length + b.length];     //Create an empty array to store a new merged array, which length is a.length + b.length
        merge(a,b,c);
        for (int ele : c) System.out.print(ele + " ");
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]) c[k++]= a[i++];  //Agar a[i] small hai b[j] se to c[k] me a[i] ko store kar do and a[i] and c[k] dono ko ek se badha do
            else c[k++] = b[j++];           //Aur agr b[j] small hai to b[j] ko c[k] me store kar do and b[j] and c[k] dono ko ek se badha do
        }
        while (i<a.length) c[k++] = a[i++];     // Agar array a and b me comparison karte karte b khatam ho gya(to loop terminate ho jayege) to array a ki element avi v bacha hua hai to a ko a.length tak chalao aur savi elements ko bari bari se c[k] me store karte jao.
        while (j<b.length) c[k++] = b[j++];
    }
}
