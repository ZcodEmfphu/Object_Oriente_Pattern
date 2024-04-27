package lab6.pizzaAbstractFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new ManinaraSauce();
	}

	@Override
	public Veggie[] createVeggie() {
		// TODO Auto-generated method stub
		Veggie[] veggies = { new RedPepper() };
		return veggies;
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		// TODO Auto-generated method stub
		return new FreshClams();
	}

}
