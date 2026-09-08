package OOPs;

public class PassingClassesToMethods {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){   //class ko as a user define datatype to dekha hai but class as a user define data structure v ban sakti hai.            //isme "public static" likh v skat hai or na v likhe to koe issue nhi hogi, qki ye already "public static" ke under hai.
            System.out.println(seats+" "+name+" "+length+"m "+type+" "+torque+"nm ");
        }
    }

    public static void main(String[] args) {
//        Student s = new Student();        //This is for UserDefinedDataTypes

        Car c = new Car();
        c.length = 3.99;
        c.name = "Kia Sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";

        change(c);

        System.out.println(c.seats);
        c.print();      //Agar kisi particular object ki sari details print karani ho to method create karke print kar skte hai.
    }

    public static void change(Car c) {          //Note: Agar c ki jagah x kar de to v same things hi hogi (Means: same object(Car) ko hi point karega, koe new object create nhi hoga.)
        c.seats = 4;        //Object ko function me bhejta hu to wo pass by reference hota hai.
    }                                                   //Agar ye private hota to bahar use nhi kar skte hai.
}
