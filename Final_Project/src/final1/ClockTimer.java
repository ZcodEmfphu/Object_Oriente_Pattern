package final1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ClockTimer implements ClockTime {

	private int h, m, s;
	private List<Observer> listObserver;

	public ClockTimer() {
		super();
		this.listObserver = new ArrayList<Observer>();
		tick();
	}

	@Override
	public int getHour() {
		// TODO Auto-generated method stub
		return h;
	}

	@Override
	public int getMinute() {
		// TODO Auto-generated method stub
		return m;
	}

	@Override
	public int getSecond() {
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Calendar calendar = Calendar.getInstance();
				h = calendar.get(Calendar.HOUR);
				m = calendar.get(calendar.MINUTE);
				s = calendar.get(calendar.SECOND);
				noti();
			}
		}, 0, 1000);
	}

	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		listObserver.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		// TODO Auto-generated method stub
		listObserver.remove(observer);
	}

	@Override
	public void noti() {
		// TODO Auto-generated method stub
		for (Observer item : listObserver) {
			item.update();
		}
	}

}
