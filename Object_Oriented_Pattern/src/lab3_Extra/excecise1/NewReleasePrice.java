package lab3_Extra.excecise1;

public class NewReleasePrice implements PriceStratery {

	@Override
	public double getCharge(int daysRented) {
		// TODO Auto-generated method stub
		return daysRented * 4000;
	}

}
