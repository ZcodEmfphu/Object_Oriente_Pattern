package lab3_Extra.excecise1;

public class ChildrensPrice extends PriceStratery {

	@Override
	public double getCharge(int daysRented) {
		// TODO Auto-generated method stub
		double result = 2500;
		if (daysRented > 33) {
			return result + (daysRented - 3) * 1500;
		}
		return result;
	}

	public static void main(String[] args) {
		ChildrensPrice c = new ChildrensPrice();
		System.out.println(c.getCharge(3));
	}

}
