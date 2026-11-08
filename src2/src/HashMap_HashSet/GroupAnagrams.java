package HashMap_HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    // public List<List<String>> groupAnagrams(String[] strs) {

    // }

    //1st method: Brute Force Approach — Compare Every String
    /* Complexity:
        Let:
            n = number of strings
            k = maximum length of a string
        Time: O(n² × k)	 =>Pairwise comparison; each anagram check takes O(k + 26).
        Auxiliary Space: O(n + 26)	=>Visited array and frequency array, excluding output.

        This works, but repeatedly comparing strings is inefficient.
    */
    // public List<List<String>> groupAnagrams(String[] strs) {
    //     List<List<String>> result = new ArrayList<>();
    //     boolean[] visited = new boolean[strs.length];

    //     for (int i = 0; i < strs.length; i++) {
    //         if (visited[i]) continue;

    //         List<String> group = new ArrayList<>();
    //         group.add(strs[i]);
    //         visited[i] = true;

    //         for (int j = i + 1; j < strs.length; j++) {
    //             if (!visited[j] && isAnagram(strs[i], strs[j])) {
    //                 group.add(strs[j]);
    //                 visited[j] = true;
    //             }
    //         }
    //         result.add(group);
    //     }
    //     return result;
    // }

    // private boolean isAnagram(String s1, String s2) {
    //     if (s1.length() != s2.length()) return false;
    //     int[] freq = new int[26];

    //     for (int i = 0; i < s1.length(); i++) {
    //         freq[s1.charAt(i) - 'a']++;
    //         freq[s2.charAt(i) - 'a']--;
    //     }

    //     for (int count : freq) {
    //         if (count != 0) return false;
    //     }
    //     return true;
    // }


    //2nd method: HashMap + Sorting     =>Optimized     =>Recommended common approach
    // Time: O(n × k log k)	=>Each string is sorted independently.
    // Auxiliary Space: O(n × k)	=>HashMap stores all original strings and their groups, excluding output conventions aside.
    /* Core idea: Anagrams have the same sorted character sequence.
        eat → aet
        tea → aet
        ate → aet

        tan → ant
        nat → ant

        bat → abt
    */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();           // Step 1: Convert string into character array
            Arrays.sort(chars);                         // Step 2: Sort characters
            String key = new String(chars);             // Step 3: Create sorted string as key
            map.putIfAbsent(key, new ArrayList<>());    // Step 4: Create group if key does not exist
            map.get(key).add(str);                      // Step 5: Add original string to its group
        }
        return new ArrayList<>(map.values());           // Step 6: Return all groups
    }


    //3rd method: HashMap + Character Frequency     =>Optimized Approach 2
    /* Core idea: Anagrams have exactly the same character frequencies.
    Note: Best time complexity for lowercase English letters

    Time: O(n × k) =>Each string is traversed, and 26 frequency entries are processed.
    Auxiliary Space: O(26 × n) =>HashMap stores frequency keys and group references, excluding output.
    */
    // public List<List<String>> groupAnagrams(String[] strs) {
    //     HashMap<String, List<String>> map = new HashMap<>();

    //     for (String str : strs) {
    //         int[] freq = new int[26];                   // Step 1: Store character frequencies

    //         for (char ch : str.toCharArray()) {
    //             freq[ch - 'a']++;
    //         }

    //         StringBuilder key = new StringBuilder();    // Step 2: Create unique frequency key

    //         for (int count : freq) {
    //             key.append(count).append("#");
    //         }
    //         map.putIfAbsent(key.toString(), new ArrayList<>());     // Step 3: Create group if key does not exist
    //         map.get(key.toString()).add(str);           // Step 4: Add original string to its group
    //     }
    //     return new ArrayList<>(map.values());
    // }
}




/*
What to remember in your notes:
Que: LC 49 — Group Anagrams
Pattern: Hashing + HashMap

Approach 1: HashMap + Sorting
Key = Sorted String
TC = O(n * k log k)

Approach 2: HashMap + Frequency
Key = Character Frequency Signature
TC = O(n * k) for fixed alphabet

Best: Frequency approach (for lowercase a-z)
Alternative: Sorting approach (more general)
 */