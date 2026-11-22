package Recursion;

public class Factorial {
    int factorial(int n) {
        if(n==0 || n==1) return 1;      //Base case
        int ans = n*factorial(n-1);
        return ans;

        //or
        // if(n==0 || n==1) return 1;
        // return n*factorial(n-1);


        //or
        // if(n<=1) return 1;
        // return n*factorial(n-1);


        // or: using ternary operator
        // return (n<=1) ? 1 : n*factorial(n-1);


        //Using for loop
        // int fact = 1;
        // for (int i = 1; i<=n; i++) {
        //     fact *= i;
        // }
        // return fact;

    }
}


//Note**: for loop is faster and more memory-efficient than recursive code. And recursive code extra space v leta hai
//Note: recursive code dugani time lete hai ek jane me and ek bapas ane me (time n+n=2n hogi), jabki normal for loop me ayesa nhi hota hai.


/* Que: fact(0) is 1 how?
We can write, n! = (n+1)!/(n+1)         =>formula
0! = (0 + 1)!/(0 + 1)
⇒ 0! = (1)!/(1)
⇒ 0! = 1/1
⇒ 0! = 1


Note: Derivation of Zero Factorial is Equal to 1
Formula for n! = n × (n-1) × (n-2) × (n-3) × (n-4)........ × 1
Above formula can also be written as n! = n × (n-1)!
For the value of 1! = 1 × (1-1)!
1! = 1 × 0!

The value of LHS should always be equal to the value of RHS
For LHS = RHS, a value of 0! must be equal to 1
Hence, 0! = 1
 */