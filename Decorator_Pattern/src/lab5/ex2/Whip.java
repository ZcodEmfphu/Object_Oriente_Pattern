package lab5.ex2;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " ,Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.10 + beverage.cost();
	}

}
