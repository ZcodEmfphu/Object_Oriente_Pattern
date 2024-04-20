package lab6.pizzaFactoryMethod;

import java.util.ArrayList;

public class ChicagoCheesePizza extends Pizza {

	public ChicagoCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		topping.add("Shredded Mozzarella Cheese");
	}

	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
