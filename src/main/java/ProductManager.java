import models.Order;
import models.Product;
import models.User;

import java.util.List;

public interface ProductManager {

    void addUser(String nif, String name, String surname, String mail);
    void addProduct(String id, String name, double price);
    void addOrder(Order order);

    List<Product> getProductsByPrice();
    List<Product> getProductsBySales();
    Order deliverOrder();

    Product getProduct(String id);
    User getUser(String number);

    int numOrders();
    int numUsers();
    int numProducts();
}
