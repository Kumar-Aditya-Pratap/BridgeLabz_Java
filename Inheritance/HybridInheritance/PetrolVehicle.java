/* Petrol vehicle implementing refuel */
class PetrolVehicle extends HybridVehicle implements Refuelable {
    public void refuel() {
        System.out.println("Refueling petrol vehicle");
    }
}
