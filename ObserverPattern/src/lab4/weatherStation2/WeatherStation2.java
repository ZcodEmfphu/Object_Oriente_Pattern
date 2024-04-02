package lab4.weatherStation2;

public class WeatherStation2 {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDispplay c = new CurrentConditionDispplay(weatherData);
		StatisticDisplay s = new StatisticDisplay(weatherData);
		ForecastDisplay f = new ForecastDisplay(weatherData);
		HeatIndexDispplay h = new HeatIndexDispplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(82, 70, 29.2f);
	}
}
