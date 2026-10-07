//By sir

package BinarySearch;

public class SquareRoot_2 {
    int floorSqrt(int n) {
        // root of any number is from 1 to that number.

        // 1st Method
        // int root = 0;
        // for(int i=1; i<=n; i++){
        //     if(i*i > n) break;
        //     root = i;
        // }
        // return root;


        // 2nd method
        int lo=1, hi=n;   // In some case the square root of n is n. (√n = n). Ex: √0 is 0, √1 is 1.

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(mid*mid == n) return mid;        // here, mid is an element/number  //When element perfect quare is equal to n so that element is right answer (here mid is denote that element).
            else if (mid*mid > n) hi=mid-1;     //when element square is greater than element then ho left.
            else lo=mid+1;                      //when element square is greater than element then ho right.
        }
        return hi;      // When low cross high then loop will terminated and the right element is available on high, so answer is high.
    }
}
