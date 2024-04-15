package lab4.weatherStation1;

public class CurrentConditionDispplay {

	private float temperature;
	private float humidity;

	private WeatherData weatherData;

	public CurrentConditionDispplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.setConditionDispplay(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("CurrentConditionDispplay [temperature=" + temperature + ", humidity=" + humidity + "]");
	}

}
