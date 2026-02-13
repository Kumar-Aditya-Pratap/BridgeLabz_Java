package OOPDesignPrinciples.ObjectModelling.Level2.UniversityManagement;
public class University {

    /*
     This class represents a university composed of departments.
     When the university ceases to exist, its departments
     and faculty members also cease to exist.
    */

    public static void main(String[] args) {
        // Creating department
        Department csDept = new Department();

        // Adding faculty to department
        csDept.addFaculty(new Faculty("Dr. Rao"));
        csDept.addFaculty(new Faculty("Dr. Mehta"));

        // Displaying university structure
        csDept.showFaculty();
    }
}
