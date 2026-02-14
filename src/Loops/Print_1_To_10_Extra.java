// Que: Print number from 1 to 10.
package Loops;

public class Print_1_To_10_Extra {
    public static void main(String[] args) {
        int i;                                              // Initialization ko loop ke under v kar skte hai aur bahar v.
        for (i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("Outer i is: " + i);             // ye wo i ki value hai jaha par loop break hoti hai. yaha par loop i=11 par break hue hai.
    }
}
