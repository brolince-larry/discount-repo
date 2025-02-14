import java.util.Scanner;

public class ShowRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        // Prompt user for car details
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();   // Read brand input from user

        System.out.print("Enter Model: ");
        String model = scanner.nextLine();   // Read model input from user

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();  // Read year input from user
        scanner.nextLine();  // Consume the leftover newline character

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();   // Read fuel type input from user

        // Create Car object
        Car car = new Car(brand, model, year, fuelType);

        // Display car details
        System.out.println("\nCar Details:");
        car.displayDetails();

        scanner.close();  
    }
}
