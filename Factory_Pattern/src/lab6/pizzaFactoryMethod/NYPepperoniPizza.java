package lab6.pizzaFactoryMethod;

public class NYPepperoniPizza extends Pizza {

	public NYPepperoniPizza() {
		name = "NY Style Pepperoni Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
	
		topping.add("Grated Reggiano Cheese");
		topping.add("Sliced Pepperoni");
		topping.add("Garlic");
		topping.add("Onion");
		topping.add("Mushrooms");
		topping.add("Red Pepper");
	}
}