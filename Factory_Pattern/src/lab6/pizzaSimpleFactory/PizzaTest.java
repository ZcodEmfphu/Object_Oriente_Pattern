package lab6.pizzaSimpleFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaTest {

	// We offering for you many pizza as cheese, pepperoni, veggie
	@Test
	public void pizzaTest() {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);

		Pizza pizza1 = pizzaStore.orderPizza("cheese");
		System.out.println("We ordered a " + pizza1.getName() + "\n");

		Pizza pizza2 = pizzaStore.orderPizza("pepperoni");
		System.out.println("We ordered a " + pizza2.getName() + "\n");
		
		Pizza pizza3 = pizzaStore.orderPizza("veggie");
		System.out.println("We ordered a " + pizza3.getName() + "\n");
	}

}
