/* This class represents a Student associated with multiple Courses */
import java.util.ArrayList;

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course); // enrolls student
    }
}

