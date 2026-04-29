abstract class Vehicle {
    abstract String fuelType();
    abstract int    noOfWheels();

    void displayInfo() {
        System.out.println("Fuel Type : " + fuelType());
        System.out.println("No. of Wheels: " + noOfWheels());
    }
}

class Car extends Vehicle {
    @Override
    public String fuelType()   { return "Petrol/Diesel"; }
    @Override
    public int    noOfWheels() { return 4; }
}

class Bike extends Vehicle {
    @Override
    public String fuelType()   { return "Petrol"; }
    @Override
    public int    noOfWheels() { return 2; }
}

public class Pr18 {
    public static void main(String[] args) {
        System.out.println("--- Car ---");
        Vehicle car = new Car();
        car.displayInfo();

        System.out.println("\n--- Bike ---");
        Vehicle bike = new Bike();
        bike.displayInfo();
    }
}