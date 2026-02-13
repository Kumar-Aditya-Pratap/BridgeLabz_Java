package OOPDesignPrinciples.ObjectModelling.Level2.SchoolStudentCourse;
public class School {

    /*
     This class represents a school that aggregates students.
     The school does not control the lifecycle of students or
     courses, clearly demonstrating aggregation.
    */

    public static void main(String[] args) {
        // Creating course objects
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Creating student with courses
        Student student =
                new Student("Rahul", new Course[]{math, science});

        // Displaying school enrollment details
        student.displayStudentInfo();
    }
}
