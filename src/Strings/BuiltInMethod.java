package Strings;
import java.util.Locale;

public class BuiltInMethod {
    public static void main(String[] args) {
        String s = "harshita";
//        s.toUpperCase();      //This is not work. o/p: harshita       //B/q Strings are immutable
        s = s.toUpperCase();    //This is work. o/p: HARSHITA
        System.out.println(s);

        //Important   //if string value is a integer then by this method we can convert string to integer
        String str = "32145697";
        int n = Integer.parseInt(str);
        System.out.println(n);
        System.out.println(n+1);    //o/p: 32145698
    }
}


/*
Note: Strings in Java are immutable.
Immutable means: once a String object is created, its original value cannot be changed.

Explanations:
1. First case: s.toUpperCase();     =>Not work
Why?
1. s refers to the String object "harshita".
2. toUpperCase() creates and returns a new String object "HARSHITA".
3. But you are not storing that returned String anywhere.
4. So, s still refers to "harshita".

2. Second case: s = s.toUpperCase();    =>Work
Why?
1. toUpperCase() creates a new String "HARSHITA".
2. It returns that new String.
3. s = assigns the returned String to the reference variable s.
4. Now s refers to "HARSHITA".



Important concept for Java notes
Method	                What happens?
s.toUpperCase()	        Returns a new String; original remains unchanged.
s.toLowerCase()	        Returns a new String; original remains unchanged.
s.trim()	            Returns a String; original remains unchanged.
s.replace()	            Returns a String; original remains unchanged.
s.concat()	            Returns a String; original remains unchanged.

Remember this rule:
String methods generally return a new String instead of modifying the original String because String is immutable.

Interview question: Why is String immutable in Java?
Main reasons:
- Security
- Thread safety
- String Pool optimization
- HashCode caching and reliable use as HashMap keys.

 */