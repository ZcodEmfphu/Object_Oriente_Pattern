package lab6.pizzaSimpleFactory;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		name = "Clam Pizza";
		dough = "Thin crust";
		sauce = "White garlic sauce";
		topping.add("Clams");
		topping.add("Grated parmesan cheese");
	}
}