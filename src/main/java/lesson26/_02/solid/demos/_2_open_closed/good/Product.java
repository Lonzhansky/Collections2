package lesson26._02.solid.demos._2_open_closed.good;

public abstract class Product {

	private String name;
	private String type;
	private double price;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract double calculatePriceWithTax();

}
