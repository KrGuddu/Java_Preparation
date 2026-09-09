package OOPs;

class ComplexNumber{
    double x;
    double y;
    ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;
    }
    ComplexNumber(){

    }
    void print(){
        if(y>=0) System.out.println(x+ " + " + y + "i");
        else System.out.println(x+ " - " + (-y) + "i");
    }

    void add(ComplexNumber z) {
        x += z.x;       //or, this.x += z.x;        //means: x me z.x add karo
        y += z.y;       //or, this.y += z.y;        //means: y me z.y add karo
    }

    void multiply(ComplexNumber z) {
        x = x*z.x - y*z.y;
        y = x*z.y + y*z.x;
    }

    void divide(ComplexNumber z) {              //Always remember in division method must take input in double datatype.            //H.W.

    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2,-5);
        ComplexNumber z2 = new ComplexNumber(3,4);
        z1.print(); z2.print();
        z1.add(z2);     //Alter v ho jata hai.
        z1.print(); z2.print();
        z2.multiply(z1);
        z1.print(); z2.print();
    }
}
