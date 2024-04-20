package lab6.pizzaFactoryMethod;

public class ChicagoClamPizza extends Pizza {
	
	public ChicagoClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		topping.add("Grated Reggiano Cheese");
		topping.add("Fresh Clams from Long Island Sound");
	}
}