package Recursion;
import java.util.ArrayList;

public class StringsBasicsMore {
    public static void main(String[] args) {
//        String s = "Guddu";
//        change(s);
//        System.out.println(s);        //output is Guddu   //Sting is not changed b/q of string is pass by value   //This is known as string is pass by value

        //Array of Strings =>We can create array of a string or ArrayList of ArrayList
//        String[] arr = {"Guddu", "Vicky", "Rohit", "Purkit"};
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        //ArrayList of string
        ArrayList<String> al = new ArrayList<>();
        al.add("Ankit");
        al.add("Priyansh");
        al.add("Ajay");
        al.add("Xavier");
        System.out.println(al);

        change2(al);
        System.out.println(al);     //Arraylist of string is pass by reference
    }
    private static void change2(ArrayList<String> al){
        al.add("John");
    }

    private static void change(String s) {
        s = "Rohit";
    }
}


/*
Note: character array is pass by reference, but character string is not pass by reference.
      string ki array (array of string) and string ki arraylist (arraylist of string) pass by reference hoti hai
Note: we can create an arraylist using ArrayList or List method.
 */