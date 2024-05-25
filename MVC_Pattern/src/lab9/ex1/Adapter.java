package lab9.ex1;

public class Adapter implements IModelAdapter {

	private ITempCalcModel tempCalcModel;

	public Adapter(ITempCalcModel tempCalcModel) {
		super();
		this.tempCalcModel = tempCalcModel;
	}

	@Override
	public double FtoC(double degreesFahrenheit) {
		// TODO Auto-generated method stub
		return tempCalcModel.convertFtoC(degreesFahrenheit);
	}

	@Override
	public double CtoF(double degreesCelsius) {
		// TODO Auto-generated method stub
		return tempCalcModel.convertCtoF(degreesCelsius);
	}
}
