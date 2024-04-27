package lab6.pizzaFactoryMethod;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		Pizza pizza = null;

		if (item.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (item.equals("pepperoni")) {
			pizza = new NYPepperoniPizza();
		} else if (item.equals("veggie")) {
			pizza = new NYVeggiePizza();
		} else if (item.equals("clam")) {
			pizza = new NYClamPizza();
		}
		return pizza;
	}

}
