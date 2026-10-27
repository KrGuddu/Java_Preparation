package Array;

public class PrintingArrays {
    /*
    The simplest way to print an array in Java is by using Arrays.toString() for 1D arrays, and Arrays.deepToString() for multidimensional arrays.
If you pass an array directly to System.out.println(myArray), Java will print a cryptic memory reference hash code (like [Ljava.lang.String;@49476842) instead of the actual contents.
Here are the most common ways to print an array depending on your needs.

1. The Quickest Way (Standard 1D Arrays)

Use Arrays.toString() to instantly format your array into a readable comma-separated string enclosed in square brackets.
java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(fruits));
        System.out.println(Arrays.toString(numbers));
    }
}
Use code with caution.
Output:
text
[Apple, Banana, Cherry]
[1, 2, 3, 4, 5]
Use code with caution.

2. For Multidimensional Arrays (Matrices)

Arrays.toString() does not work on nested arrays. To print a 2D or 3D array properly, use Arrays.deepToString().
java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        System.out.println(Arrays.deepToString(matrix));
    }
}
Use code with caution.
Output:
text
[[1, 2], [3, 4]]
Use code with caution.

3. For Custom Formatting (Loops)

If you want to print elements on separate lines, omit the brackets, or style the output manually, use an Enhanced for loop (also called a for-each loop).
java
public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
Use code with caution.
Output:
text
Apple
Banana
Cherry
Use code with caution.

4. The Functional Approach (Java 8+ Streams)

If you prefer a functional programming style, you can stream the array elements directly to the printer.
java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Prints each element on a new line
        Arrays.stream(fruits).forEach(System.out::println);
    }
}
Use code with caution.

Summary: Which one should I use?


Scenario	Best Method
Quick debugging / logs	Arrays.toString(array)
Grid, table, or 2D array	Arrays.deepToString(matrix)
Custom formatting or processing	Enhanced for loop
Modern, functional code chains	Arrays.stream(array).forEach(...)

If you want to do more than just view the data, tell me what kind of array elements you are working with (primitives or custom Objects) or if you need to format the output in a specific way!

     */
}
