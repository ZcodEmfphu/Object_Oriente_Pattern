package lab9.a.ex1;

public class MenuItem {

	private String name;
	private String decription;
	private double price;
	private boolean vegetarian;

	public MenuItem(String name, String decription, double price, boolean vegetarian) {
		super();
		this.name = name;
		this.decription = decription;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

}
