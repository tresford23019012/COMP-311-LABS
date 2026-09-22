// TRESFORD CHIPILI 23019012
// QUESTION 9: OVERLOADING AND OVERRIDING TOGETHER

class Vehicle {
    void describe() { // no-argument version
        System.out.println("This is a generic vehicle.");
    }

    void describe(String name) { // overloaded: same name, different parameter list
        System.out.println("This vehicle is called " + name + ".");
    }
}

class Taxi extends Vehicle {
    @Override
    void describe() { // overriding: replaces Vehicle's no-argument version for Taxi objects
        System.out.println("This is a combi taxi running the Gaborone route.");
    }
}

public class Question9 {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle();
        genericVehicle.describe();            // overloaded version 1
        genericVehicle.describe("Toyota Hilux"); // overloaded version 2

        Vehicle myTaxi = new Taxi(); // declared as Vehicle, but Taxi's overridden method runs
        myTaxi.describe();
    }
}