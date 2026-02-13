package OOPDesignPrinciples.ObjectModelling.Level2.HospitalManagement;
public class Hospital {

    /*
     This class represents a hospital that facilitates
     interaction between doctors and patients through
     association without ownership.
    */

    public static void main(String[] args) {
        // Creating doctor and patient
        Doctor doctor = new Doctor("Dr. Sharma");
        Patient patient = new Patient("Anita");

        // Doctor consulting patient
        doctor.consult(patient);
    }
}
