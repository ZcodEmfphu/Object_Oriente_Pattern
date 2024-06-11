package final1;

public class ClockCenter {

	public static void main(String[] args) {
		ClockTime clockTime = new ClockTimer();

		AnalogClock analogClock = new AnalogClock(clockTime);
		AnalogGUI analogGUI = new AnalogGUI(analogClock);

		DigitalClock digitalClock = new DigitalClock(clockTime);
		DigitalGUI digitalGUI = new DigitalGUI(digitalClock);
	}
}
