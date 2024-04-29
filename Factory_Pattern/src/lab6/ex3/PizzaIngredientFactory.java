package lab6.ex3;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Veggie[] createVeggie();

	public Cheese createCheese();

	public Pepperoni createPepperoni();

	public Clams createClams();

}
