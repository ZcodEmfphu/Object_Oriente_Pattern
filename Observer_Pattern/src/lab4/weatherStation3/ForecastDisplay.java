package lab4.weatherStation3;

public class ForecastDisplay implements Observer {

	private float currentPresure = 29.92f;
	private float lassPresure;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object object) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			lassPresure = currentPresure;
			currentPresure = weatherData.getPressure();
			display();
		}
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
