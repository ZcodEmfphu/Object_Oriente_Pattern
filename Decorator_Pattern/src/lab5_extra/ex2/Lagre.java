package lab5_extra.ex2;

public class Lagre extends SizeDecorator{

	public Lagre(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + 9000;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + "Large pizza, ";
	}

}
