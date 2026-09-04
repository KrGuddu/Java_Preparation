package Sorting.CyclicSort;

public class First_Missing_Positive {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        int n=arr.length;       // index 0 to n-1 hoga. So elements 1 to n tak fit hoga.
        while(i<n){
            if(arr[i]<=0 || arr[i]>n || arr[i]==i+1 || arr[i]==arr[arr[i]-1]) i++;
                // if(arr[i]<=0) i++;  //ignore in -ve numbers qki isse lagane ke liye koe sahi jagah hai hi nhi (Tips: negative index par lagega jo ki kavi exist hi nhi krti hai hai)
                // else if(arr[i]>n) i++;  //if number is greater than index then ignore. qki uss number ko kisi index par bheja nhi ja skta hai.
                // else if(arr[i]==i+1) i++; // already at correct place than ignore
                // else if(arr[i]==arr[arr[i]-1]) i++; //Ignore on +ve duplicate   //Means, Example: element 2 ko swap karne ke baad index 3 par le ja rhe hai aur waha par already element 2 hai to uss condition me ignore kar do nhi to infinite swaping ho jayegi.

            else swap(arr,i,arr[i]-1);
        }
        for(i=0;i<n;i++){
            if(arr[i] != i+1) return i+1;
        }
        return n+1;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
