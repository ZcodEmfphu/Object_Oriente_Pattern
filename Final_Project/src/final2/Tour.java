package final2;

public abstract class Tour {

	protected String name;
	protected String description;
	protected int day;
	protected int basePrice;

	public Tour(String name, String description, int day, int basePrice) {
		super();
		this.name = name;
		this.description = description;
		this.day = day;
		this.basePrice = basePrice;
	}

	public Tour() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getDay() {
		return day;
	}

	public int getBasePrice() {
		return basePrice;
	}

	protected abstract double price();

}
