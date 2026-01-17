/* This class represents a University composed of Departments */
import java.util.ArrayList;

class University {
    ArrayList<UniDepartment> departments = new ArrayList<>();

    void addDepartment(String name) {
        departments.add(new UniDepartment(name));
    }
}
