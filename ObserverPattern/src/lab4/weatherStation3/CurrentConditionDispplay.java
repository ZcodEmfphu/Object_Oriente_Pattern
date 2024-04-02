package lab4.weatherStation3;

public class CurrentConditionDispplay implements Observer {

	private float temperature;
	private float humidity;
	private Observable observable;

	public CurrentConditionDispplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object object) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	public void display() {
		System.out.println("CurrentConditionDispplay [temperature=" + temperature + ", humidity=" + humidity + "]");
	}
}
