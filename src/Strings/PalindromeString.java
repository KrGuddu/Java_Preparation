/* palindrome: A sequence of characters (a string) or a number that reads the same backward as forward.
   For example, the string "radar" and the number 121 are palindromes because reversing their order results in the exact same value.
 */

package Strings;

public class PalindromeString {
    boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}


/*
Rule for charAt

Galat ❌	        Sahi ✅
s.charAt[i]	        s.charAt(i)
s.length	        s.length()
s.toLowerCase	    s.toLowerCase()


Important: Java mein String ko array ki tarah s[i] se bhi access nahi kar sakte. Character nikalne ke liye s.charAt(i) use karna hota hai.
* */
