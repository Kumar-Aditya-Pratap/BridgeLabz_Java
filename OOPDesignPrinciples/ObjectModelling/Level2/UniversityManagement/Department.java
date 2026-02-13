package OOPDesignPrinciples.ObjectModelling.Level2.UniversityManagement;
import java.util.ArrayList;

public class Department {

    /*
     This class represents a department within a university.
     Departments own faculty members, demonstrating
     a composition relationship.
    */

    private ArrayList<Faculty> facultyList = new ArrayList<>();

    // Adds faculty to department
    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    // Displays department faculty
    public void showFaculty() {
        for (Faculty faculty : facultyList) {
            faculty.displayFaculty();
        }
    }
}
