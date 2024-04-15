package lab4.weatherStation1;

public class StatisticDisplay {

	private float avgTemp;
	private float minTemp;
	private float maxTemp;
	private float tempSum = 0;
	private int num = 0;
	private WeatherData weatherData;

	public StatisticDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.setStatisticDisplay(this);
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
