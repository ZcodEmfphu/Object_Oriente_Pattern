package lab4.weatherStation1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestWeatherStation {

	@Test
	void testWeatherStation() {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDispplay c = new CurrentConditionDispplay(weatherData);
		StatisticDisplay s = new StatisticDisplay(weatherData);
		ForecastDisplay f = new ForecastDisplay(weatherData);

//		c.update(20, 10, 30);
//
//		s.update(5, 20, 10);
//		s.update(2, 20, 10);
//
//		f.update(30, 20, 10);
//		f.update(35, 20, 11);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(82, 70, 29.2f);

	}

}
