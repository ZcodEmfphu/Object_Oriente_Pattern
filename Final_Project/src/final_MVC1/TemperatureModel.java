package final_MVC1;

public class TemperatureModel {

	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
}
