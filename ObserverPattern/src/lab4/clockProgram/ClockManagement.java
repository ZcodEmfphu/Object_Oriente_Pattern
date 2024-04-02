package lab4.clockProgram;

public class ClockManagement {

	public static void main(String[] args) {
		ClockData clockData = new ClockData();

		DigitalClock dig = new DigitalClock(clockData);
		AnalogClock anl = new AnalogClock(clockData);

		clockData.setTime(13, 30, 10);
		clockData.setTime(14, 30, 10);
	}

}
