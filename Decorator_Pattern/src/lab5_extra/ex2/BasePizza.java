package lab5_extra.ex2;

public class BasePizza implements Pizza {

	private double cost;
	private String description;

	public BasePizza() {
		super();
		this.cost = 30000.0;
		this.description = "Pizza: ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

}
