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


/*
Remember this core formula:
Different character → character difference
All common characters same → length difference

Yahi basic logic String.compareTo() ke behavior ko reproduce karta hai.


============== In Details Explanations =============
1. Different character → character difference:
Matlab dono strings ko left se right compare karo. Jahan pehli baar characters different mile, wahi decide karega result.

Q1. Example:
compareTo("rita", "ritu")

Compare:
r == r  ✓
i == i  ✓
t == t  ✓
a != u  ← first difference

Ab sirf a aur u ko compare karenge:
'a' = 97
'u' = 117

97 - 117 = -20

So:
return a.charAt(i) - b.charAt(i);

Result: -20

Q2. Ek aur example
compareTo("apple", "apply")
a == a ✓
p == p ✓
p == p ✓
l == l ✓
e != y ← first difference

'e' = 101
'y' = 121

101 - 121 = -20

Result: -20

2. All common characters same → length difference
Ab maan lo ek string dusri string ka starting part/prefix hai.

Example:
compareTo("abc", "abcdef")

Compare:
a == a ✓
b == b ✓
c == c ✓

Ab "abc" khatam ho gaya.

Koi different character mila hi nahi.

To ab length compare karenge:
"abc".length()    = 3
"abcdef".length() = 6

Therefore:
return a.length() - b.length();
3 - 6 = -3

Result: -3

Ek aur example
compareTo("hello", "hello")

Characters:
h == h
e == e
l == l
l == l
o == o

Sab same.

Length:
5 - 5 = 0

Result: 0

Ek important example
compareTo("abcde", "abc")

Common characters:
a == a
b == b
c == c

"abc" khatam ho gaya, lekin "abcde" mein extra characters hain.

Length:
5 - 3 = 2

Result: +2

Short trick 🧠
compareTo() ko aise yaad rakho:

1️⃣ Character different mila?
       ↓
   Character difference return karo

2️⃣ Koi character different nahi mila?
       ↓
   Length difference return karo


Code mein exactly:
for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
    if (a.charAt(i) != b.charAt(i)) {
        return a.charAt(i) - b.charAt(i);
    }
}
return a.length() - b.length();

Important: compareTo() ka exact numeric result generally sirf negative / zero / positive ke meaning ke liye important hota hai. -20, -3, 2 etc. actual difference se aate hain.
* */
