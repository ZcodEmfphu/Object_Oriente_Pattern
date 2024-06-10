package final1;

public interface ClockTime {

	public int getHour();

	public int getMinute();

	public int getSecond();

	public void tick();

	public void register(Observer observer);

	public void unRegister(Observer observer);

	public void noti();
}
