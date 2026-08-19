package Strings;

public class compareTo {
    public static int compareTo2(String a, String b) {
        int n = Math.min(a.length(), b.length());

        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }

        return a.length() - b.length();
    }


    public static void main(String[] args) {
//        All string anr print is written here
    }
}
