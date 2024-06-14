package final_MVC1;

import javax.swing.JLabel;

public class TemperatureController implements ControllerInterface {
	private TemperatureModel model;
	private TemperatureView view;

	public TemperatureController(TemperatureModel model) {
		this.model = model;
		this.view = new TemperatureView(this, model);
	}

	public void celsiusToFahrenheit(double celsius) {
		double res = model.celsiusToFahrenheit(celsius);
		view.updateResultText("Kết quả là " + res + " °F");
	}

	public void fahrenheitToCelsius(double fahrenheit) {
		double res = model.fahrenheitToCelsius(fahrenheit);
		view.updateResultText("Kết quả là " + res + " °C");
	}

	public static void main(String[] args) {
		TemperatureModel model = new TemperatureModel();
		TemperatureController controller = new TemperatureController(model);
		// Example conversions
//		controller.celsiusToFahrenheit(25);
//		controller.fahrenheitToCelsius(77);
	}
}