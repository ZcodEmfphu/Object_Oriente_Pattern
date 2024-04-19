package lab5_extra.ex1;

public class Coffee implements Beverage {

	private String description;

	public Coffee() {
		super();
		this.description = "Coffee: ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 2.5;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

}
