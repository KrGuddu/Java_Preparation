package OOPs;

//Multilevel Inheritance
class Vehicle{
    int wheels;
    int speed;
    int seats;
}
class PowerVehicle extends Vehicle{
    int engine;
}
class AirCrafts extends PowerVehicle{
    int rotors;
}


//Hierarchical Inheritance
class Animal{
    int size;
    boolean isVegetarian;
}
class Birds extends Animal{
    int maximumAltitude;
}
class AquaticAnimals extends Animal{
    int fins;
}


public class Inheritance {
    public static void main(String[] args) {
        Vehicle cycle = new Vehicle();
    }
}



/*
📂 Types of Inheritance Supported in Java: Java categorizes inheritance into different types based on how classes interact:
[1] (https://www.geeksforgeeks.org/java/inheritance-in-java/)

Type                               Structure                   Description
1. Single Inheritance              A -> B                      A subclass inherits from exactly one superclass.
2. Multilevel Inheritance          A -> B -> C                 A class inherits from a subclass, forming a chain of inheritance.
3. Hierarchical Inheritance        A -> B and A -> C           Multiple subclasses inherit from a single superclass.
4. Multiple Inheritance            A & B -> C                  One class inherits from more than one superclass. Not supported via classes to avoid ambiguity (the Diamond Problem), but achievable via Interfaces.

 */