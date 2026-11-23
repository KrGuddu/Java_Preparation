package Recursion;

public class WaysToReachNthStair {
    public int countWays(int n) {
        // if(n==1) return 1;
        // if(n==2) return 2;
        if(n<=2) return n;
        return countWays(n-1) + countWays(n-2);
    }
}


//It will give TLE error and it can solved in DP (Dynamic programming).