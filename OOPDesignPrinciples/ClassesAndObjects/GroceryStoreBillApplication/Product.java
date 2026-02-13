package OOPDesignPrinciples.ClassesAndObjects.GroceryStoreBillApplication;
public class Product {

    /*
     This class represents a product purchased in a grocery store.
     Each product contains quantity and price information which
     is used to calculate the total cost.
    */

    // Product name
    String productName;

    // Quantity purchased
    double quantity;

    // Price per unit
    double pricePerUnit;

    // Initializes product details
    public Product(String productName, double quantity, double pricePerUnit) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Calculates total price for the product
    public double calculateTotalPrice() {
        return quantity * pricePerUnit;
    }
}
