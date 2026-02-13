package KeyAndInstances;
public class HospitalManagementSystem {

    /*
     This program represents a hospital management system where static
     variables maintain shared hospital data, final variables ensure
     immutable patient IDs, and instanceof checks allow safe access
     to patient information.
    */

    // Static variable shared across all patients
    static String hospitalName = "City Hospital";

    // Static counter for total patients
    static int totalPatients = 0;

    // Final variable ensures patient ID remains constant
    final int patientId;

    // Instance variables for patient details
    String name;
    int age;
    String ailment;

    // Constructor initializes patient information
    public HospitalManagementSystem(String name, int age, String ailment, int patientId) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatients++; // Increment patient count
    }

    // Static method displays total patients
    static void displayTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Method displays patient details after validation
    void displayPatientDetails(Object obj) {
        // Ensure object belongs to HospitalManagementSystem
        if (obj instanceof HospitalManagementSystem) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientId);
        }
    }

    public static void main(String[] args) {
        // Create patient object
        HospitalManagementSystem patient =
                new HospitalManagementSystem("Meena", 45, "Fever", 7001);

        // Display patient information
        patient.displayPatientDetails(patient);

        // Display total patients
        displayTotalPatients();
    }
}
