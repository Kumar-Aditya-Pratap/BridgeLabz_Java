/* Chef class implementing Worker */
class Chef extends RestaurantPerson implements Worker {
    public void performDuties() {
        System.out.println("Chef is cooking");
    }
}
