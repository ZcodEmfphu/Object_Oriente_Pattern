package lab5_extra.ex1;

public class BeverageDecorator implements Beverage {
	protected Beverage beverage;

	public BeverageDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription();
	}

}
