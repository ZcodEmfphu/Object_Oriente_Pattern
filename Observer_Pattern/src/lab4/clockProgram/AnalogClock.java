package lab4.clockProgram;

public class AnalogClock implements Observer, DisplayClock {
	private int hour;
	private int minute;
	private int second;

	public AnalogClock(ClockData clockData) {
		clockData.addObservers(this);
	}

	@Override
	public void update(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		display(hour, minute, second);
	}

	@Override
	public void display(int hour, int minute, int second) {
		System.out.printf("Analog Clock: %02d:%02d:%02d%n", hour, minute, second);
	}
}
