package Strings.SubStrings;

public class Sum_Of_All_Substrings_Of_A_Number {
    public static void main(String[] args) {
        String s = "6759";
        int sum = 0;

        for(int i=0; i<s.length(); i++){            // Iterate through each starting index of substring
            int temp = 0;                           // Temporary variable to hold current substring value
            for(int j=i; j<s.length(); j++) {       // Generate all substrings starting from index i
                temp *= 10;                         // Shift the previous value by one digit to the left
                temp += (s.charAt(j) - '0');        // Add current digit to form the number
                sum += temp;                        // Add the current substring number to the answer
            }
        }
        System.out.println(sum);
    }
}
