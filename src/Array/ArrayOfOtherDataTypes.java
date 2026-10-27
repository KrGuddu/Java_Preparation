package Array;

public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {
//        char[] arr = new char[8];                    //boolean[] arr = new boolean[8]; → false false false false false false false false
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");            //In Java, default value of char[] is '\u0000' (null character) or space.
//        }
        String[] arr = {"Abhinav","Harsh","Achyut","Sahil","Isha"};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


/*
In Java, data types are divided into two main categories: primitive types (which have specific default values) and reference types (which always default to null).

Data Type	                      Default Value(for Fields)	           Size / Description
1. byte	                            0	                                8-bit signed integer
2. short	                        0	                                16-bit signed integer
3. int	                            0	                                32-bit signed integer
4. long	                            0L	                                64-bit signed integer
5. float	                        0.0f	                            32-bit floating-point
6. double	                        0.0d	                            64-bit floating-point
7. char	                            '\u0000' (Null character)	        16-bit Unicode character
8. boolean	                        false	                            True/False flag
9. Any Reference Type               null	                            References to objects in memory
(e.g., String, Array, Object)


⚠️ Crucial Rule: Instance vs. Local Variables
Java only applies these default values to class variables (static fields) and instance variables (object fields).
Local variables (variables declared inside a method) do not receive default values. The Java compiler will throw a compile-time error if you attempt to read an uninitialized local variable.

 */