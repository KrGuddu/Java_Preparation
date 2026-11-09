// int[] s : this is an array
// char[] s : this is a character type string

package TwoPointers;

public class ReverseString {
//    public void reverseString(char[] s) {
//        int i = 0, j = s.length - 1;
//        while (i < j) {
//            //Wrong Approach
//            int temp = s.charAt(i);
//            s.charAt(i) = s.charAt(j);
//            s.charAt(j) = temp;
//            i++;
//            j--;
//        }
//    }

    //Right Approach
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}


/*
Time  : O(n)   => Each element is visited at most once
Space :	O(1)   => Only one temporary variable is used


# Important Concepts
Concept	    Explanation
char[]	    Mutable character array
s.length	Returns the array length
s[i]	    Accesses the character at index i
temp	    Temporarily stores a character during swapping
i < j	    Ensures each pair is swapped only once
 */




/* 3 Approach
The most efficient and recommended way to reverse a string in Java is by using the built-in StringBuilder.reverse() method.
Below are the three most common approaches to accomplish this depending on your requirements (e.g., built-in methods vs. manual logic for interviews).

1. The Built-in Way (Recommended)

This approach utilizes StringBuilder, which is mutable and handles the reversal quickly and efficiently in memory. As noted by a consensus among developers on Stack Overflow, this is the cleanest implementation and properly handles Unicode surrogate pairs.
public class TwoPointers.ReverseString {
    public static void main(String[] args) {
        String original = "Hello World";

        // Reverse using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println(reversed); // Output: dlroW olleH
    }
}
Use code with caution.

2. The Manual Iteration Way (Common Interview Question)

If you are doing this for an interview or assignment where you are not allowed to use built-in reverse methods, you can iterate through the string backwards using a for loop.
public class ReverseManual {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = "";

        // Loop backwards from the last character to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println(reversed); // Output: dlroW olleH
    }
}
Use code with caution.
Note: While reversed += original.charAt(i) works for simple demonstrations, creating new strings inside a loop is inefficient for very large text because strings are immutable in Java.

3. The Character Array Way (In-Place / Optimized Manual)

To manually reverse a string with better performance, convert the string into a mutable character array (char[]) and swap the elements from both ends toward the middle.
public class ReverseArray {
    public static void main(String[] args) {
        String original = "Hello World";
        char[] chars = original.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        // Swap characters until pointers meet in the middle
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(chars);
        System.out.println(reversed); // Output: dlroW olleH
    }
}


Summary of Differences
Method	                Best Used For	                                Thread Safe?	    Efficiency
StringBuilder	        Standard development, production code	        No	                High
StringBuffer	        Multi-threaded environments	                    Yes	                Medium
char[] Array Swap	    Technical interviews (in-place constraints)	    No	                High

 */