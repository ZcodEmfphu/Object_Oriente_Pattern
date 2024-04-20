package lab6.pizzaSimpleFactory;

import java.util.ArrayList;

public class CheesePizza extends Pizza {

	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		topping.add("Fresh Mozzarella");
		topping.add("Parmesan");
	}

}
