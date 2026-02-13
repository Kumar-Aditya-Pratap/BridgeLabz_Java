package KeyAndInstances;
public class VehicleRegistrationSystem {

    /*
     This program models a vehicle registration system using static variables
     for shared registration fees, final variables for registration numbers,
     and instanceof checks to ensure safe access to vehicle details.
    */

    // Static variable shared across all vehicles
    static double registrationFee = 5000;

    // Final variable ensures registration number is immutable
    final String registrationNumber;

    // Instance variables for vehicle details
    String ownerName;
    String vehicleType;

    // Constructor initializes vehicle information
    public VehicleRegistrationSystem(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method updates registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method safely displays vehicle details
    void displayVehicleDetails(Object obj) {
        // Verify object type
        if (obj instanceof VehicleRegistrationSystem) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        // Create vehicle object
        VehicleRegistrationSystem vehicle =
                new VehicleRegistrationSystem("Suresh", "Car", "KA01AB1234");

        // Update registration fee
        updateRegistrationFee(6000);

        // Display vehicle information
        vehicle.displayVehicleDetails(vehicle);
    }
}
