package lab5_extra.ex1;

public class WhippedSCream extends BeverageDecorator {

	public WhippedSCream(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + 0.75;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", WhippedSCream";
	}

}
