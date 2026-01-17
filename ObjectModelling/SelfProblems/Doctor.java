/* This class represents a Doctor communicating with Patients */
class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        System.out.println(name + " is consulting " + patient.name);
    }
}
