package Pattern_Printing;

import java.util.Scanner;

public class Pyramid_Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;         // nsp: number of space, nst: number of star

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print(j + " ");
            }
            nsp--;      //Space ko ek ghatate jao
            nst += 2;   //Star ko 2 badhate jao
            System.out.println();
        }
    }
}

/* if i use this on 2nd inner loop
System.out.print(i + " ");
        1
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5

System.out.print(j + " ");
        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9

 */