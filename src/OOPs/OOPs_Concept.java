//OOPs Topics: Reference Variable, Object Memory, Array as Object, Object/Array Reference

package OOPs;
public class OOPs_Concept {
}

/*
1. Sabse pehle: Variable ke 2 basic types

Java me broadly variables ko samajhne ke liye:

Primitive variable
int x = 10;

x ke andar directly value hai:

x
↓
10

Examples:

int
double
char
boolean
long
float
short
byte
Reference variable

Object/array ke case me variable ke andar object khud nahi, balki us object ka reference hota hai.

Example:

Student s1 = new Student();

Yahan:

s1 ─────────→ Student object

s1 = reference variable
Student object = actual object

2. Object kya hota hai?

Class ko ek blueprint/template samjho.

class Student {
    String name;
    int age;
}

Ye sirf blueprint hai.

Ab:

Student s1 = new Student();

new Student() actual object create karta hai.

Conceptually:

                    Heap
                 ┌─────────────┐
s1 ─────────────→│ Student     │
                 │ name = null │
                 │ age  = 0    │
                 └─────────────┘

Yahan s1 object nahi hai.

s1 object ko refer karne wala reference variable hai.

3. new kya karta hai?
Student s1 = new Student();

Isko 3 parts me dekho:

Student     s1       =       new Student();
   ↓         ↓                ↓
datatype   reference       object creation
Step 1
Student s1;

Ek reference variable declare hua.

s1 → null

Abhi koi object nahi hai.

Step 2
new Student()

Memory me ek naya Student object create hua.

Step 3
s1 = new Student();

s1 us object ko refer karne laga.

s1 ─────→ Student object
4. Array bhi Object hai

Ye bahut important point hai:

Java me array bhi object hota hai.

Example:

int[] arr = {4, 7, 1, 4, 8};

Yahan arr ek reference variable hai.

Actual array memory me alag jagah bana hai:

arr ─────────→ [4, 7, 1, 4, 8]
                Array Object

Isliye:

int[] arr;

ka matlab ye nahi hai ki array create ho gaya.

Ye sirf reference variable banata hai:

arr → null

Array create karne ke liye:

arr = new int[5];

Ab:

arr ─────→ [0, 0, 0, 0, 0]
5. Ab tumhare code par aao

Tumhara code:

int[] arr = {4,7,1,4,8};

Isko memory ke perspective se dekho:

Stack                    Heap

arr ─────────────────→ [4, 7, 1, 4, 8]
                        Array Object

arr reference variable hai.

[4,7,1,4,8] array object hai.

6. Ab s1 create hota hai
StudentData s1 = new StudentData(arr);

Sabse pehle:

new StudentData(arr)

StudentData ka object create karega.

Constructor ko arr ka reference milega.

Tumhara constructor:

StudentData(int[] s) {
    marks = Arrays.copyOf(s, s.length);
}

Yahan s bhi reference variable hai.

Initially:

arr ─────→ [4, 7, 1, 4, 8]
              ↑
              │
              s

Matlab arr aur s temporarily same array ko refer kar rahe hain.

Lekin constructor ke andar:

Arrays.copyOf(s, s.length)

ek new array object banata hai.

So final:

Stack                     Heap

arr ───────────────→ [4, 7, 1, 4, 8]


s1 ────────────────→ StudentData object
                       │
                       │ marks
                       ↓
                     [4, 7, 1, 4, 8]

Ab 2 different arrays hain.

7. s1.marks[0] = 40

Ab:

s1.marks[0] = 40;

iska matlab:

s1 se StudentData object tak jao
uske marks variable ko dekho
marks jis array ko refer kar raha hai, uske index 0 ko change karo
s1
 ↓
StudentData
 ↓ marks
 ↓
[40, 7, 1, 4, 8]

Lekin arr ka array alag hai:

arr
 ↓
[4, 7, 1, 4, 8]

Isliye:

System.out.println(arr[0]);

Output:

4
8. Ab important difference: marks = s

Agar constructor me:

StudentData(int[] s) {
    marks = s;
}

hota, to Arrays.copyOf() nahi hota.

Then:

arr ─────────────┐
                 ↓
              [4,7,1,4,8]
                 ↑
                 │
s1.marks ────────┘

Ab ek hi array hai.

So:

s1.marks[0] = 40;

ke baad:

arr       → [40,7,1,4,8]
s1.marks  → [40,7,1,4,8]

Aur:

System.out.println(arr[0]);

output:

40
9. = ka important concept

Reference variables ke saath:

int[] a = {1,2,3};
int[] b = a;

iska matlab array copy nahi hua.

Instead:

a ────────┐
          ↓
       [1,2,3]
          ↑
          │
b ────────┘

a aur b same array ko refer kar rahe hain.

So:

b[0] = 100;

then:

System.out.println(a[0]);

Output:

100
10. Copy karna ho to
int[] a = {1,2,3};

int[] b = Arrays.copyOf(a, a.length);

Now:

a ─────→ [1,2,3]

b ─────→ [1,2,3]

2 different arrays.

b[0] = 100;

Now:

a ─────→ [1,2,3]

b ─────→ [100,2,3]
11. s1 aur s2 ko bhi samjho

Tumhare code me:

StudentData s1 = new StudentData(arr);
StudentData s2 = new StudentData(2);

Yahan 2 different StudentData objects create hote hain.

s1 ─────→ StudentData Object 1
             ↓
           marks → [40,7,1,4,8]


s2 ─────→ StudentData Object 2
             ↓
           marks → [0,0]

So:

s1 and s2

Different reference variables.

StudentData objects

Different objects.

s1.marks and s2.marks

Different arrays.

12. Ek master diagram

Tumhare complete code ko roughly aise visualize karo:

                    STACK                         HEAP

              ┌─────────────┐
              │    arr      │───────────────┐
              └─────────────┘                │
                                             ↓
                                      ┌───────────────┐
                                      │ 4  7  1  4  8 │
                                      └───────────────┘


              ┌─────────────┐
              │     s1      │───────────────┐
              └─────────────┘                │
                                             ↓
                                      ┌─────────────────┐
                                      │ StudentData     │
                                      │                 │
                                      │ marks ──────────┼────→ [40,7,1,4,8]
                                      └─────────────────┘


              ┌─────────────┐
              │     s2      │───────────────┐
              └─────────────┘                │
                                             ↓
                                      ┌─────────────────┐
                                      │ StudentData     │
                                      │                 │
                                      │ marks ──────────┼────→ [0,0]
                                      └─────────────────┘

Note: Stack/heap diagram conceptual hai; Java implementation details JVM/optimization ke according vary kar sakti hain. Lekin learning ke liye ye model bahut useful hai.

13. Bas ye 4 lines yaad rakho
Primitive
int x = 10;
x → 10
Object
Student s = new Student();
s → Student Object
Array
int[] arr = new int[5];
arr → Array Object
Same reference
int[] b = a;
a ──┐
    ↓
 [array]
    ↑
b ──┘
Copy
int[] b = Arrays.copyOf(a, a.length);
a → [1,2,3]

b → [1,2,3]

Same values, but different array objects.

Golden rule: Java me object/array variable ko generally reference variable ki tarah samjho—variable object ko refer karta hai, object khud variable ke andar nahi hota.
 */