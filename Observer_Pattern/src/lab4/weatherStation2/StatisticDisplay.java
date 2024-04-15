package lab4.weatherStation2;

public class StatisticDisplay implements Observer, DisplayElement {

	private float avgTemp;
	private float minTemp;
	private float maxTemp;
	private float tempSum = 0;
	private int num = 0;
	private Subject weatherData;

	public StatisticDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
//		weatherData.notifyObseever();
	}

	public void update(float temperature, float humidity, float pressure) {

		tempSum += temperature;
		num++;

		if (temperature < minTemp)
			minTemp = temperature;
		if (temperature > maxTemp)
			maxTemp = temperature;
		display();
	}

	public void display() {
		System.out.println(
				"StatisticDisplay [avgTemp=" + tempSum / num + ", minTemp=" + minTemp + ", maxTemp=" + maxTemp + "]");
	}

}
