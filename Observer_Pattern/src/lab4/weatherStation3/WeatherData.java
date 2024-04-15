package lab4.weatherStation3;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
	}

	private void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
		System.out.println("-------------------------------------------------------------");
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
