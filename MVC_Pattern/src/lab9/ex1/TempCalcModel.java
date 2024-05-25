package lab9.ex1;

public class TempCalcModel implements ITempCalcModel {

	@Override
	public double convertFtoC(double degreesFahrenheit) {
		// TODO Auto-generated method stub
		return (degreesFahrenheit - 32.0) / 9.0 * 5.0;
	}

	@Override
	public double convertCtoF(double degreesCelsius) {
		// TODO Auto-generated method stub
		return degreesCelsius / 5.0 * 9.0 + 32.0;
	}

}
