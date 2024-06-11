package lab4.weatherStation2;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPresure = 29.92f;
	private float lassPresure;
	private Subject weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		lassPresure = currentPresure;
		currentPresure = pressure;
		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPresure > lassPresure)
			System.out.println("Hot weather");
		if (currentPresure == lassPresure)
			System.out.println("Nomal weather");
		if (currentPresure < lassPresure)
			System.out.println("Cool weather");
	}

}
