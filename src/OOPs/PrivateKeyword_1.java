package OOPs;
import java.util.Scanner;

class Students{
    //When all are public
//    String name;          // null
//    int rno;              // 0
//    double cgpa;          // 0.0
//    void print(){         // getter
//        System.out.println(name+" "+cgpa+" "+rno);
//    }

    //When any variable is private
//    String name; // null
//    private int rno; // 0
//    double cgpa; // 0.0
//    void print(){ // getter
//        System.out.println(name+" "+cgpa+" "+rno);
//    }

    //When method is private
//    String name; // null
//    int rno; // 0
//    double cgpa; // 0.0
//    private void print(){ // getter
//        System.out.println(name+" "+cgpa+" "+rno);
//    }

    //If method is private but i want to access of private method so need to create an another method and then call private method inside this method. And then call it in Main method.
    String name; // null
    int rno; // 0
    double cgpa; // 0.0
    private void print(){ // getter
        System.out.println(name+" "+cgpa+" "+rno);
    }
    void p(){
        print();
    }



//    private void print(){ // getter
//        System.out.println(name+" "+cgpa+" "+rno);
//    }
//
//    void p(){
//        void();
//    }
}
public class PrivateKeyword_1 {
    public static void main(String[] args) {
        Students s1 = new Students();

//         s1.print();    //Accessible when method and properties are public.     //O/P: null 0.0 0      => These are default values.

        //When any property is private
        s1.cgpa = 8.9;
        s1.name = "Hemant";
        s1.rno = 45;        //Not Accessible    //error: rno has private access


//        s1.print();     //Not Accessible: print() method has private access

        s1.p();     //Accessible    //o/p: Hemant 8.9 45


//        s1.setRno(45);
//        System.out.println(s1.getRno());

//        StringBuilder sb = new StringBuilder(sc.nextLine());
//        System.out.println(sb);
    }
}
