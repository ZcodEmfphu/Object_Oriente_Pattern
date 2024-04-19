package lab5_extra.ex2;

public class ToppingDecorator implements Pizza {

	protected Pizza pizza;
	protected double cost;
	protected String description;

	public ToppingDecorator(Pizza pizza, double cost, String description) {
		super();
		this.pizza = pizza;
		this.cost = cost;
		this.description = description;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + description;
	}

}
