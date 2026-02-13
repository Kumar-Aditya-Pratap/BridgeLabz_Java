package OOPDesignPrinciples.ClassesAndObjects.SchoolResultsApplication;


public class Student {

    /*
     This class represents a student in the School Results Application.
     A student has a name and is associated with multiple subjects.
     The student object acts as an aggregate root that holds subject
     information used for grade calculation.
    */

    // Stores student name
    String name;

    // Stores subjects associated with the student
    Subject[] subjects;

    // Initializes student with name and subjects
    public Student(String name, Subject[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    // Returns subjects for grade calculation
    public Subject[] getSubjects() {
        return subjects;
    }
}
