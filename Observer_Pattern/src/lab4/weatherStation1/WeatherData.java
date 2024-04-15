package lab4.weatherStation1;

public class WeatherData {

	private float temperature;
	private float humidity;
	private float pressure;
	private CurrentConditionDispplay conditionDispplay;
	private ForecastDisplay forecastDisplay;
	private StatisticDisplay statisticDisplay;

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

	public CurrentConditionDispplay getConditionDispplay() {
		return conditionDispplay;
	}

	public void setConditionDispplay(CurrentConditionDispplay conditionDispplay) {
		this.conditionDispplay = conditionDispplay;
	}

	public ForecastDisplay getForecastDisplay() {
		return forecastDisplay;
	}

	public void setForecastDisplay(ForecastDisplay forecastDisplay) {
		this.forecastDisplay = forecastDisplay;
	}

	public StatisticDisplay getStatisticDisplay() {
		return statisticDisplay;
	}

	public void setStatisticDisplay(StatisticDisplay statisticDisplay) {
		this.statisticDisplay = statisticDisplay;
	}

	public void measurementsChanged() {
		float temperature = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		conditionDispplay.update(temperature, humidity, pressure);
		forecastDisplay.update(temperature, humidity, pressure);
		statisticDisplay.update(temperature, humidity, pressure);
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
		System.out.println("-------------------------------------------------------------");
	}
}
