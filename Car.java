// Base class Vehicle
public class Vehicle {
    protected String brand;   // Brand of the vehicle
    protected String model;   // Model of the vehicle
    protected int year;       // Manufacturing year of the vehicle

    // Constructor to initialize the Vehicle object
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display the details of the vehicle
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Derived class Car that extends the Vehicle class
public class Car extends Vehicle {
    private String fuelType;  // Fuel type of the car

    // Constructor to initialize the Car object
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);  // Call the superclass constructor
        this.fuelType = fuelType;   // Initialize fuelType
    }

    // Overridden method to display the details of the car
    @Override
    public void displayDetails() {
        super.displayDetails();   // Call the superclass method
        System.out.println("Fuel Type: " + fuelType);
    }
}



