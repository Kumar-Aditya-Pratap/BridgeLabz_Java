package OOPDesignPrinciples.ClassesAndObjects.GroceryStoreBillApplication;

public class Customer {

    /*
     This class represents a customer in the grocery store system.
     A customer purchases multiple products, and these products
     are later used to generate the final bill.
    */

    // Customer name
    String name;

    // Products purchased by the customer
    Product[] products;

    // Initializes customer with products
    public Customer(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    // Returns products for bill generation
    public Product[] getProducts() {
        return products;
    }
}
