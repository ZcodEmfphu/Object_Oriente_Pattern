package lab5.Ex2;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " ,Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.20 + beverage.cost();
	}

}
