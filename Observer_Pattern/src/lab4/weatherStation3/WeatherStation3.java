package lab4.weatherStation3;

public class WeatherStation3 {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDispplay c = new CurrentConditionDispplay(weatherData);
		StatisticDisplay s = new StatisticDisplay(weatherData);
		ForecastDisplay f = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(82, 70, 29.2f);
	}
}
