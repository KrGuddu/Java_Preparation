package Recursion;

public class GlobalVariables {
    static int x=10;                    //This is global variable which is accessible anywhere.     //static means shareable variable
    public static void main(String[] args) {
        change();
        System.out.println(x);
    }

    public static void change(){
        x=20;
    }


    //Accessibility
//    static int x=10;
//    public static void main(String[] args) {
//        x=15;                       //This x is accessible b/q of: Abhi main() ke andar local x declare nahi hua hai. Isliye Java ko jo x milta hai, woh class ka static x hai.
//        System.out.println(x);        //o/p: 15
//        int x=20;                   // yaha par local x declared hua hai
//        System.out.println(x);        //o/p: 20
//        x=30;                       //local x ke karan ise update v kar skte hai
//        System.out.println(x);        //o/p: 30
//    }

}


/*
Preference:
Local variable > static/class variable when both have the same name.

Aur static x ko specifically access karna ho to:
ClassName.x
Eg: System.out.println(Test.x); where Test is a className


static = class ke saath associated, but value change ho sakti hai.      //Class ke saath associated means: static variable object ke saath nahi, balki class ke saath belong karta hai.
final = value change nahi ho sakti.


Normal variable → Object ka hai
static variable → Class ka hai
Eg: static int x = 10;        // ✅ change allowed
    static final int x = 10;  // ❌ change not allowed

 */