package final2;

public class DomesticTour extends Tour {

	public DomesticTour(String name, String description, int day, int basePrice) {
		super(name, description, day, basePrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double price() {
		// TODO Auto-generated method stub
		return basePrice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

}
