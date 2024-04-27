package lab6.pizzaFactoryMethod;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		Pizza pizza = null;

		if (item.equals("cheese")) {
			pizza = new ChicagoCheesePizza();
		} else if (item.equals("pepperoni")) {
			pizza = new ChicagoPepperoniPizza();
		} else if (item.equals("veggie")) {
			pizza = new ChicagoVeggiePizza();
		} else if (item.equals("clam")) {
			pizza = new ChicagoClamPizza();
		}
		return pizza;
	}

}
