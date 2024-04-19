package lab5_extra.ex2;

import org.junit.jupiter.api.Test;

class PizzaOrderingSystem {

	@Test
	public void pizzaOrderingSystem() {

		Pizza pizza1 = new BasePizza();
		pizza1 = new Small(pizza1);
		pizza1 = new Margherita(pizza1);
		pizza1 = new Mushrooms(pizza1);

		Pizza pizza2 = new BasePizza();
		pizza2 = new Medium(pizza2);
		pizza2 = new Pepperoni(pizza2);
		pizza2 = new Mushrooms(pizza2);
		pizza2 = new BellPeppers(pizza2);

		Pizza pizza3 = new BasePizza();
		pizza3 = new Lagre(pizza3);
		pizza3 = new Margherita(pizza3);
		pizza3 = new Pepperoni(pizza3);
		pizza3 = new Mushrooms(pizza3);
		pizza3 = new BellPeppers(pizza3);
		pizza3 = new Onions(pizza3);

		System.out.println(pizza1.getDescription() + "Price: " + pizza1.getCost());
		System.out.println(pizza2.getDescription() + "Price: " + pizza2.getCost());
		System.out.println(pizza3.getDescription() + "Price: " + pizza3.getCost());
	}

}
