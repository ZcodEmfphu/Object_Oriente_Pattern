package lab9.ex1;

public class TempCalcApp {

	public static void main(String[] args) {
		ITempCalcModel tempCalcModel = new TempCalcModel();

		IModelAdapter adapter = new Adapter(tempCalcModel);

		double tempF = 100.0;
		double tempC = adapter.FtoC(tempF);
		System.out.println(tempF + " độ Fahrenheit bằng " + tempC + " độ Celsius.");

		double tempC2 = 37.0;
		double tempF2 = adapter.CtoF(tempC2);
		System.out.println(tempC2 + " độ Celsius bằng " + tempF2 + " độ Fahrenheit.");
	}

}
