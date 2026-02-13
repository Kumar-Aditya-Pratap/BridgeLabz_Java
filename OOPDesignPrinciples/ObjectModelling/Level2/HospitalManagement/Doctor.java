package OOPDesignPrinciples.ObjectModelling.Level2.HospitalManagement;
public class Doctor {

    /*
     This class represents a doctor working in a hospital.
     Doctors and patients interact through association,
     but neither controls the lifecycle of the other.
    */

    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    // Consults a patient
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting:");
        patient.showPatient();
    }
}
