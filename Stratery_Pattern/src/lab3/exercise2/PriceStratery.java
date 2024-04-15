package lab3.exercise2;

public abstract class PriceStratery {

	public static final PriceStratery REGULAR = new RegularPrice();
	public static final PriceStratery CHILDRENS = new ChildrensPrice();
	public static final PriceStratery NEW_RELEASE = new NewReleasePrice();
	public static final PriceStratery SERIAL = new SerialPrice();

	abstract public double getCharge(int daysRented);

	public int getFrequentRenterPoint(int rentDays) {
		return 1;
	}

}
