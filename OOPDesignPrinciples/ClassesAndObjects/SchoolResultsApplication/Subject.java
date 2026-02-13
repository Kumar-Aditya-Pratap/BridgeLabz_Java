package OOPDesignPrinciples.ClassesAndObjects.SchoolResultsApplication;
public class Subject {

    /*
     This class represents a subject taken by a student.
     Each subject stores its name and marks obtained.
     Subject objects are aggregated inside the Student class.
    */

    // Subject name
    String subjectName;

    // Marks obtained in the subject
    int marks;

    // Initializes subject details
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }
}
