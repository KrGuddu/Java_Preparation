package Recursion;

import java.util.ArrayList;

public class StringsBasicsMore {
    public static void main(String[] args) {
//        String s = "Guddu";
//        change(s);
//        System.out.println(s);        //Note:

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
        System.out.println(al);
    }
    private static void change2(ArrayList<String> al){
        al.add("John");
    }

    private static void change(String s) {
        s = "Rohit";
    }
}
