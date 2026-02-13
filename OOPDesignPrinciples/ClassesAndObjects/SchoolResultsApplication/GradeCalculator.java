package OOPDesignPrinciples.ClassesAndObjects.SchoolResultsApplication;
public class GradeCalculator {

    /*
     This class is responsible for processing student data
     and calculating the final grade based on marks obtained
     in multiple subjects. It interacts with Student and
     Subject objects to perform computations.
    */

    // Calculates average marks of a student
    public double calculateAverage(Student student) {
        int totalMarks = 0;

        // Iterate through subjects to sum marks
        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.marks;
        }

        return totalMarks / (double) student.getSubjects().length;
    }

    // Determines grade based on average marks
    public char determineGrade(double average) {
        if (average >= 85) return 'A';
        else if (average >= 70) return 'B';
        else if (average >= 50) return 'C';
        else return 'D';
    }

    public static void main(String[] args) {
        // Create subject objects
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Create student with subjects
        Student student =
                new Student("John", new Subject[]{maths, science});

        // Create grade calculator
        GradeCalculator calculator = new GradeCalculator();

        // Compute results
        double average = calculator.calculateAverage(student);
        char grade = calculator.determineGrade(average);

        // Display output
        System.out.println("Student Name: " + student.name);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
