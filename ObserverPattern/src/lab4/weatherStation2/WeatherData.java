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

	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
		System.out.println("-------------------------------------------------------------");
	}

	@Override
	public void registerObserver(Observer observer) {
		observersList.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observersList.remove(observer);

	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observersList) {
			observer.update(temperature, humidity, pressure);
		}

	}
}
