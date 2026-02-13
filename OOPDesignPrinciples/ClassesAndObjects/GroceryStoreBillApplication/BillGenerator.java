package OOPDesignPrinciples.ClassesAndObjects.GroceryStoreBillApplication;
public class BillGenerator {

    /*
     This class is responsible for generating the final bill
     for a customer. It interacts with Customer and Product
     objects to compute the total purchase amount.
    */

    // Calculates total bill amount
    public double generateBill(Customer customer) {
        double total = 0;

        // Iterate through products to compute total cost
        for (Product product : customer.getProducts()) {
            total += product.calculateTotalPrice();
        }

        return total;
    }

    public static void main(String[] args) {
        // Create product objects
        Product apples = new Product("Apples", 2, 3);
        Product milk = new Product("Milk", 1, 2);

        // Create customer with products
        Customer customer =
                new Customer("Alice", new Product[]{apples, milk});

        // Generate bill
        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.generateBill(customer);

        // Display bill
        System.out.println("Customer Name: " + customer.name);
        System.out.println("Total Bill Amount: $" + totalBill);
    }
}
