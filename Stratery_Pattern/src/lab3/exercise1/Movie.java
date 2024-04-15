package lab3.exercise1;


public class Movie {

	private String title;
	private String manufacturer;
	private PriceStratery price;
	private boolean available;

	public Movie(String title, String manufacturer, PriceStratery price) {
		super();
		this.title = title;
		this.manufacturer = manufacturer;
		this.price = price;
		this.available = true;
	}

	public String getTitle() {
		return title;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public boolean isAvailable() {
		return available;
	}

	public PriceStratery getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setPrice(PriceStratery price) {
		this.price = price;
	}

	public double getCharge(int dayRented) {
		return price.getCharge(dayRented);
	}

	public int getFrequentRenterPoint(int dayRented) {
		return price.getFrequentRenterPoint(dayRented);
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", manufacturer=" + manufacturer + ",\nprice=" + price + ", available="
				+ available + "]\n";
	}

}
