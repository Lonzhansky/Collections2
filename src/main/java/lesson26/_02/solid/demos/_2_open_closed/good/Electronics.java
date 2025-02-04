package lesson26._02.solid.demos._2_open_closed.good;

public class Electronics extends Product {

    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Підрахунок суми за категорією (ціна + податок з продажів + поштовий податок)
    @Override
    public double calculatePriceWithTax() {
        return getPrice() + getPrice() * 15 / 100  + getPrice() * 3 / 100;
    }
}
