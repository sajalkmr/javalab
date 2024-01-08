package sajal;

import java.util.Scanner; // Import Scanner class for user input

public class Employee {
    private int employeeId;
    private String employee_name; // Updated variable name
    private double employee_salary; // Updated variable name

    // Constructor to initialize Employee object with provided details
    public Employee(int employeeId, String employee_name, double employee_salary) {
        this.employeeId = employeeId;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    // Method to raise the salary by a given percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            this.employee_salary += this.employee_salary * (percent / 100);
        }
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Name: " + this.employee_name);
        System.out.println("Salary: $" + String.format("%.2f", this.employee_salary));
        System.out.println();
    }

    // Main method where the program starts execution
    public static void main(String[] args) {
        // Creating an employee object
        Employee employee1 = new Employee(1, "John Doe", 50000.0);
        Scanner sc = new Scanner(System.in);

        // Displaying initial details
        System.out.println("Initial Employee Details:");
        employee1.displayDetails();

        // Prompt user for raise percentage
        System.out.println("Enter the raise percentage of employee:");
        int raisePercentage = sc.nextInt();
        employee1.raiseSalary(raisePercentage);

        // Displaying updated details
        System.out.println("Employee Details After Raise:");
        employee1.displayDetails();
        sc.close();
    }
}
