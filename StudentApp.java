import java.util.Scanner;
// Class to hold student records
public class StudentRecord {
    private String name;      // Student's name
    private String studentId; // Student's ID
    private String course;    // Student's course

    // Constructor to initialize student details
    public StudentRecord(String name, String studentId, String course) {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
    }

    // Method to display student information
    public void displayInformation() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}




public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        // Prompt user for student details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine(); 

         // Read name input from user

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();  // Read student ID input from user

        System.out.print("Enter Student Course: ");
        String course = scanner.nextLine();  // Read course input from user

        
        StudentRecord student = new StudentRecord(name, studentId, course);

        // Display student details
        System.out.println("\nStudent Details:");
        student.displayInformation();

        scanner.close();  // Close the scanner
    }
}
