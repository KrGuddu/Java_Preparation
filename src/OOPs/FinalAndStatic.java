package OOPs;

//================================= final variable ==============================
//class Cricketer{
//    final String country = "India";
//    int runs;
//    String name;
//    double avg;
//}
//public class FinalAndStatic {
//    public static void main(String[] args) {
//        Cricketer c1 = new Cricketer();
////        c1.country = "England";      //Error: Cannot assign a value to final variable.
//        System.out.println(c1.country);
//        Cricketer c2 = new Cricketer();
//        System.out.println(c2.country);
//    }
//}


//================================= static variable ==============================
//Static: means, shareable variable. static keyword na lagane se kahi v shareable nhi hogi.
class Cricketer{            //yaha par final lagane se class immutable ban jayega.
    static String country = "NZ";
    int runs;
    String name;
    double avg;
//    void print(){
//        System.out.println(runs+" "+name+" "+avg);
//    }
//    static void greet(){
//        System.out.println("I only believe in Jassi bhai");
//    }
}
public class FinalAndStatic {
    public static void main(String[] args) {
//        Cricketer.greet();
        System.out.println(Cricketer.country);
        Cricketer c1 = new Cricketer();
        c1.country = "India";       //in static variable we can change/assign value.
        Cricketer c2 = new Cricketer();
        System.out.println(c2.country);     //o/p is India b/q c1.country = "India"; is change country name in static variable.
//        c2.greet();
    }
}