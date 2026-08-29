//By Recursive call method

package Recursion;
import java.util.Scanner;

public class SumOfNumbers_V2 {
    static int findSum(int n){
        if(n==0) return 0;                  //This is Base case     //Also we write: if(n==1) return 1;
        return n+ findSum(n-1);          // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = findSum(n);
        System.out.println(sum);
    }
}


/*Explanations:
Agar i/p n = 5 ho to kya hoga?
findSum(5)
= 5 + findSum(4)
= 5 + 4 + findSum(3)
= 5 + 4 + 3 + findSum(2)
= 5 + 4 + 3 + 2 + findSum(1)
= 5 + 4 + 3 + 2 + 1 + findSum(0)

Base case:
findSum(0) = 0

Phir return hoga:
1 + 0 = 1
2 + 1 = 3
3 + 3 = 6
4 + 6 = 10
5 + 10 = 15

Core logic yaad rakho
if (n == 0) return 0;
return n + findSum(n - 1);

Yahan n - 1 problem ko chhota karta hai, aur n == 0 recursion ko rokta hai.

Time Complexity: O(n)
Space Complexity: O(n) — recursive call stack ki wajah se.
 */