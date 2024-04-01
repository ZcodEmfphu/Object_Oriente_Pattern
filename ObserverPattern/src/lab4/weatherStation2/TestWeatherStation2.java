package lab4.weatherStation2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestWeatherStation2 {

	@Test
	void testWeatherStation() {
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
