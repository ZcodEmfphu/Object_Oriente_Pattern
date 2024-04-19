package lab5_extra.ex2;

public class Medium extends SizeDecorator {

	public Medium(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + 7000;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + "Medium pizza, ";
	}

}
