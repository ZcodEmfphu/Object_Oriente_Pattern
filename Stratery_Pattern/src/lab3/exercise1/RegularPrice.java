package lab3.exercise1;

public class RegularPrice extends PriceStratery {

	@Override
	public double getCharge(int daysRented) {
		// TODO Auto-generated method stub
		int result = 3000;
		if (daysRented > 2) {
			return result + (daysRented - 2) * 1000;

		}
		return result;
	}

	public static void main(String[] args) {
		RegularPrice r = new RegularPrice();
		System.out.println(r.getCharge(5));
	}
}
