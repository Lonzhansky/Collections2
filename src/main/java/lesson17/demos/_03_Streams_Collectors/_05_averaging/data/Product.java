package lesson17.demos._03_Streams_Collectors._05_averaging.data;

public class Product {

    private final String name;
    private final String category;
    private final double cost;

    public Product(String name, String category, double cost) {
        this.name = name;
        this.category = category;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

}
