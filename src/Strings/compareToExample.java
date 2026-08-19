package Strings;

public class compareToExample {
    public static int compareTo(String a, String b) {
        int n = Math.min(a.length(), b.length());

        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }

        return a.length() - b.length();
    }

    public static void main(String[] args) {        //ye part exam/test me bydefault milta hai
        String s1 = "rita";
        String s2 = "ritu";

        System.out.println(compareTo(s1, s2));
    }
}
