package OOPDesignPrinciples.ObjectModelling.Level2.HospitalManagement;
public class Patient {

    /*
     This class represents a patient in a hospital.
     A patient exists independently and can consult
     different doctors, showing association.
    */

    private String name;

    public Patient(String name) {
        this.name = name;
    }

    // Displays patient name
    public void showPatient() {
        System.out.println("Patient Name: " + name);
    }
}
