
/* This class represents an Order aggregating Products */
import java.util.ArrayList;

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }
}
