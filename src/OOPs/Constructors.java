package OOPs;

public class Constructors {     //Constructor is also a method
    public static class Car{
        int price; // 0
        String name; // null
        Car(){ // default constructor which name same as class name

        }
        Car(int price, String name){    //parametrized constructor: jisme parameters ho.
            this.price = price;
            this.name = name;
        }
        Car(String s, int x){
            this.price = x;
            name = s;
        }
//        Car(int x, String s, int seats){
//
//            this.price = x;
//            name = s;
//            this.seats = seats;
//        }

        void print(){
            int price = 12;
            System.out.println(this.price+" "+name);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(1250000,"Kia Sonet");      //It point [int price, String name]     //This is reference of constructor
        c1.print();

        Car c2 = new Car("Lord Alto",400000);             //It point [String s, int x]      //order/sequence is matter in constructor
        c2.print();

        Car c3 = new Car();             //It point default constructor   //parametrized constructor rahne par ye error dena but default me nhi dega. //isme koe v parameter nhi hai. so ye without parameter bala, parameter bala ko access nhi kar payega. This is known as constructor overloading.
        c3.name = "Honda Amaze";

//        Car c4 = new Car("BMW", 1000000, 2);
//        c4.price();
    }
}



//Note: order/sequence is matter in constructor