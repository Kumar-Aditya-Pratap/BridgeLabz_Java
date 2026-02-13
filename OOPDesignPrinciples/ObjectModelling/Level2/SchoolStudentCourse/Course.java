package OOPDesignPrinciples.ObjectModelling.Level2.SchoolStudentCourse;
public class Course {

    /*
     This class represents a course offered in a school.
     A course has its own identity and can exist independently
     of students or schools, making it suitable for aggregation.
    */

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Displays course name
    public void displayCourse() {
        System.out.println("Course: " + courseName);
    }
}
