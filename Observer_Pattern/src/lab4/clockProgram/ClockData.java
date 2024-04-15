package lab4.clockProgram;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class ClockData implements Subject {

	private int hour;
	private int minute;
	private int second;
	private List<Observer> listObserver = new ArrayList<Observer>();

	public ClockData() {
		updateCurrentTime();
	}

	public void updateCurrentTime() {
		Calendar calendar = new GregorianCalendar();
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		notifyObservers();
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	@Override
	public void addObservers(Observer observer) {
		listObserver.add(observer);

	}

	@Override
	public void removeObservers(Observer observer) {
		listObserver.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : listObserver) {
			observer.update(hour, minute, second);
		}

	}
}
