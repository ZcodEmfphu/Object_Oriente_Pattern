package lab6.pizzaAbstractFactory;

public class VeggiePizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggie = ingredientFactory.createVeggie();
	}

}
