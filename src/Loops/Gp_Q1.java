//Display the GP: 1, 2, 4, 8, 16, ... up to n terms.
package Loops;

import java.util.Scanner;

public class Gp_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1, r=2;
        for (int i = 1; i <=n; i++) {
            System.out.println(a);
            a*=r;
        }
    }
}



/*
AP vs GP — remember this
AP: a += d;
GP: a *= r;
* */



/*
GP में हर term को एक fixed number से multiply किया जाता है। उस fixed number को Common Ratio (r) कहते हैं।
Example: 2, 6, 18, 54, 162, ...


1. Common Ratio
r = Second Term / First Term

General:
r = T₂ / T₁

2. nth Term ⭐
Tₙ = a × rⁿ⁻¹

Where:
a = first term
r = common ratio
n = term number
Tₙ = nth term

Example:
2, 6, 18, 54, ...

Find 5th term:
T₅ = 2 × 3⁵⁻¹
   = 2 × 3⁴
   = 2 × 81
   = 162

3. Sum of first n terms ⭐
When r ≠ 1:
Sₙ = a(rⁿ - 1) / (r - 1)

Equivalent form:
Sₙ = a(1 - rⁿ) / (1 - r)

Both are same.

Example:
2 + 6 + 18 + 54

Here:
a = 2
r = 3
n = 4

Therefore:
S₄ = 2(3⁴ - 1)/(3 - 1)
   = 2(81 - 1)/2
   = 80

4. Infinite GP Sum
If: |r| < 1
then: S∞ = a / (1 - r)

Example: 10 + 5 + 2.5 + 1.25 + ...

Here:
a = 10
r = 1/2

Therefore:
S∞ = 10 / (1 - 1/2)
   = 20

💻 Programming में GP
Your code:

int a = 1, r = 2;
for (int i = 1; i <= n; i++) {
    System.out.println(a);
    a *= r;
}

यह directly GP की definition follow करता है:

Current term → multiply by r → Next term

For:
a = 1
r = 2

you get:

1 → 2 → 4 → 8 → 16 → 32


🧠 DSA के लिए याद रखने वाली 3 चीजें
Common Ratio:   r = T₂ / T₁
nth Term:       Tₙ = a × rⁿ⁻¹
Sum:            Sₙ = a(rⁿ - 1)/(r - 1)

AP: Next = Current + d
GP: Next = Current × r
* */