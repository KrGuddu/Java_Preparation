//We can use getter and setter method for private attributes

package OOPs;

class Students{
    String name;
    private int rno;
    double cgpa;
    void print(){   //This is also getter
        System.out.println(name+" "+cgpa+" "+rno);
    }
    int getRno(){   //This is getter method
        return rno;     //Means: roll number ko get kiya
    }
    void setRno(int x){ //This is setter method
        rno = x;        //Means: roll number ko set kiya   //Working: ek integer type number x ko receive karega and set rno me set karega.
    }
}

public class PrivateKeyword_getter_setter {
    public static void main(String[] args) {
        Students s1 = new Students();

        // s1.print();      //This is print default value

        s1.cgpa = 8.9;
        s1.name = "Hemant";
//        s1.rno = 45;         //error: roll number private hone ke karan set nhi ho paa rhe hai.
        s1.setRno(45);        //By setter method we can set private variable like roll number.
        System.out.println(s1.getRno());        //o/p is 0 =>This is default value.


    }
}


//class and class ke under likhe process ko encapsulation kahte hai. Here class name "Students" is a encapsulation