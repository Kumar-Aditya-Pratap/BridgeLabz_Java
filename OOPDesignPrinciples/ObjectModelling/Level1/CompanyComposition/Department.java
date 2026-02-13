package OOPDesignPrinciples.ObjectModelling.Level1.CompanyComposition;
import java.util.ArrayList;

public class Department {

    /*
     This class represents a Department inside a company.
     Departments own their employees, making this a
     composition relationship.
    */

    private ArrayList<Employee> employees = new ArrayList<>();

    // Adds employee to department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Displays department employees
    public void showEmployees() {
        for (Employee emp : employees) {
            emp.showEmployee();
        }
    }
}
