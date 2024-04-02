package lab4.weatherStation3;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

	private List<Observer> observers = new ArrayList<>();
	private boolean changed = false;

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this, null);
		}
	}

	protected void setChanged() {
		changed = true;
	}

}
