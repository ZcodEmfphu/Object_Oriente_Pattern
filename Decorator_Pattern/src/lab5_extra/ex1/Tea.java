package lab5_extra.ex1;

public class Tea implements Beverage {
	private String description;

	public Tea() {
		super();
		this.description = "Tea: ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 2.0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

}
