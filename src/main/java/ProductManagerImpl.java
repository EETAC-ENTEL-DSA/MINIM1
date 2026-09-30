import models.Order;
import models.Product;
import models.User;

import java.util.*;

public class ProductManagerImpl implements ProductManager {
    private List<Product> productList;
    private Queue<Order> orderQueue;
    private HashMap<String, User> users;


    public ProductManagerImpl() {
        productList = new ArrayList<>();
        orderQueue = new LinkedList<>();
    }

    @Override
    public void addProduct(String id, String name, double price) {
        productList.add(new Product(id, name, price));
    }

    @Override
    public List<Product> getProductsByPrice() {
        return productList;
    }

    @Override
    public List<Product> getProductsBySales() {
        return productList;
    }

    @Override
    public void addOrder(Order order) {
        orderQueue.add(order);

    }

    @Override
    public int numOrders() {
        return 0;
    }

    @Override
    public int numUsers() {
        return 0;
    }

    @Override
    public Order deliverOrder() {
        Order order = orderQueue.poll();
        // TO-DO
        return order;
    }


    public Product getProduct(String id) {
        /*
        for (Product product : productsList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
        */

        return productList.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public User getUser(String number) {
        return null;
    }

    @Override
    public int numProducts() {
        return productList.size();
    }

    @Override
    public void addUser(String nif, String name, String surname, String mail) {
        //
    }
}
