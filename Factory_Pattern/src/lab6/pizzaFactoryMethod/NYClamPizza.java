package lab6.pizzaFactoryMethod;

public class NYClamPizza extends Pizza {
	
	public NYClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		topping.add("Grated Reggiano Cheese");
		topping.add("Fresh Clams from Long Island Sound");
	}
}