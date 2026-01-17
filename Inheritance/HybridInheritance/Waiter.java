/* Waiter class implementing Worker */
class Waiter extends RestaurantPerson implements Worker {
    public void performDuties() {
        System.out.println("Waiter is serving food");
    }
}
