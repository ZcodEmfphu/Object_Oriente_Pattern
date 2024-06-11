package final2;

public class OverseasTour extends Tour {
	protected String country;
	protected double vinaSurTax;

	public OverseasTour(String name, String description, int day, int basePrice, String country, double vinaSurTax) {
		super(name, description, day, basePrice);
		this.country = country;
		this.vinaSurTax = vinaSurTax;
	}

	@Override
	protected double price() {
		// TODO Auto-generated method stub
		return basePrice + vinaSurTax;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

}
