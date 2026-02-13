package OOPDesignPrinciples.ObjectModelling.Level1.CompanyComposition;
import java.util.ArrayList;

public class Company {

    /*
     This class represents a Company composed of departments.
     When the company is removed, all departments and employees
     are also removed, clearly demonstrating composition.
    */

    private ArrayList<Department> departments = new ArrayList<>();

    // Adds department to company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    public static void main(String[] args) {
        // Creating company
        Company company = new Company();

        // Creating department
        Department itDept = new Department();
        itDept.addEmployee(new Employee("John"));
        itDept.addEmployee(new Employee("Emma"));

        // Adding department to company
        company.addDepartment(itDept);

        // Displaying structure
        itDept.showEmployees();
    }
}
