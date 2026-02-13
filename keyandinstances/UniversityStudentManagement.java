package KeyAndInstances;
public class UniversityStudentManagement {

    /*
     This program manages university student data using static variables
     for shared university information, final variables for roll numbers,
     and instanceof checks for safe object handling.
    */

    // Static variable shared across all students
    static String universityName = "VTU";

    // Static counter for total students
    static int totalStudents = 0;

    // Final variable ensures roll number cannot change
    final int rollNumber;

    // Instance variables for student details
    String name;
    char grade;

    // Constructor initializes student information
    public UniversityStudentManagement(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment student count
    }

    // Static method displays total number of students
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Method displays student details after validation
    void displayStudentDetails(Object obj) {
        // Check object type before accessing data
        if (obj instanceof UniversityStudentManagement) {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        // Create student object
        UniversityStudentManagement student =
                new UniversityStudentManagement("Kiran", 301, 'A');

        // Display student information
        student.displayStudentDetails(student);

        // Display total students
        displayTotalStudents();
    }
}
