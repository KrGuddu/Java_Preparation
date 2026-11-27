package Recursion;

public class LCMOfTwoNumbers {
    public int lcm(int a, int b) {
        // return a*b/gcd(a,b);
        return (a / gcd(a, b)) * b;     //change the multiplication order to reduce intermediate overflow risk
        //if final LCM exceeds the int range then use Long to avoid Overflow. [like: LCM(100000, 99999) => 100000 * 99999 => 9,999,900,000]
        // return ((long) a / gcd(a, b)) * b;       //In gfg we can get an Error [incompatible types: possible lossy conversion from long to int] b/q signature expected o/p is int not long.
    }
    public int gcd(int a, int b){       //Here, Euclidean Algorithm are used to calculate GCD.
        if(a==0) return b;
        return gcd(b%a, a);
    }
}


// TC: O(log(min(a, b)))
// AS: O(log(min(a, b))) due to recursion