package lab6.pizzaAbstractFactory;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Veggie[] createVeggie();

	public Cheese createCheese();

	public Pepperoni createPepperoni();

	public Clams createClams();

}
