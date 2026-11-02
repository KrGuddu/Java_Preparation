package Strings;
import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}


/* What is Anagram: If the frequency of every character matches in both strings, then the strings are anagrams.

Steps to solve anagram:-
1. Convert string to Array
2. sort the array
3. then, check both array elements are same or not if not same then return false, otherwise return true.    => arr1[i] == arr2[i]

Also, Check base case
 */