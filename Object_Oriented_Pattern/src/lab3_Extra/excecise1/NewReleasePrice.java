package lab3_Extra.excecise1;

public class NewReleasePrice extends PriceStratery {

	@Override
	public double getCharge(int daysRented) {
		// TODO Auto-generated method stub
		return daysRented * 4000;
	}

	public int getFrequentRenterPoint(int rentDays) {
		if (rentDays > 1) {
			return 1 + 1;
		}
		return 1;
	}

}
