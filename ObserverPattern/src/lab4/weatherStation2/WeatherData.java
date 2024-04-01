package lab4.weatherStation2;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private float temperature;
	private float humidity;
	private float pressure;
	private ArrayList<Observer> observersList;

	public WeatherData() {
		observersList = new ArrayList<Observer>();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public void measurementsChanged() {
		float temperature = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();

		new CurrentConditionDispplay(this).update(temperature, humidity, pressure);
		new ForecastDisplay(this).update(temperature, humidity, pressure);
		new StatisticDisplay(this).update(temperature, humidity, pressure);
		new HeatIndexDispplay(this).update(temperature, humidity, pressure);

	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
		System.out.println("-------------------------------------------------------------");
	}

	@Override
	public void registerObseever(Observer observer) {
		observersList.add(observer);

	}

	@Override
	public void removeObseever(Observer observer) {
		observersList.remove(observer);

	}

	@Override
	public void notifyObseever() {
		System.out.println("Notify!!");

	}
}
