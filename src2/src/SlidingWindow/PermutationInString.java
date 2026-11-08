//See this in chatgpt solutions
//Pattern: Sliding Window + Fixed-Size Window

package SlidingWindow;
import java.util.Arrays;

public class PermutationInString {
    //Brute Force Approach
    // public boolean checkInclusion(String s1, String s2) {

    // }

    //Optimized Code    [Key Concept: Fixed-Size Sliding Window + Character Frequency]
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        for (int i = 0; i < n; i++) {               // Calculate frequency of s1
            s1Freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {               // Create initial window in s2
            windowFreq[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1Freq, windowFreq)) {    // Check initial window
            return true;
        }

        // Slide the window
        for (int i = n; i < m; i++) {
            windowFreq[s2.charAt(i) - 'a']++;       // Add incoming character
            windowFreq[s2.charAt(i - n) - 'a']--;   // Remove outgoing character

            if (Arrays.equals(s1Freq, windowFreq)) {
                return true;
            }
        }
        return false;
    }
}


/*Complexity Analysis
Let:
- n = length of s1
- m = length of s2

Time: O(m × 26) = O(m)	: Each window compares 26 frequencies
Space: O(26) = O(1)	    : Two fixed-size arrays

Arrays.equals() compares all 26 elements, so each comparison takes constant time.
 */



/* Important Java Concepts

Code	                Meaning
new int[26]	            Creates frequency array for a-z
ch - 'a'	            Converts character into index 0–25
freq[index]++	        Increases character frequency
freq[index]--	        Decreases character frequency
Arrays.equals(a, b)	    Compares array contents
i - n	                Finds outgoing character's index


# Why s2.charAt(i - n)?
Suppose window size is 2:
s2 = e i d b a
     0 1 2 3 4

When i = 2:
Incoming = s2.charAt(2);     // d
Outgoing = s2.charAt(2 - 2); // e

So the new window becomes "id".
 */