package lab4.weatherStation3;

public class StatisticDisplay implements Observer {

	private float minTemp;
	private float maxTemp;
	private float tempSum = 0;
	private int num = 0;

	public StatisticDisplay(Observable observalbe) {
		observalbe.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object object) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			float temp = weatherData.getTemperature();
			tempSum += temp;
			num++;
			if (temp < minTemp)
				minTemp = temp;
			if (temp > maxTemp)
				maxTemp = temp;
			display();
		}
	}

	public void display() {
		System.out.println(
				"StatisticDisplay [avgTemp=" + tempSum / num + ", minTemp=" + minTemp + ", maxTemp=" + maxTemp + "]");
	}
}
