package KeyAndInstances;
public class ShoppingCartSystem {

    /*
     This program simulates a shopping cart system using static variables
     for shared discount values, final variables for product identity,
     and instanceof checks for safe object processing.
    */

    // Static variable shared across all products
    static double discountPercentage = 10.0;

    // Final variable ensures product ID remains constant
    final int productId;

    // Instance variables for product details
    String productName;
    double price;
    int quantity;

    // Constructor initializes product information
    public ShoppingCartSystem(String productName, double price, int quantity, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    // Static method updates discount value
    static void updateDiscount(double newDiscount) {
        discountPercentage = newDiscount;
    }

    // Method displays product details safely
    void displayProductDetails(Object obj) {
        // Ensure correct object type
        if (obj instanceof ShoppingCartSystem) {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discountPercentage + "%");
        }
    }

    public static void main(String[] args) {
        // Create shopping cart item
        ShoppingCartSystem product =
                new ShoppingCartSystem("Laptop", 60000, 1, 9001);

        // Update shared discount
        updateDiscount(15);

        // Display product details
        product.displayProductDetails(product);
    }
}
