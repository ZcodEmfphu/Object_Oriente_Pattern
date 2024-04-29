package lab6.ex2;


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
