package lesson26._02.grasp.demos._2_creator.good;

public class OrderItem {

    private final Product product;
    private final int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public OrderItem(int quantity, String name, double price) {
        this.quantity = quantity;
        this.product = new Product(name, price);
    }

    public double getItemCost() {
        return quantity * product.getPrice();
    }
}
