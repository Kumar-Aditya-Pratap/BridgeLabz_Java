package OOPDesignPrinciples.ObjectModelling.Level1.CompanyComposition;
public class Employee {

    /*
     This class represents an Employee within a department.
     Employees cannot exist independently outside the company
     structure, supporting composition modeling.
    */

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    // Displays employee name
    public void showEmployee() {
        System.out.println("Employee: " + name);
    }
}
