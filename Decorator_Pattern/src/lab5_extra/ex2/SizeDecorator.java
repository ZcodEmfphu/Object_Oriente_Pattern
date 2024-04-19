package lab5_extra.ex2;

public class SizeDecorator implements Pizza {

	protected Pizza pizza;

	public SizeDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription();
	}

}
