package OOPs;
class Fraction{
    int num;
    int den;
    Fraction(int num, int den){
        this.num = num;
        this.den = den;
        simplify();
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(Fraction f){
        num = num * f.den + den * f.num;
        den = den * f.den;
        simplify();
    }
    void subtract(){
                                        //H.W.
    }
    void multiply(Fraction f){
        this.num = this.num * f.num ;
        this.den = this.den * f.den;
        simplify();
    }
    void divide(Fraction f){
        num = num * f.den ;
        den = den * f.num;
        simplify();
    }

    void simplify(){
        boolean isNegative = (num*den < 0) ? true : false;
        num = Math.abs(num);
        den = Math.abs(den);
        int gcd = hcf(num,den);
        num = num/gcd;
        den = den/gcd;
        if(isNegative) num = -num;
    }
    int hcf(int a, int b){          //this is for simplify
        if(a==0) return b;
        return hcf(b%a,a);
    }
}
public class Fraction_In_Opps {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,-7);
        f1.print();
        Fraction f2 = new Fraction(7,3);
        f1.add(f2);
        f1.print();

        f1.multiply(f2);
        f1.print();

        Fraction f3 = new Fraction(-50,-100);
        f3.print();
    }
}

//divide 2nd method: by inverse method
//subtract          ==>H.W.
//simplyfy: 3:24:20
//Abstraction means data hiding
//Encapsulation: hide karke sing capsule me dal dena.