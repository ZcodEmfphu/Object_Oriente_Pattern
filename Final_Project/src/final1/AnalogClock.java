package final1;

public class AnalogClock implements Observer {

	private int h, m, s;
	private ClockTime clockTime;

	public AnalogClock(ClockTime clockTime) {
		// TODO Auto-generated constructor stub
		this.clockTime = clockTime;
		clockTime.register(this); // this is observer method

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		h = this.clockTime.getHour();
		m = this.clockTime.getMinute();
		s = this.clockTime.getSecond();
		noti();

	}

	@Override
	public void noti() {
		// TODO Auto-generated method stub

	}

	public int getH() {
		return h;
	}

	public int getM() {
		return m;
	}

	public int getS() {
		return s;
	}

}
