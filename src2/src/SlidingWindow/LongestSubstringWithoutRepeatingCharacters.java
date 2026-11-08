package SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    //Brute Force Approach  => Time: O(n^2) average-case; Space: O(min(n, character set size))
    // public int lengthOfLongestSubstring(String s) {
    //     int maxLen = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         HashSet<Character> set = new HashSet<>();
    //         for (int j = i; j < s.length(); j++) {
    //             char ch = s.charAt(j);
    //             if (set.contains(ch)) break;
    //             set.add(ch);
    //             maxLen = Math.max(maxLen, j - i + 1);
    //         }
    //     }
    //     return maxLen;
    // }

    //Optimized Approach — Variable Size Sliding Window + HashSet   =>TC: O(n) average, SC: O(min(n, charset))  //Easier
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {  // Remove duplicate characters
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);    // Add current character
            maxLen = Math.max(maxLen, right - left + 1);    // Update maximum length
        }
        return maxLen;
    }


    //Another Optimized Approach — HashMap  =>=>TC: O(n) average, SC: O(min(n, charset))    //Slightly more advanced
    // public int lengthOfLongestSubstring(String s) {
    //     HashMap<Character, Integer> map = new HashMap<>();

    //     int left = 0;
    //     int maxLen = 0;

    //     for (int right = 0; right < s.length(); right++) {
    //         char ch = s.charAt(right);
    //         if (map.containsKey(ch)) {
    //             left = Math.max(left, map.get(ch) + 1);
    //         }
    //         map.put(ch, right);
    //         maxLen = Math.max(maxLen, right - left + 1);
    //     }
    //     return maxLen;
    // }
}


/* HashSet vs HashMap

Property	                HashSet	                    HashMap
1. Stores	                Characters	                Character + last index
2. Duplicate handling	    Remove one by one	        Jump left directly
3. Left pointer	            Moves incrementally	        Can jump forward
4. Time	                    O(n) average	            O(n) average
5. Space	                O(min(n, charset))	        O(min(n, charset))
6. Difficulty	            Easier	                    Slightly more advanced

My recommendation: Learn the HashSet approach first because it builds your understanding of variable-size sliding windows. Then learn HashMap because it is a useful optimization technique.
 */