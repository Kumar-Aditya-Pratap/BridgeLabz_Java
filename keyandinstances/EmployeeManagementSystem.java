package KeyAndInstances;
public class EmployeeManagementSystem {

    /*
     This program demonstrates an employee management system that uses
     static variables for shared company data, final variables for fixed
     employee IDs, and instanceof for secure object handling.
    */

    // Static variable shared by all employees
    static String companyName = "BridgeLabz";

    // Static counter for total employees
    static int totalEmployees = 0;

    // Final variable ensures employee ID is immutable
    final int employeeId;

    // Instance variables for employee details
    String name;
    String designation;

    // Constructor initializes employee information
    public EmployeeManagementSystem(String name, int employeeId, String designation) {
        this.name = name;
        this.employeeId = employeeId;
        this.designation = designation;
        totalEmployees++; // Increment employee count
    }

    // Static method to display total employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method displays employee details after validation
    void displayEmployeeDetails(Object obj) {
        // Verify object type using instanceof
        if (obj instanceof EmployeeManagementSystem) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        // Create employee object
        EmployeeManagementSystem employee =
                new EmployeeManagementSystem("Anita", 501, "Developer");

        // Display employee information
        employee.displayEmployeeDetails(employee);

        // Display total employees
        displayTotalEmployees();
    }
}
