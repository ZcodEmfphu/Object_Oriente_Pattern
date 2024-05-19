package lab9.a.ex1;

import java.util.ArrayList;

public class PancakeHouseMenu {
	private ArrayList menuItems;

	public PancakeHouseMenu() {
		super();
		menuItems = new ArrayList();

		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
		menuItems.add(menuItem);
	}

	public ArrayList getMenuItems() {
		return menuItems;
	}

	public String toString() {
		return "Objectville Pancake House Menu";
	}
}
