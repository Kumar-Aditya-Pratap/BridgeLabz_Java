/* This class represents a School aggregating Students */
import java.util.ArrayList;

class School {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student); // adds student
    }
}
