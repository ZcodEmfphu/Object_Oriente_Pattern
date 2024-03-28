package lab3_Extra.excecise1;

public class SerialPrice extends PriceStratery {

	@Override
	public double getCharge(int daysRented) {
		// TODO Auto-generated method stub
		double res = 2000.0;
		if (daysRented > 2) {
			res += (daysRented - 2) * 1000;
		}
		return res;
	}

}
