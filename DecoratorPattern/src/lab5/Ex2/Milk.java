package lab5.Ex2;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " ,Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.10 + beverage.cost();
	}

}
