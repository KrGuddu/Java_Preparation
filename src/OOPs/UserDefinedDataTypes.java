package OOPs;
import java.util.Scanner;
/*
//Note: class ko same folder/package ke under kahi se v access kar skte hai. Ex: same class me (means, main method ke sibling ke form me), class ke bahar like UserDefinedDataTypes ke sibling ke form me, without public, without static se v kar skte hai. And same folder ke under se v access kar skte hai (like PassingClassesToMethods).
    //Ye v kar skte hai
//public static class Student{ // khudka ek data type bana liya hai           //Student is class
//    String name;
//    int rno;
//    double cgpa;
//}

    //Ye v kar skte hai
//static class Student{ // khudka ek data type bana liya hai           //Student is class
//    String name;
//    int rno;
//    double cgpa;
//}

    //Ye v kar skte hai
//class Student{ // khudka ek data type bana liya hai           //Student is class
//    String name;
//    int rno;
//    double cgpa;
//}

 */

public class UserDefinedDataTypes {
    public static class Student{ // khudka ek data type bana liya hai           //Student is class
        String name;
        int rno;
        double cgpa;

        void print(){           //Step1: create a method inside student class       ==>> The best
            System.out.println(name+" "+rno+" "+cgpa);
        }
    }
    public static void main(String[] args) {                                    //s1, s2, s3 are objects
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(); // declaration
        s1.name = "Khushi";
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student(); // declaration
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 2.2;

        Student s3 = new Student(); // declaration
        s3.name = "Anagha";
        s3.rno = sc.nextInt();
        s3.cgpa = 9.37;

        System.out.println(s1.name+" "+s1.cgpa+" "+s1.rno);
        s2.cgpa = 9.8;
        System.out.println(s3.rno);

        //Agar kisi particular class ki sari details nikalna ho to Step1: create a method, Step2: Print this method of that class.
        s1.print(); s2.print(); s3.print();         //Step2: Print this method of that class.

//        print(s1); print(s1); print(s1);          //Normal method step2

    }
    public static void print(Student s){          //Normal method step1     //Normal method: we can also use this.  =>This is outside the student class, so it take and extra class    ==>>good
        System.out.println(s.name+" "+s.rno+" "+s.cgpa);
    }       //Agar ye private hota to bahar use nhi kar skte hai.
}



/*
Objects are real life entities and class is a blueprint.
Scanner is a class
sc is an object
Note: Java ke under integer or primitive ko byReference pass nhi kar pate hai.
In java, Integer datatype pass-by-value hota hai.


 */