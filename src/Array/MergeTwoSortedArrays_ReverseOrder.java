package Array;

public class MergeTwoSortedArrays_ReverseOrder {
    public static void main(String[] args) {
        int[] a = {2,5,6,9,20};
        int[] b = {1,3,4,5,7,8,90};

        int[] c = new int[a.length + b.length];
        merge(a,b,c);
        for (int ele : c) System.out.print(ele + " ");
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=a.length-1, j=b.length-1, k=c.length-1;       //Always remember array index is array.length-1         //ArrayIndexOutOfBounds means Invalid index access
        while (i>=0 && j>=0){
            if (a[i]>b[j]) c[k--]= a[i--];
            else c[k--] = b[j--];
        }
        while (i>=0) c[k--] = a[i--];
        while (j>=0) c[k--] = b[j--];
    }
}
