package OOPDesignPrinciples.ObjectModelling.Level2.UniversityManagement;
public class Faculty {

    /*
     This class represents a faculty member within a department.
     Faculty members cannot exist independently outside
     the department, supporting composition.
    */

    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    // Displays faculty name
    public void displayFaculty() {
        System.out.println("Faculty: " + name);
    }
}
