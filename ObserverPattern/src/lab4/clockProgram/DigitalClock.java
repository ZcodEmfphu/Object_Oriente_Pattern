package lab4.clockProgram;

public class DigitalClock implements Observer, DisplayClock {
	private ClockData subject;

	public DigitalClock(ClockData subject) {
		this.subject = subject;
		subject.addObservers(this);
	}

	@Override
	public void update(int hour, int minute, int second) {
		display(hour, minute, second);
	}

	@Override
	public void display(int hour, int minute, int second) {
		System.out.printf("Digital: %02d:%02d:%02d%n", hour, minute, second);
	}
}
