package lab5.ex2;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " ,Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.15 + beverage.cost();
	}

}
