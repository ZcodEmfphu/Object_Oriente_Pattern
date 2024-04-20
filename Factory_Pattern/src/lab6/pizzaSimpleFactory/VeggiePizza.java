package lab6.pizzaSimpleFactory;

public class VeggiePizza extends Pizza {
	
	public VeggiePizza() {
		name = "Veggie Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		topping.add("Shredded mozzarella");
		topping.add("Grated parmesan");
		topping.add("Diced onion");
		topping.add("Sliced mushrooms");
		topping.add("Sliced red pepper");
		topping.add("Sliced black olives");
	}
}