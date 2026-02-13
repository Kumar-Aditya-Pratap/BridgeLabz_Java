package OOPDesignPrinciples.ObjectModelling.Level2.SchoolStudentCourse;
public class Student {

    /*
     This class represents a student enrolled in a school.
     A student can take multiple courses, but courses can
     exist independently of the student.
    */

    private String name;
    private Course[] courses;

    public Student(String name, Course[] courses) {
        this.name = name;
        this.courses = courses;
    }

    // Displays student details
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        for (Course course : courses) {
            course.displayCourse();
        }
    }
}
