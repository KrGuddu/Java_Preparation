//package OOPs;
//import java.util.Arrays;
//
//public class Marks {
//    public static class StudentData{        //Har StudentData object ke paas: [name → student ka naam, rno → roll number, marks → marks ka array] hai.
//        String name;
//        int rno;
//        int[] marks;
//
//        StudentData(int[] s){
//            marks = Arrays.copyOf(s,s.length);
//        }
//        StudentData(int s){
//            marks = new int[s];
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {4,7,1,4,8};
//
//        StudentData s1 = new StudentData(arr);
//        s1.marks[0] = 40;
//        System.out.println(arr[0]);
//
//        StudentData s2 = new StudentData(2);
//
//    }
//}


/* 1. Pehla Constructor
StudentData(int[] s) {
    marks = Arrays.copyOf(s, s.length);
}

Ye constructor int array receive karta hai.

Jab: [StudentData s1 = new StudentData(arr);] execute hota hai, to: [arr = {4, 7, 1, 4, 8}] constructor ko arr milta hai.

Important point:
Arrays.copyOf(s, s.length)   ==>original array ki copy banata hai.

Conceptually:
arr: [4, 7, 1, 4, 8]
copy of arr => s1.marks: [4, 7, 1, 4, 8]
Dono alag arrays hain.

# s1.marks[0] = 40;
Ab s1 ke marks array ka first element change hoga:
arr
 ↓
[4, 7, 1, 4, 8]

s1.marks
 ↓
[40, 7, 1, 4, 8]

arr change nahi hua.

Isliye: System.out.println(arr[0]);
ka output hoga: 4

# Agar Arrays.copyOf() nahi hota
Agar constructor hota:
StudentData(int[] s) {
    marks = s;
}

to dono(arr & s1.marks) same array ko point karte:
arr ───────┐
           ↓
      [4, 7, 1, 4, 8]
           ↑
           │
     s1.marks

Phir: s1.marks[0] = 40;
ke baad: arr[0] = 40  ho jata.

Yahi Arrays.copyOf() ka important purpose hai.


2. Dusra Constructor
StudentData(int s) {
    marks = new int[s];
}

Ye constructor integer receive karta hai, array nahi.

Jab: StudentData s2 = new StudentData(2);
execute hota hai, to: s = 2
aur: marks = new int[2];
execute hoga.

Isse ek naya integer array banega:
s2.marks
   ↓
[0, 0]

Note: Java me int array ke elements automatically 0 se initialize hote hain.


## Sabse important difference
marks = s;                              → same array/reference
marks = Arrays.copyOf(s, s.length);     → new/separate array

Aur:
marks = new int[s];                     → given size ka completely new array, initially all 0.
 */