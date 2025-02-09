class Vehicle {
    // Create attributes
    protected String brand;
    protected int speed;

    // Create method to accelerate
    public void accelerate(int increase) {
        speed += increase;
    }

    // Method to brake
    public void brake(int decrease) {
        speed = Math.max(0, speed - decrease);
    }

    // Method to show details
    public void showDetails() {
        System.out.println("Vehicle brand: " + brand + ", Speed: " + speed);
    }
}

// Create subclass Car
class Car extends Vehicle {
    protected int fuelLevel;

    public void refuel(int amount) {
        fuelLevel = Math.min(100, fuelLevel + amount);
    }

    @Override
    public void showDetails() {
        System.out.println("Vehicle brand: " + brand + ", Speed: " + speed + ", Fuel Level: " + fuelLevel + "%");
    }
}

// Create class Bike
class Bike extends Vehicle {
    boolean helmetOn;

    public void wearHelmet() {
        helmetOn = true;
    }

    @Override
    public void showDetails() {
        System.out.println("Bike brand: " + brand + ", Speed: " + speed + ", Helmet On: " + helmetOn);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        // Display car information
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 60;
        myCar.fuelLevel = 50;
        myCar.accelerate(20);
        myCar.brake(30);
        myCar.refuel(30);
        myCar.showDetails();

        // Display bike information
        Bike myBike = new Bike();
        myBike.brand = "Yamaha";
        myBike.speed = 40;
        myBike.helmetOn = false;
        myBike.accelerate(15);
        myBike.brake(10);
        myBike.wearHelmet();
        myBike.showDetails();
    }
}
