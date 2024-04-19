package lab5_extra.ex2;

public class Small extends SizeDecorator {

	public Small(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + "Small pizza, ";
	}
}
